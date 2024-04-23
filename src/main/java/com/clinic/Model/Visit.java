package com.clinic.Model;

import com.clinic.Model.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "VISIT")
public class Visit extends BaseEntity {

    private Date date;

    @ManyToOne
    @JoinColumn(name = "CLINIC_ID",insertable = false,updatable = false)
    private Clinic clinic;

    @Column(name = "CLINIC_ID")
    private Long clinicId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID",insertable = false,updatable = false)
    private Doctor doctor;

    @Column(name = "DOCTOR_ID")
    private Long doctorId;

    @ManyToOne
    @JoinColumn(name = "PET_ID",insertable = false,updatable = false)
    private Pet pet;

    @Column(name = "PET_ID")
    private Long petId;
}
