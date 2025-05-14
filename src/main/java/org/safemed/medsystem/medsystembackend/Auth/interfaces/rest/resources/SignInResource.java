package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources;

public record SignInResource(
    String email,
    String password
) {

}
