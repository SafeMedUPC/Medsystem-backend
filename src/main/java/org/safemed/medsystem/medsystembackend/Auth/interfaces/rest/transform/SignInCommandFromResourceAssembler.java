package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.transform;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.commands.SignInCommand;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.SignInResource;

public class SignInCommandFromResourceAssembler {
    public static SignInCommand toCommandFromResource(SignInResource signInResource) {
        return new SignInCommand(signInResource.email(), signInResource.password());
    }

}
