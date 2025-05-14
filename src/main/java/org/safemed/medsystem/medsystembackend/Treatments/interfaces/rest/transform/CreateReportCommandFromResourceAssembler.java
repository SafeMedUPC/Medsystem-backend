package org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.transform;

import org.safemed.medsystem.medsystembackend.Treatments.domain.model.commands.CreateReportCommand;
import org.safemed.medsystem.medsystembackend.Treatments.interfaces.rest.resources.CreateReportResource;

public class CreateReportCommandFromResourceAssembler {
    public static CreateReportCommand toCommandFromResource(CreateReportResource resource) {
        return new CreateReportCommand(resource.reason(), resource.date(), resource.patientId());
    }
}