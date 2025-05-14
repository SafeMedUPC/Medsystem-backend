package org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands;

import java.time.LocalDate;

public record UpdateAppointmentDateCommand(Long appointmentId, LocalDate date) {
}
