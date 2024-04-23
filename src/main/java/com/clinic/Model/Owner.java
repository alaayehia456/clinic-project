package com.clinic.Model;

import com.clinic.Model.common.BaseClinicEntity;
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
@Entity
@Table(name = "OWNER")
public class Owner extends BaseClinicEntity {

    private String email;

    @OneToOne(mappedBy = "owner")
    private Attachment photo;

    private String address;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;
}
