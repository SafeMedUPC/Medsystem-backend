package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Model.Commands;

public record UpdatePatientCommand(Long id, String firstName, String lastName, Integer age, String address, String phone, String email) {
}
