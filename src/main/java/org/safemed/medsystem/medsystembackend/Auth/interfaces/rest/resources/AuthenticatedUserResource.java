package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources;

public record AuthenticatedUserResource(
    Long id,
    String username,
    String token,
    String role
) {

}
