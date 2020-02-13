package com.hospital.clinichub.repositories;

import com.hospital.clinichub.models.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
}
