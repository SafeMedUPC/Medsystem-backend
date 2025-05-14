package org.safemed.medsystem.medsystembackend.Treatments.domain.exceptions;

public class TreatmentCreationException extends RuntimeException {
    public TreatmentCreationException(String message) {
        super(message);
    }
}
