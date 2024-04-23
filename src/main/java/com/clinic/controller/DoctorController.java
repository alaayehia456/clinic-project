package com.clinic.controller;

import com.clinic.Model.Dto.DoctorDto;
import com.clinic.Model.Dto.PetDto;
import com.clinic.Service.DoctorService;
import com.clinic.Service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor
public class DoctorController{

    private final DoctorService doctorService;

    @GetMapping("/{id}")
    public ResponseEntity<DoctorDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(doctorService.getById(id));
    }

    @GetMapping("/by-clinic/{id}")
    public ResponseEntity<List<DoctorDto>> getPetByOwnerId(@PathVariable Long id){
        return ResponseEntity.ok(doctorService.getDoctorByClinicId(id));
    }

    @PutMapping("/assign-de-assign-clinic/{doctorId}")
    public ResponseEntity<DoctorDto> assignOrDeAssignDoctorToClinic(@PathVariable Long doctorId,@RequestParam Long clinicId){
        return ResponseEntity.ok(doctorService.assignOrDeAssignDoctorToClinic(doctorId,clinicId));
    }
}
