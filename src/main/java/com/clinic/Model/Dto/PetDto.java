package com.clinic.Model.Dto;

import com.clinic.Model.Attachment;
import com.clinic.Model.Dto.common.BaseClinicEntityDto;
import com.clinic.Model.Owner;
import com.clinic.Model.common.BaseClinicEntity;
import com.clinic.enums.AnimalType;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PetDto extends BaseClinicEntityDto {


    private Date dateOfBirth;

    private AnimalType type;

    private Double weight;

    private List<AttachmentDto> photos;

    @ReadOnlyProperty
    private OwnerDto owner;

    private Long ownerId;
}
