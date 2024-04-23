package com.clinic.Model.Mapper;

import com.clinic.Model.Doctor;
import com.clinic.Model.Dto.DoctorDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DoctorMapper {

    DoctorDto toDto(Doctor doctor);

    Doctor toEntity(DoctorDto dto);

    List<DoctorDto> toListOfDto(List<Doctor>  doctors);
}
