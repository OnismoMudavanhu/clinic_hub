package com.hospital.clinichub.repositories;

import com.hospital.clinichub.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
