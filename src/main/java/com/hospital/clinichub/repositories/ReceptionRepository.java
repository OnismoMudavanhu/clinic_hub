package com.hospital.clinichub.repositories;

import com.hospital.clinichub.models.Reception;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptionRepository extends JpaRepository<Reception, Long> {
}
