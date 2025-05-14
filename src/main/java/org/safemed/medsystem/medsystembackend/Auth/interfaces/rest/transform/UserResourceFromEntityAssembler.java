package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.transform;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.aggregates.User;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {
    public static UserResource toUserResourceFromEntity(User entity) {

        return new UserResource(
            entity.getId(),
            entity.getEmail(),
            entity.getRole().getStringName()
        );
    }

}
