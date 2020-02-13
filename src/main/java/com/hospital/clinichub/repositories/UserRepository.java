package com.hospital.clinichub.repositories;

import com.hospital.clinichub.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
