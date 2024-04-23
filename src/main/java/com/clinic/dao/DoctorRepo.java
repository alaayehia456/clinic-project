package com.clinic.dao;

import com.clinic.Model.Doctor;

import java.util.List;

public interface DoctorRepo extends GenericRepository<Doctor>{

    List<Doctor> findByClinicId(Long id);
}
