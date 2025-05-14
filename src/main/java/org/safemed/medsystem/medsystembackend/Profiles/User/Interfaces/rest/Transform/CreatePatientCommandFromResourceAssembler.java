package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Transform;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreatePatientCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources.CreatePatientResource;

public class CreatePatientCommandFromResourceAssembler {  public static CreatePatientCommand toCommandFromResource(CreatePatientResource resource, Long id) {
    return new CreatePatientCommand(
            id,
            resource.email(),
            resource.role()
    );
}
}
