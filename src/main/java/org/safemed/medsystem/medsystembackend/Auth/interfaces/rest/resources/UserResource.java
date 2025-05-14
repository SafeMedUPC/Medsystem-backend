package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources;

public record UserResource(
    Long id,
    String email,
    String role
) {

}
