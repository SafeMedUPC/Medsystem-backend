package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands;

public record CreateDoctorCommand(
        Long id,
        String email,
        String role
) {
}
