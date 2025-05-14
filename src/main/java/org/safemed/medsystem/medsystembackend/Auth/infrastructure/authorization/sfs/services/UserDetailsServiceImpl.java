package org.safemed.medsystem.medsystembackend.Auth.infrastructure.authorization.sfs.services;


import org.safemed.medsystem.medsystembackend.Auth.infrastructure.authorization.sfs.model.UserDetailsImpl;
import org.safemed.medsystem.medsystembackend.Auth.infrastructure.persistence.jpa.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("defaultUserDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public  UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        var user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));
        return UserDetailsImpl.build(user);
    }

}
