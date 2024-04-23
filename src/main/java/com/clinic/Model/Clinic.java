package com.clinic.Model;

import com.clinic.Model.common.BaseClinicEntity;
import com.clinic.Model.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.DayOfWeek;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLINIC")
public class Clinic extends BaseEntity {

    private String address;

    @OneToOne
    @JoinColumn(name = "PHOTO_ID",insertable = false,updatable = false)
    private Attachment photo;

    @Column(name = "PHOTO_ID")
    private Long photoId;

    @OneToOne(mappedBy = "clinic")
    private Doctor doctor;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "FROM_DAY")
    private DayOfWeek fromDay;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "TO_DAY")
    private DayOfWeek toDay;

    private String email;
}
