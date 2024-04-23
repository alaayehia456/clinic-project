package com.clinic.Service;

import com.clinic.Model.Dto.OwnerDto;
import com.clinic.Model.Dto.common.BaseSearchForm;
import com.clinic.Model.Owner;
import com.clinic.dao.GenericRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService extends BaseService<Owner, OwnerDto, BaseSearchForm>{
    public OwnerService(GenericRepository<Owner> genericRepository) {
        super(genericRepository);
    }

    @Override
    protected Owner toEntity(OwnerDto object) {
        return null;
    }

    @Override
    protected OwnerDto toDto(Owner object) {
        return null;
    }

    @Override
    protected List<OwnerDto> toListOfDto(List<Owner> list) {
        return null;
    }

    @Override
    protected Specification<Owner> buildSpecification(BaseSearchForm searchParams) {
        return null;
    }
}
