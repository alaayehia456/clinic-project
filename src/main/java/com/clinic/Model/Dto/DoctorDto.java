package com.clinic.Model.Dto;

import com.clinic.Model.Clinic;
import com.clinic.Model.Dto.common.BaseClinicEntityDto;
import com.clinic.Model.common.BaseClinicEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoctorDto extends BaseClinicEntityDto {

    @NotNull(message = "address can not be null")
    @NotBlank
    private String address;

    @NotNull(message = "phone Number can not be null")
    @NotBlank
    private String phoneNumber;

    private ClinicDto clinic;
}
