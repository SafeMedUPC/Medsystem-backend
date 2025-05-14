package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.transform;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.aggregates.User;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.AuthenticatedUserResource;

public class AuthenticatedUserResourceFromEntityAssembler {
    
    public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
        return new AuthenticatedUserResource(
            user.getId(),
            user.getEmail(),
            token,
            user.getRole().getStringName()
        );
    }

}
