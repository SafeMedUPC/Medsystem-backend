package org.safemed.medsystem.medsystembackend.Auth.domain.services;



import org.safemed.medsystem.medsystembackend.Auth.domain.model.entities.Role;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetAllRolesQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
    List<Role> handle(GetAllRolesQuery query); // retorna todos los roles
    Optional<Role> handle(GetRoleByNameQuery query); // retorna un rol por nombre

}
