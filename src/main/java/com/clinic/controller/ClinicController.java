package com.clinic.controller;

import com.clinic.Model.Dto.ClinicDto;
import com.clinic.Model.Dto.DoctorDto;
import com.clinic.Model.Dto.PageDto;
import com.clinic.Model.Dto.search.form.ClinicSearch;
import com.clinic.Service.ClinicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clinic")
@RequiredArgsConstructor
public class ClinicController {

    private final ClinicService clinicService;

    @GetMapping("/{id}")
    public ResponseEntity<ClinicDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(clinicService.getById(id));
    }

    @PostMapping("/search")
    public ResponseEntity<PageDto> search(@RequestBody ClinicSearch searchForm){
        return ResponseEntity.ok(clinicService.findListWithPagination(searchForm));
    }
}
