package org.safemed.medsystem.medsystembackend.Auth.application.internal.commandServices;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.commands.SeedRolesCommand;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.entities.Role;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.valueobjects.Roles;
import org.safemed.medsystem.medsystembackend.Auth.domain.services.RoleCommandService;
import org.safemed.medsystem.medsystembackend.Auth.infrastructure.persistence.jpa.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RoleCommandServiceImpl implements RoleCommandService {

    private final RoleRepository roleRepository;

    public RoleCommandServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void handle(SeedRolesCommand command) {
        Arrays.stream(Roles.values()).forEach(role -> {
            if(!roleRepository.existsByName(role)) {
                roleRepository.save(new Role(Roles.valueOf(role.name())));
            }
        });
    }

}
