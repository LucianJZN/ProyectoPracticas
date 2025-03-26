package com.example.ProyectoPracticas.base.DTOs;

import com.example.ProyectoPracticas.base.entities.User;

//DTO para recibir los datos de usuario
public class UserDTO {
 private String name;
 private String mail;
 private String pass;
 private User.Role rol;
 private Boolean enabled;

 // Getters y Setters
 
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
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public User.Role getRol() {
	return rol;
}
public void setRol(User.Role rol) {
	this.rol = rol;
}
public Boolean getEnabled() {
	return enabled;
}
public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
}



 
 
 
}

