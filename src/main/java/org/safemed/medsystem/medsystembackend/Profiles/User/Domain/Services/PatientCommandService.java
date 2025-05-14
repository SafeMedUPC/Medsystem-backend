package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Services;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Patient;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreatePatientCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.DeletePatientCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.UpdatePatientCommand;

import java.util.Optional;

public interface PatientCommandService {
    Long handle(CreatePatientCommand command);
    Optional<Patient> handle(UpdatePatientCommand command);
    void handle(DeletePatientCommand command);
}