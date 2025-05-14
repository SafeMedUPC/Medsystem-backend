package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS;

public record CreatePatientDTO(
        String firstName,
        String lastName,
        Integer age,
        String address,
        String phone,
        String email
) {
}
