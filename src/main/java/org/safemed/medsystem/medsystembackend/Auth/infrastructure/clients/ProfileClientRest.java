package org.safemed.medsystem.medsystembackend.Auth.infrastructure.clients;

import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS.*;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.UserResource;
import org.safemed.medsystem.medsystembackend.Profiles.User.Application.internal.commandServices.DoctorCommandServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface ProfileClientRest {

    UserResource createDoctor(UserResource userResource);

    UserResource createPatient(UserResource userResource);

}
