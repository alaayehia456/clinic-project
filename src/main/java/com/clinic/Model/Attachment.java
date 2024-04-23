package com.clinic.Model;

import com.clinic.Model.common.BaseEntity;
import com.clinic.enums.AttachmentType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ATTACHMENT")
@AllArgsConstructor
@NoArgsConstructor
public class Attachment extends BaseEntity {

    @Lob
    private byte[] bytes;

    @Column(name = "FILE_NAME")
    private String fileName;

    @ManyToOne
    @JoinColumn(name = "PET_ID",updatable = false,insertable = false)
    private Pet pet;

    @Column(name = "PET_ID")
    private Long petId;

    @ManyToOne
    @JoinColumn(name = "DOCTOR_ID",insertable = false,updatable = false)
    private Doctor doctor;

    @Column(name = "DOCTOR_ID")
    private Long doctorId;

    @Column(name = "TYPE")
    private AttachmentType type;

    @OneToOne
    @JoinColumn(name = "OWNER_ID",updatable = false,insertable = false)
    private Owner owner;

    @Column(name = "OWNER_ID")
    private Long ownerId;
}
