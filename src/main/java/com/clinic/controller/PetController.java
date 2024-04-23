package com.clinic.controller;

import com.clinic.Model.Dto.PetDto;
import com.clinic.Service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pet")
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;


    @GetMapping("/{id}")
    public ResponseEntity<PetDto> getById(@PathVariable Long id){
        return ResponseEntity.ok(petService.getById(id));
    }

    @GetMapping("/by-owner/{id}")
    public ResponseEntity<List<PetDto>> getPetByOwnerId(@PathVariable Long id){
        return ResponseEntity.ok(petService.getPetByOwnerId(id));
    }

}
