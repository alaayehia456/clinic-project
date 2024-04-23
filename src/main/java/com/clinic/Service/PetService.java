package com.clinic.Service;

import com.clinic.Model.Dto.PetDto;
import com.clinic.Model.Dto.common.BaseSearchForm;
import com.clinic.Model.Mapper.PetMapper;
import com.clinic.Model.Pet;
import com.clinic.dao.GenericRepository;
import com.clinic.dao.PetRepo;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService extends BaseService<Pet, PetDto, BaseSearchForm>{

    private final PetMapper petMapper;

    private final PetRepo petRepo;
    public PetService(GenericRepository<Pet> genericRepository, PetMapper petMapper, PetRepo petRepo) {
        super(genericRepository);
        this.petMapper = petMapper;
        this.petRepo = petRepo;
    }

    public List<PetDto> getPetByOwnerId(Long id){
        return !CollectionUtils.isEmpty(petRepo.findByOwnerId(id)) ? toListOfDto(petRepo.findByOwnerId(id))
                : new ArrayList<>();
    }

    @Override
    protected Pet toEntity(PetDto object) {
        return petMapper.toEntity(object);
    }

    @Override
    protected PetDto toDto(Pet object) {
        return petMapper.toDto(object);
    }

    @Override
    protected List<PetDto> toListOfDto(List<Pet> list) {
        return petMapper.toListOfDto(list);
    }

    @Override
    protected Specification<Pet> buildSpecification(BaseSearchForm searchParams) {
        return null;
    }
}
