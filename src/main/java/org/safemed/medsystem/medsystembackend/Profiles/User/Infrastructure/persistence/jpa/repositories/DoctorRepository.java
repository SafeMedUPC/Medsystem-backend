package org.safemed.medsystem.medsystembackend.Profiles.User.Infrastructure.persistence.jpa.repositories;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Doctor;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.ValueObjects.Specialities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    boolean existsDoctorByLicenceNumber(Integer licenceNumber);
    List<Doctor> findBySpecialities(Specialities speciality);
}