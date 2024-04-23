package com.clinic.Model.Mapper;

import com.clinic.Model.Dto.PetDto;
import com.clinic.Model.Pet;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PetMapper {

    Pet toEntity(PetDto petDto);

    PetDto toDto(Pet pet);

    List<PetDto> toListOfDto(List<Pet> pets);
}
