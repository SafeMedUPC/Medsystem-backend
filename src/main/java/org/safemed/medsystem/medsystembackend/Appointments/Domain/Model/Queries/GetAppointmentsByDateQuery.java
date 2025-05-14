package org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Queries;

import java.time.LocalDate;


public record GetAppointmentsByDateQuery(LocalDate date) {
}
