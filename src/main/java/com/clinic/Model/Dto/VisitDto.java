package com.clinic.Model.Dto;

import com.clinic.Model.Clinic;
import com.clinic.Model.Doctor;
import com.clinic.Model.Dto.common.BaseEntityDto;
import com.clinic.Model.Pet;
import com.clinic.Model.common.BaseEntity;
import com.clinic.common.serialize.JsonDateDeserializer;
import com.clinic.common.serialize.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisitDto extends BaseEntityDto {

    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date date;

    @ReadOnlyProperty
    private ClinicDto clinic;

    private Long clinicId;

    @ReadOnlyProperty
    private DoctorDto doctor;

    private Long doctorId;

    @ReadOnlyProperty
    private Pet pet;
    private Long petId;
}
