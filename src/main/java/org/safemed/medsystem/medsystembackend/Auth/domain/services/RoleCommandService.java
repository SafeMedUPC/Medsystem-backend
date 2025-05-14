package org.safemed.medsystem.medsystembackend.Auth.domain.services;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
    void handle(SeedRolesCommand command);
}
