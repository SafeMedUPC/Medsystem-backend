package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateTreatmentCommand;
import org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources.CreateTreatmentResource;

public class CreateTreatmentCommandFromResourceAssembler {
    public static CreateTreatmentCommand toCommandFromResource(CreateTreatmentResource resource) {
        return new CreateTreatmentCommand(
                resource.treatmentName(),
                resource.description(),
                resource.startDate(),
                resource.endDate(),
                resource.patientId(),
                resource.doctorId()
        );
    }
}