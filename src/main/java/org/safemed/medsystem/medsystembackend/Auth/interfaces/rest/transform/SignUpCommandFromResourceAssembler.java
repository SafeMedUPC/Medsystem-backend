package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.transform;



import org.safemed.medsystem.medsystembackend.Auth.domain.model.commands.SignUpCommand;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.entities.Role;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.valueobjects.Roles;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.SignUpResource;

public class SignUpCommandFromResourceAssembler {
    public static SignUpCommand toCommandFromResource(SignUpResource resource) {

        var erole = new Role(Roles.valueOf(resource.role()));

        return new SignUpCommand(
                resource.email(),
                resource.password(), erole);
    }

}