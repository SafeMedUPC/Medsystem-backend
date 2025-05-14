package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Transform;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Patient;
import org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources.PatientResource;

public class PatientResourceFromEntityAssembler {
    public static PatientResource toResourceFromEntity(Patient entity) {
        return new PatientResource(
                entity.getUserId(),
                entity.getFirstName(),
                entity.getLastName(),
                entity.getAge(),
                entity.getAddress(),
                entity.getPhone(),
                entity.getEmail()
        );
    }
}
