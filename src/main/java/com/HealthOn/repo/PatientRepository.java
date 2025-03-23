package com.HealthOn.repo;

import com.HealthOn.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PatientRepository extends JpaRepository<Patient,String> {
}
