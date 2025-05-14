package org.safemed.medsystem.medsystembackend.Appointments.Domain.Services;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Aggregates.Appointment;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Queries.*;

import java.util.List;
import java.util.Optional;

public interface AppointmentQueryService {
    Optional<Appointment> handle(GetAppointmentByIdQuery query);
    List<Appointment> handle(GetAllAppointmentsByDoctorIdQuery query);
    List<Appointment> handle(GetAllAppointmentsByPatientIdQuery query);
    List<Appointment> handle(GetAppointmentsByDateQuery query);
    List<Appointment> handle(GetAllAppointmentsQuery query);
}
