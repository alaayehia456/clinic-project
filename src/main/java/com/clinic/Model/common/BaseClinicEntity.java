package com.clinic.Model.common;

import com.clinic.enums.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alaa Yeia
 * @implNote this  entity for shared attributes in every entity in clinic
 */
@Setter
@Getter
@MappedSuperclass
public class BaseClinicEntity extends BaseEntity {



    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
}
