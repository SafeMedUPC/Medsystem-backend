package org.safemed.medsystem.medsystembackend.Auth.application.internal.eventhandlers;

import org.safemed.medsystem.medsystembackend.Auth.domain.model.commands.SeedRolesCommand;
import org.safemed.medsystem.medsystembackend.Auth.domain.services.RoleCommandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service("authReadyEventHandler")
public class ApplicationReadyEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(ApplicationReadyEventHandler.class);
    private final RoleCommandService roleCommandService;

    public ApplicationReadyEventHandler(RoleCommandService roleCommandService) {
        this.roleCommandService = roleCommandService;
    }

    @EventListener
    public void on(ApplicationReadyEvent event) {
        var applicationName = event.getApplicationContext().getId();
        LOGGER.info("Starting to verify if roles seeding is needed for {} at {}", applicationName, getCurrentTimestamp());
        var seedRolesCommand = new SeedRolesCommand();
        roleCommandService.handle(seedRolesCommand);
        LOGGER.info("Roles seeding verification finished for {} at {}", applicationName, getCurrentTimestamp());
    }

    private Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }

}
