package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources;

public record CreateTreatmentResource(String treatmentName, String description, String startDate, String endDate, Long patientId, Long doctorId) {
}