package org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands;

import java.time.LocalDate;

public record CreateAppointmentCommand(Long doctorId, Long patientId, LocalDate date, String reason, String specialty) {
}
