package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.ValueObjects.Specialities;

public record UpdateDoctorCommand(
        Long id,
        String firstName,
        String lastName,
        Integer licenceNumber,
        Specialities specialities,
        String phone
        //Long idLaboratory
) {
}
