package com.clinic.dao;

import com.clinic.Model.Pet;

import java.util.List;

public interface PetRepo extends GenericRepository<Pet>{

    List<Pet> findByOwnerId(Long id);
}
