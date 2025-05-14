package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.ValueObjects.Specialities;

public record DoctorResource(
        Long id,
        String firstName,
        String lastName,
        Integer licenceNumber,
        Specialities specialities,
        String phone,
        String email
        //Long idLaboratory
        ) {
}
