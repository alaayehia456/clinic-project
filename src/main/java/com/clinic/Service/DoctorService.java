package com.clinic.Service;

import com.clinic.Model.Doctor;
import com.clinic.Model.Dto.DoctorDto;
import com.clinic.Model.Dto.PetDto;
import com.clinic.Model.Dto.common.BaseSearchForm;
import com.clinic.Model.Mapper.DoctorMapper;
import com.clinic.common.BusinessException;
import com.clinic.dao.DoctorRepo;
import com.clinic.dao.GenericRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class DoctorService extends BaseService<Doctor, DoctorDto, BaseSearchForm>{

    private final DoctorMapper doctorMapper;

    private final DoctorRepo doctorRepo;

    public DoctorService(GenericRepository<Doctor> genericRepository, DoctorMapper doctorMapper, DoctorRepo doctorRepo) {
        super(genericRepository);
        this.doctorMapper = doctorMapper;
        this.doctorRepo = doctorRepo;
    }

    @Override
    protected Doctor toEntity(DoctorDto object) {
        return doctorMapper.toEntity(object);
    }

    @Override
    protected DoctorDto toDto(Doctor object) {
        return doctorMapper.toDto(object);
    }

    @Override
    protected List<DoctorDto> toListOfDto(List<Doctor> list) {
        return doctorMapper.toListOfDto(list);
    }

    @Override
    protected Specification<Doctor> buildSpecification(BaseSearchForm searchParams) {
        return null;
    }

    public List<DoctorDto> getDoctorByClinicId(Long id){
        return !CollectionUtils.isEmpty(doctorRepo.findByClinicId(id)) ? toListOfDto(doctorRepo.findByClinicId(id))
                : new ArrayList<>();
    }


    public DoctorDto assignOrDeAssignDoctorToClinic(Long doctorId,Long clinicId){
        Doctor doctor=genericRepository.findById(doctorId).orElseThrow(()->new BusinessException("NOT_FOUNDED"));
        if(Objects.isNull(clinicId)){
            doctor.setClinicId(null);
            genericRepository.save(doctor);
        }else {
            doctor.setClinicId(clinicId);
            genericRepository.save(doctor);
        }
        return toDto(doctor);
    }

}
