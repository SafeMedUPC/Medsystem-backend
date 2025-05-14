package org.safemed.medsystem.medsystembackend.Auth.infrastructure.hashing.bcrypt;


import org.safemed.medsystem.medsystembackend.Auth.application.internal.outboundservices.hashing.HashingService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface BCryptHashingService extends HashingService, PasswordEncoder {

}
