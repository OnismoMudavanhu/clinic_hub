package com.hospital.clinichub.repositories;

import com.hospital.clinichub.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
