package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands;

public record CreatePatientCommand(
        Long id,
        String email,
        String role
) {
}
