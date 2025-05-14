package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Transform;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreateDoctorCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources.CreateDoctorResource;

public class CreateDoctorCommandFromResourceAssembler {
    public static CreateDoctorCommand toCommandFromResource(CreateDoctorResource resource, Long id) {
    return new CreateDoctorCommand(
            id,
            resource.email(),
            resource.role()
    );
}
}
