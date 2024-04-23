package com.clinic.Model.Mapper;

import com.clinic.Model.Clinic;
import com.clinic.Model.Dto.ClinicDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClinicMapper {

    Clinic toEntity(ClinicDto dto);

    ClinicDto toDto(Clinic clinic);

    List<ClinicDto> toListOfDto(List<Clinic> clinics);
}
