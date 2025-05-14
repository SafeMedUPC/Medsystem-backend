package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.transform;


import org.safemed.medsystem.medsystembackend.Treatments.domain.model.aggregates.Treatment;
import org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources.TreatmentResource;


public class TreatmentResourceFromEntityAssembler {
    public static TreatmentResource toResourceFromEntity(Treatment entity) {
        return new TreatmentResource(
                entity.getId(),
                entity.getTreatmentName(),
                entity.getDescription(),
                entity.getPeriod(),
                entity.getPatientId(),
                entity.getDoctorId()
        );
    }
}