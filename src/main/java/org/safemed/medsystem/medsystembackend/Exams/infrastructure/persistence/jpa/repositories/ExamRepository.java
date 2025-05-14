package org.safemed.medsystem.medsystembackend.Exams.infrastructure.persistence.jpa.repositories;

import org.safemed.medsystem.medsystembackend.Exams.domain.model.aggregates.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    List<Exam> findByPatientId(Long patientId);
    List<Exam> findByDoctorId(Long doctorId);
}
