package org.safemed.medsystem.medsystembackend.Appointments.Interfaces.REST.Resources;

public record AppointmentResource(
        Long id,
        Long doctorId,
        Long patientId,
        String date,
        String reason,
        String speciality
) { }
