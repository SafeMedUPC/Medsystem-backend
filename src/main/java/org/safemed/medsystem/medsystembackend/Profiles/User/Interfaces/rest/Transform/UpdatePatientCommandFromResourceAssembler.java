package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Transform;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.UpdatePatientCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources.UpdatePatientResource;

public class UpdatePatientCommandFromResourceAssembler {
    public static UpdatePatientCommand toCommandFromResource(UpdatePatientResource resource, Long id) {
        return new UpdatePatientCommand(
                id,
                resource.firstName(),
                resource.lastName(),
                resource.age(),
                resource.address(),
                resource.phone(),
                resource.email()
        );
    }
}
