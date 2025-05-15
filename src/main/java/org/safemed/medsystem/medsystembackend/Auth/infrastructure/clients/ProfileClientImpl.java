package org.safemed.medsystem.medsystembackend.Auth.infrastructure.clients;

import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.UserResource;
import org.safemed.medsystem.medsystembackend.Profiles.User.Application.internal.commandServices.DoctorCommandServiceImpl;
import org.safemed.medsystem.medsystembackend.Profiles.User.Application.internal.commandServices.PatientCommandServiceImpl;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreateDoctorCommand;
import org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands.CreatePatientCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileClientImpl implements ProfileClientRest {
    private final DoctorCommandServiceImpl doctorService;
    private final PatientCommandServiceImpl patientService;

    @Autowired
    public ProfileClientImpl(DoctorCommandServiceImpl doctorService, PatientCommandServiceImpl patientService) {
        this.doctorService = doctorService;
        this.patientService = patientService;
    }

    @Override
    public UserResource createDoctor(UserResource userResource) {
        CreateDoctorCommand command = new CreateDoctorCommand(
                userResource.id(),
                userResource.email(),
                userResource.role()
        );
        doctorService.handle(command);  // Devuelve el ID, si lo hace
        return userResource; // o puedes construir uno nuevo con valores actualizados
    }

    @Override
    public UserResource createPatient(UserResource userResource) {
        CreatePatientCommand command = new CreatePatientCommand(
                userResource.id(),
                userResource.email(),
                userResource.role()
        );
        patientService.handle(command);
        return userResource;
    }
}