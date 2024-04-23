package com.clinic.Model;

import com.clinic.Model.common.BaseClinicEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "DOCTOR")
@AllArgsConstructor
@NoArgsConstructor
public class Doctor extends BaseClinicEntity {

    private String address;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "CLINIC_ID",updatable = false,insertable = false)
    private Clinic clinic;

    @Column(name = "CLINIC_ID")
    private Long clinicId;
}
