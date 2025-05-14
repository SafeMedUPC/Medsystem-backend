package org.safemed.medsystem.medsystembackend.Profiles.User.Interfaces.rest.clientsDTO;

public record UserResource(
        Long id,
        String email,
        String role
) {
}
