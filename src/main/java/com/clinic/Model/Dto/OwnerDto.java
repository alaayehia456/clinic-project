package com.clinic.Model.Dto;

import com.clinic.Model.Attachment;
import com.clinic.Model.Dto.common.BaseClinicEntityDto;
import com.clinic.Model.Pet;
import com.clinic.Model.common.BaseClinicEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OwnerDto extends BaseClinicEntityDto {

    private String email;

    private AttachmentDto photo;

    private String address;

    private List<PetDto> pets;
}
