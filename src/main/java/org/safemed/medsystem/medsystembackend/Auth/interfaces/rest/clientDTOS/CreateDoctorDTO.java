package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS;

public record CreateDoctorDTO(
        String firstName,
        String lastName,
        Integer licenceNumber,
        String speciality,
        String phone,
        String email
) {
}
