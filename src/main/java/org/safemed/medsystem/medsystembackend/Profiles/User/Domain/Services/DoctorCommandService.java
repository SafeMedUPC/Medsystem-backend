package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Services;

import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Aggregates.Doctor;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreateDoctorCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.DeleteDoctorCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.UpdateDoctorCommand;

import java.util.Optional;

public interface DoctorCommandService {
    Long handle(CreateDoctorCommand command);
    Optional<Doctor> handle(UpdateDoctorCommand command);
    void handle(DeleteDoctorCommand command);
}
