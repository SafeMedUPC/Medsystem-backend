package org.safemed.medsystem.medsystembackend.Appointments.Infrastructure.persistance.jpa.repositories;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Entities.Specialty;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.ValueObjects.Specialties;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {
    boolean existsByName(Specialties name);
    Optional<Specialty> findByName(Specialties name);
}
