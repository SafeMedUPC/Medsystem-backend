package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources;

public record CreateDoctorResource(
        String email,
        String role
        //Long idLaboratory
) {
}
