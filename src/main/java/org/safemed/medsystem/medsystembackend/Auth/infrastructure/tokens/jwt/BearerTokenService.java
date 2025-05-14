package org.safemed.medsystem.medsystembackend.Auth.infrastructure.tokens.jwt;


import jakarta.servlet.http.HttpServletRequest;
import org.safemed.medsystem.medsystembackend.Auth.application.internal.outboundservices.tokens.TokenService;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;

public interface BearerTokenService extends TokenService {

    String getBearerTokenFrom(HttpServletRequest request);
    String generateToken(Authentication authentication);

}
