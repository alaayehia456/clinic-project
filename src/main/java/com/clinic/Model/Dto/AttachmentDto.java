package com.clinic.Model.Dto;

import com.clinic.Model.Doctor;
import com.clinic.Model.Dto.common.BaseClinicEntityDto;
import com.clinic.Model.Owner;
import com.clinic.Model.Pet;
import com.clinic.Model.common.BaseEntity;
import com.clinic.enums.AttachmentType;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachmentDto extends BaseClinicEntityDto {

    private byte[] bytes;

    private String fileName;

    @ReadOnlyProperty
    private PetDto pet;

    private Long petId;

    @ReadOnlyProperty
    private DoctorDto doctor;

    private Long doctorId;

    private AttachmentType type;

    @ReadOnlyProperty
    private OwnerDto owner;

    private Long ownerId;
}
