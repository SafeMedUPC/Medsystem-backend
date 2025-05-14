package org.safemed.medsystem.medsystembackend.Appointments.Application.QueryServices;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Aggregates.Appointment;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Queries.*;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Services.AppointmentQueryService;
import org.safemed.medsystem.medsystembackend.Appointments.Infrastructure.persistance.jpa.repositories.AppointmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentQueryServiceImpl implements AppointmentQueryService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentQueryServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public Optional<Appointment> handle(GetAppointmentByIdQuery query) {
        return appointmentRepository.findById(query.id());
    }

    @Override
    public List<Appointment> handle(GetAllAppointmentsByDoctorIdQuery query) {
        return appointmentRepository.findAllByDoctorId(query.doctorId());
    }

    @Override
    public List<Appointment> handle(GetAllAppointmentsByPatientIdQuery query) {
        return appointmentRepository.findAllByPatientId(query.patientId());
    }

    @Override
    public List<Appointment> handle(GetAppointmentsByDateQuery query) {
        return appointmentRepository.findAllByDate(query.date());
    }


    @Override
    public List<Appointment> handle(GetAllAppointmentsQuery query) {
        return appointmentRepository.findAll();
    }
}
