package org.safemed.medsystem.medsystembackend.Treatments.infrastucture.persistence.jpa.repositories;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TreatmentRepository extends JpaRepository<Treatment, Long> {
    boolean existsByTreatmentNameAndPatientId(String treatmentName, Long patientId);
    List<Treatment> findByPatientId(Long patientId);
    List<Treatment> findByDoctorId(Long doctorId);
    Optional<Treatment> findByTreatmentName(String treatmentName);
}