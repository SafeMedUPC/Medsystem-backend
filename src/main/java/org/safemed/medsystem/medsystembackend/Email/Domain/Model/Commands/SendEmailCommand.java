package org.safemed.medsystem.medsystembackend.Email.Domain.Model.Commands;

public record SendEmailCommand(String to, String subject, String body) {
}
