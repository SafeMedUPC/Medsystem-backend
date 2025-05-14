package org.safemed.medsystem.medsystembackend.Appointments.Domain.Services;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Aggregates.Appointment;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.CreateAppointmentCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.DeleteAppointmentCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.UpdateAppointmentDateCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.UpdateAppointmentReasonCommand;

import java.util.Optional;

public interface AppointmentCommandService {
    Optional<Appointment> handle(CreateAppointmentCommand command);
    Optional<Appointment> handle(UpdateAppointmentReasonCommand command);
    Optional<Appointment> handle(UpdateAppointmentDateCommand command);

    void handle(DeleteAppointmentCommand command);
}
