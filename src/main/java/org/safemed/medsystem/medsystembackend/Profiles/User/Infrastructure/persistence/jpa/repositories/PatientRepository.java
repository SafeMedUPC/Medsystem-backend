package org.safemed.medsystem.medsystembackend.Profiles.User.Infrastructure.persistence.jpa.repositories;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}