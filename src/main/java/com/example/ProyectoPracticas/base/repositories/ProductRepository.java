package com.example.ProyectoPracticas.base.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProyectoPracticas.base.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id); // Para buscar un producto por id
}