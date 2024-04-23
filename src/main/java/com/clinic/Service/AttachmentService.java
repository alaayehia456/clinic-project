package com.clinic.Service;

import com.clinic.Model.Attachment;
import com.clinic.Model.Dto.AttachmentDto;
import com.clinic.Model.Dto.common.BaseSearchForm;
import com.clinic.dao.GenericRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentService extends BaseService<Attachment, AttachmentDto, BaseSearchForm>{
    public AttachmentService(GenericRepository<Attachment> genericRepository) {
        super(genericRepository);
    }

    @Override
    protected Attachment toEntity(AttachmentDto object) {
        return null;
    }

    @Override
    protected AttachmentDto toDto(Attachment object) {
        return null;
    }

    @Override
    protected List<AttachmentDto> toListOfDto(List<Attachment> list) {
        return null;
    }

    @Override
    protected Specification<Attachment> buildSpecification(BaseSearchForm searchParams) {
        return null;
    }
}
