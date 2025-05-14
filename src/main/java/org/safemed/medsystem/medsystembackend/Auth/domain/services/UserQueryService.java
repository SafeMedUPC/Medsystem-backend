package org.safemed.medsystem.medsystembackend.Auth.domain.services;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.aggregates.User;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetAllUsersQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetUserByEmailQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetUserByIdQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
    List<User> handle(GetAllUsersQuery query); // retorna todos los usuarios
    Optional<User> handle(GetUserByIdQuery query); // retorna un usuario por id
    Optional<User> handle(GetUserByEmailQuery query); // retorna un usuario por username


}
