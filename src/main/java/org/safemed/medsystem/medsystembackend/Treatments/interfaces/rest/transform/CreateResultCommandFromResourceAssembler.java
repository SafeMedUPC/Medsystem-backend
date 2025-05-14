package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateResultCommand;
import org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources.CreateResultResource;

public class CreateResultCommandFromResourceAssembler {
    public static CreateResultCommand toCommandFromResource(CreateResultResource resource) {
        return new CreateResultCommand(
                resource.doctorId(),
                resource.patientId(),
                resource.typeOfExam(),
                resource.resultDateTime(),
                resource.result()
        );
    }
}