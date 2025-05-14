package org.safemed.medsystem.medsystembackend.Auth.infrastructure.authorization.sfs.model;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

public class UsernamePasswordAuthenticationTokenBuilder {

    public static UsernamePasswordAuthenticationToken build(UserDetails principal, HttpServletRequest request) {
        var UsernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
            principal,
            null,
            principal.getAuthorities());
        UsernamePasswordAuthenticationToken.setDetails(
            new WebAuthenticationDetailsSource().buildDetails(request));
        return UsernamePasswordAuthenticationToken;
    }

}
