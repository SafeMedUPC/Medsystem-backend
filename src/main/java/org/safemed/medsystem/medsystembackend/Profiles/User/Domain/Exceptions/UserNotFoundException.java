package org.safemed.medsystem.medsystembackend.Profiles.User.Domain.Exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long userId) {
        super("Entity with id " + userId + " not found");
    }
}