package com.example.ProyectoPracticas.base.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ProyectoPracticas.base.entities.Product;
import com.example.ProyectoPracticas.base.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	// Obtener todos los usuarios
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Obtener un usuario por ID
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Guardar un nuevo usuario
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Eliminar un usuario
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
