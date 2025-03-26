package com.example.ProyectoPracticas.base.entitiesDTO;

import com.example.ProyectoPracticas.base.entities.User.Role;

public class UserDTO {

    private Long userId;
    private String name;
    private String mail;
    private Role rol;
    private Boolean enabled;

    // Constructor vacío
    public UserDTO() {}

    // Constructor con parámetros
    public UserDTO(Long userId, String name, String mail, Role rol, Boolean enabled) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.rol = rol;
        this.enabled = enabled;
    }

    // Getters y Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Role getRol() {
        return rol;
    }

    public void setRol(Role rol) {
        this.rol = rol;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}

