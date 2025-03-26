package com.HealthOn.repo;

import com.HealthOn.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
