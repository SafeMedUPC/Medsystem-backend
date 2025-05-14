package org.safemed.medsystem.medsystembackend.Appointments.Application.EventHandlers;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.SeedSpecialtiesCommand;
import org.safemed.medsystem.medsystembackend.Appointments.Domain.Services.SpecialtyCommandService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service("appointmentReadyEventHandler")
public class ApplicationReadyEventHandler {
    private final SpecialtyCommandService specialtyCommandService;

    public ApplicationReadyEventHandler(SpecialtyCommandService specialtyCommandService) {
        this.specialtyCommandService = specialtyCommandService;
    }

    @EventListener
    public void on(ApplicationReadyEvent event){
        var seedSpecialtiesCommand = new SeedSpecialtiesCommand();
        specialtyCommandService.handle(seedSpecialtiesCommand);
    }
}
