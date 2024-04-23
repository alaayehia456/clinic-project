package com.clinic.Model.Dto;

import com.clinic.Model.Attachment;
import com.clinic.Model.Doctor;
import com.clinic.Model.Dto.common.BaseClinicEntityDto;
import com.clinic.Model.common.BaseEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.ReadOnlyProperty;

import java.time.DayOfWeek;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClinicDto extends BaseClinicEntityDto {

    private String address;

    @ReadOnlyProperty
    private AttachmentDto photo;

    private Long photoId;

    @ReadOnlyProperty
    private DoctorDto doctor;

    private Long doctorId;

    private DayOfWeek fromDay;

    private DayOfWeek toDay;

    private String email;
}
