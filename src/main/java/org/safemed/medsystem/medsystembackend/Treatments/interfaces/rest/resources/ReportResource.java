package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources;

public record ReportResource(Long id, String reason, String date, Long patientId) {
}