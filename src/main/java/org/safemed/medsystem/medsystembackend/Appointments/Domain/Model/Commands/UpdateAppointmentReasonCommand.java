package org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands;

public record UpdateAppointmentReasonCommand(Long appointmentId, String reason) {
}
