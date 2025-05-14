package org.safemed.medsystem.medsystembackend.Auth.domain.model.commands;



import org.safemed.medsystem.medsystembackend.Auth.domain.model.entities.Role;

public record SignUpCommand(
        String email,
        String password,
        Role role
        )
{

}
