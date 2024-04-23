package com.clinic.Model;

import com.clinic.Model.common.BaseClinicEntity;
import com.clinic.enums.AnimalType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "PET")
@AllArgsConstructor
@NoArgsConstructor
public class Pet extends BaseClinicEntity{

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "TYPE")
    private AnimalType type;

    private Double weight;

    @OneToMany(mappedBy = "pet")
    private List<Attachment> photos;

    @ManyToOne
    @JoinColumn(name = "OWNER_ID",insertable = false,updatable = false)
    private Owner owner;

    @Column(name = "OWNER_ID")
    private Long ownerId;
}
