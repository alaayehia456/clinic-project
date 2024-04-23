package com.clinic.Model.Mapper;

import com.clinic.Model.Attachment;
import com.clinic.Model.Dto.AttachmentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AttachmentMapper {

    AttachmentDto toDto(Attachment attachment);

    Attachment toEntity(AttachmentDto dto);

    List<AttachmentDto> toListOfDto(List<Attachment> attachments);
}
