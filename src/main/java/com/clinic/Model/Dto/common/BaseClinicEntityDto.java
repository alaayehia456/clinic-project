package com.clinic.Model.Dto.common;

import com.clinic.enums.Gender;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BaseClinicEntityDto extends BaseEntityDto{
    private Gender gender;
}
