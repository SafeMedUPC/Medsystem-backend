package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.clientDTOS;

public record DoctorDTO(
        Long doctorId,
        String firstName,
        String lastName,
        String specialities,
        Integer licenceNumber,
        String phone
) {
}
