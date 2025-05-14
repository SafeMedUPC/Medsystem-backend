package org.safemed.medsystem.medsystembackend.Appointments.Domain.Services;

import org.safemed.medsystem.medsystembackend.Appointments.Domain.Model.Commands.SeedSpecialtiesCommand;

public interface SpecialtyCommandService {
    void handle(SeedSpecialtiesCommand command);
}
