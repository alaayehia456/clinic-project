package com.clinic.Model.Mapper;

import com.clinic.Model.Dto.VisitDto;
import com.clinic.Model.Visit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VisitMapper {
    VisitDto toDto(Visit visit);

    Visit toEntity(VisitDto dto);

    List<VisitDto> toListOfDto(List<Visit> visits);
}
