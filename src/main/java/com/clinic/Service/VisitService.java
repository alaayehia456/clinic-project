package com.clinic.Service;

import com.clinic.Model.Dto.VisitDto;
import com.clinic.Model.Dto.common.BaseSearchForm;
import com.clinic.Model.Visit;
import com.clinic.dao.GenericRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitService extends BaseService<Visit, VisitDto, BaseSearchForm>{
    public VisitService(GenericRepository<Visit> genericRepository) {
        super(genericRepository);
    }

    @Override
    protected Visit toEntity(VisitDto object) {
        return null;
    }

    @Override
    protected VisitDto toDto(Visit object) {
        return null;
    }

    @Override
    protected List<VisitDto> toListOfDto(List<Visit> list) {
        return null;
    }

    @Override
    protected Specification<Visit> buildSpecification(BaseSearchForm searchParams) {
        return null;
    }
}
