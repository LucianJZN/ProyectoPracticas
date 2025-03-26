package com.example.ProyectoPracticas.base.repositories;

import com.example.ProyectoPracticas.base.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByMail(String mail); // Para buscar un usuario por email
}
