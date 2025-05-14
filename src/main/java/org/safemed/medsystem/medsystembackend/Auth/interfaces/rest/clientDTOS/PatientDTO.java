package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS;

public record PatientDTO(
        Long patientId,
        String firstName,
        String lastName,
        Integer age,
        String address,
        String phone
        // String email --> puede usar el email del usuario autenticado
) {
}
