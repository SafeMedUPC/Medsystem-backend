package org.safemed.medsystem.medsystembackend.Auth.domain.services;

import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS.CreateDoctorDTO;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS.CreatePatientDTO;

import java.util.Optional;

public interface SecurityProfilesService {

    Optional<CreateDoctorDTO> createDoctorProfile(CreateDoctorDTO createDoctorDTO);
    Optional<CreatePatientDTO> createPatientProfile(CreatePatientDTO createPatientDTO);
}
