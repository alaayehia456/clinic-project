package com.clinic.Service;

import com.clinic.Model.Clinic;
import com.clinic.Model.Dto.ClinicDto;
import com.clinic.Model.Dto.common.BaseSearchForm;
import com.clinic.Model.Dto.search.form.ClinicSearch;
import com.clinic.Model.Mapper.ClinicMapper;
import com.clinic.dao.ClinicRepo;
import com.clinic.dao.GenericRepository;
import com.clinic.dao.Specification.ClinicSpecification;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService extends BaseService<Clinic, ClinicDto, ClinicSearch>{

    private final ClinicMapper clinicMapper;


    public ClinicService(GenericRepository<Clinic> genericRepository, ClinicMapper clinicMapper) {
        super(genericRepository);
        this.clinicMapper = clinicMapper;
    }

    @Override
    protected Clinic toEntity(ClinicDto object) {
        return clinicMapper.toEntity(object);
    }

    @Override
    protected ClinicDto toDto(Clinic object) {
        return clinicMapper.toDto(object);
    }

    @Override
    protected List<ClinicDto> toListOfDto(List<Clinic> list) {
        return clinicMapper.toListOfDto(list);
    }

    @Override
    protected Specification<Clinic> buildSpecification(ClinicSearch searchParams) {
        return ClinicSpecification.search(searchParams);
    }
}
