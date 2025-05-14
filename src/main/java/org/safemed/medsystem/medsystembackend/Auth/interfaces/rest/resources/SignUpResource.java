package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources;

public record SignUpResource(
    String email,
    String password,
    String role
) {

}
