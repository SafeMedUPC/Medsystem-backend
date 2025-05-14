package org.safemed.medsystem.medsystembackend.Auth.application.internal.queryServices;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.aggregates.User;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetAllUsersQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetUserByEmailQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetUserByIdQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.services.UserQueryService;
import org.safemed.medsystem.medsystembackend.Auth.infrastructure.persistence.jpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserQueryServiceImpl implements UserQueryService {

    private final UserRepository userRepository;

    public UserQueryServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> handle(GetAllUsersQuery query) {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> handle(GetUserByIdQuery query) {
        return userRepository.findById(query.userId());
    }

    @Override
    public Optional<User> handle(GetUserByEmailQuery query) {
        return userRepository.findByEmail(query.email());
    }

}
