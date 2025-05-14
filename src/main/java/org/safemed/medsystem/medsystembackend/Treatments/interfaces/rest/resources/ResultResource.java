package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources;

public record ResultResource(
        Long id,
        Long doctorId,
        Long patientId,
        String typeOfExam,
        String resultDateTime,
        boolean result
) {
}