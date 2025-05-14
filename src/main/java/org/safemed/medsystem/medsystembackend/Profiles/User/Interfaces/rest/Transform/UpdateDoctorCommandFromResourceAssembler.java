package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Transform;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.UpdateDoctorCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources.UpdateDoctorResource;

public class UpdateDoctorCommandFromResourceAssembler {
    public static UpdateDoctorCommand toCommandFromResource(UpdateDoctorResource resource, Long id) {
        return new UpdateDoctorCommand(
                id,
                resource.firstName(),
                resource.lastName(),
                resource.licenceNumber(),
                resource.specialities(),
                resource.phone()
        );
    }
}
