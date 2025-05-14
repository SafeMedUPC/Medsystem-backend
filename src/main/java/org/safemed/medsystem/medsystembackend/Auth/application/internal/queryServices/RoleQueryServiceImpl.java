package org.safemed.medsystem.medsystembackend.Auth.application.internal.queryServices;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.entities.Role;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetAllRolesQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetRoleByNameQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.services.RoleQueryService;
import org.safemed.medsystem.medsystembackend.Auth.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleQueryServiceImpl implements RoleQueryService {

    private final RoleRepository roleRepository;

    public RoleQueryServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override
    public List<Role> handle(GetAllRolesQuery query) {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> handle(GetRoleByNameQuery query) {
        return roleRepository.findByName(query.roleName());
    }

}
