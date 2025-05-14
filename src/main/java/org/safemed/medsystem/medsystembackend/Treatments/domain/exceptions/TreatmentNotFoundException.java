package org.safemed.medsystem.medsystembackend.Treatments.domain.exceptions;

public class TreatmentNotFoundException extends RuntimeException {
    public TreatmentNotFoundException(Long treatmentId) {
        super("Treatment with ID " + treatmentId + " not found");
    }
}
