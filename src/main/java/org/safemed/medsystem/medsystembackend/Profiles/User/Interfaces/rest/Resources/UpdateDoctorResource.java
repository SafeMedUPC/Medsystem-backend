package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.ValueObjects.Specialities;

public record UpdateDoctorResource(
        String firstName,
        String lastName,
        Integer licenceNumber,
        Specialities specialities,
        String phone
        //Long idLaboratory
) {
}
