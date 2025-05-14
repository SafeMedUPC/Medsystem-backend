package org.safemed.medsystem.medsystembackend.Auth.infrastructure.persistence.jpa.repositories;


import org.safemed.medsystem.medsystembackend.Auth.domain.model.aggregates.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // busca en la base de datos un usuario por su nombre de usuario
    Optional<User> findByEmail(String email);
    
    // verifica si existe un usuario con el nombre de usuario
    boolean existsByEmail(String email);

    Optional<User> findUserById(Long id);
}
