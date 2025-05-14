package org.safemed.medsystem.medsystembackend.Appointments.Infrastructure.persistance.jpa.repositories;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Aggregates.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findAllByDoctorId(Long doctorId);
    List<Appointment> findAllByPatientId(Long patientId);
    List<Appointment> findAllByDate(LocalDate date);

    boolean existsByDate(LocalDate date);
}
