package com.example.ProyectoPracticas.base.controllers;

import com.example.ProyectoPracticas.base.DTOs.UserDTO;
import com.example.ProyectoPracticas.base.entities.User;
import com.example.ProyectoPracticas.base.services.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint de prueba
    @PostMapping("/pruebaUsuario")
    public void printTestUser() {
        System.out.println("El EndPoint responde.");
    }

    // Mostrar todos los usuarios
    @GetMapping("/showAllUsers")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    // Buscar usuario por ID
    @GetMapping("/showById/{id}")
    public String getUser(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        return user.map(value -> "Usuario con ID " + id + ": " + value.getName())
                   .orElse("No existe ese usuario");
    }

    @PostMapping("/new")
    public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {
        // Convertir el DTO a la entidad User
        User user = new User();
        user.setName(userDTO.getName());
        user.setMail(userDTO.getMail());
        user.setPass(userDTO.getPass());

        // Convertir el rol de String a Enum (Role)
        try {
            User.Role rol = User.Role.valueOf(userDTO.getRol().toUpperCase()); // Convertimos el String a Role
            user.setRol(rol);
        } catch (IllegalArgumentException e) {
            // Manejo de error en caso de que el String no sea un valor válido de Role
        	return new ResponseEntity("El rol especificado no es válido", HttpStatus.BAD_REQUEST);

        }

        user.setEnabled(userDTO.getEnabled());

        // Guardar el usuario
        User savedUser = userService.saveUser(user);

        // Retornar la respuesta
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Obtener lista de usuarios (JSON)
    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Obtener usuario por ID
    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id).orElse(null);
    }
}
