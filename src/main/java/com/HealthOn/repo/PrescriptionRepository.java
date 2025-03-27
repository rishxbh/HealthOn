package com.HealthOn.repo;

import com.HealthOn.model.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
