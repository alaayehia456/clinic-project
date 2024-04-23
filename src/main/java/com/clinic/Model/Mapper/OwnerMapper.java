package com.clinic.Model.Mapper;

import com.clinic.Model.Dto.OwnerDto;
import com.clinic.Model.Owner;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    OwnerDto toDto(Owner owner);

    Owner toEntity(OwnerDto dto);

    List<OwnerDto> listOfDto(List<Owner> owners);
}
