package com.hospital.clinichub.repositories;

import com.hospital.clinichub.models.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
}
