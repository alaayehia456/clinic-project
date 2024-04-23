package com.clinic.Model.Dto.search.form;

import com.clinic.Model.Dto.common.BaseSearchForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClinicSearch extends BaseSearchForm {
    private String address;

    private String phoneNumber;
}
