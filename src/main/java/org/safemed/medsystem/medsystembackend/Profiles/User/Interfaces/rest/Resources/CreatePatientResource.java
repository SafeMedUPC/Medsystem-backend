package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.Resources;

public record CreatePatientResource(
        String email,
        String role
) {
}
