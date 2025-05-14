package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.transform;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.entities.Role;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {
    public static RoleResource toRoleResourceFromEntity(Role role) {
        return new RoleResource(role.getId(), role.getStringName());
    }

}
