package org.safemed.medsystem.medsystembackend.Auth.interfaces.rest;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetAllUsersQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.model.queries.GetUserByIdQuery;
import org.safemed.medsystem.medsystembackend.Auth.domain.services.UserQueryService;
import org.safemed.medsystem.medsystembackend.Auth.infrastructure.persistence.jpa.repositories.UserRepository;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.resources.UserResource;
import org.safemed.medsystem.medsystembackend.Auth.interfaces.rest.transform.UserResourceFromEntityAssembler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(value = "/api/v1/users", produces= MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Users", description = "Users API")
@CrossOrigin(origins = "*")
public class UsersController {

    private final UserQueryService userQueryService;
    private final UserRepository userRepository;

    public UsersController(UserQueryService userQueryService, UserRepository userRepository) {
        this.userQueryService = userQueryService;
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<UserResource>> getAllUsers() {
        var getAllUsersQuery = new GetAllUsersQuery();
        var users = userQueryService.handle(getAllUsersQuery);
        var userResources = users.stream().map(UserResourceFromEntityAssembler::toUserResourceFromEntity).toList();
        return ResponseEntity.ok(userResources);
    }

    @GetMapping(value= "/{userId}")
    public ResponseEntity<UserResource> getUserById(@RequestParam Long userId) {
        var GetUserByIdQuery = new GetUserByIdQuery(userId);
        var user = userQueryService.handle(GetUserByIdQuery);

        if(user.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        var userResource = UserResourceFromEntityAssembler.toUserResourceFromEntity(user.get());
        return ResponseEntity.ok(userResource);
        
    }
    

}
