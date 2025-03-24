package com.example.ProyectoPracticas.base.controllers;

import com.example.ProyectoPracticas.base.entities.User;
import com.example.ProyectoPracticas.base.entities.User.Role;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final List<User> userList;

    public UserController() {
        userList = new ArrayList<>();
        userList.add(getDefaultUser());
    }

    private User getDefaultUser() {
        User user = new User();
        user.setUserId(1L);
        user.setName("UsuarioPrueba");
        user.setMail("prueba@email.com");
        user.setPass("Hola123");
        user.setRol(Role.ADMINISTRADOR);
        user.setEnabled(true);
        return user;
    }

    //EndPoint de prueba
    @PostMapping("/pruebaUsuario")
    public void printTestUser() {
    	System.out.println("El EndPoint responde.");
    }
    
    //Show users
    @GetMapping("/showAllUsers")
    public String getUsers() {
        return "Lista de usuarios: " + userList;
    }

    @GetMapping("/showById{id}")
    public String getUser(@PathVariable int id) {
    	//Habrá que ver como devuelvo el error
        return "Usuario con ID " + id + ": " +
                (id < userList.size() ? userList.get(id).getName() : "No existe ese usuario");
    }

    //Create user
    @PostMapping("/new")
    public String addUser(@RequestBody User user) {
        userList.add(user);
        return "Usuario añadido: " + user.toString();
    }

    //Get users
    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }

    @GetMapping("/getById/{id}")
    public User getUserById(@PathVariable int id) {
        return userList.stream()
                .filter(user -> user.getUserId() == id)
                .findFirst()
                .orElse(null);
    }
}
