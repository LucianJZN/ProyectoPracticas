package com.example.ProyectoPracticas.base.services;

import java.util.List;

import com.example.ProyectoPracticas.base.entities.ProductInvoice;
import com.example.ProyectoPracticas.base.repositories.ProductInvoiceRepository;

public class ProductInvoiceService {
	
	private final ProductInvoiceRepository productInvoiceRepository;

	public ProductInvoiceService(ProductInvoiceRepository productInvoiceRepository) {
		this.productInvoiceRepository = productInvoiceRepository;
	}

	// Obtener todos los productInvoices
	public List<ProductInvoice> getAllProductInvoices() {
		return productInvoiceRepository.findAll();
	}

	// Obtener un productInvoice por ID
	public ProductInvoice getProductInvoiceById(Long id) {
		return productInvoiceRepository.findById(id).orElse(null);
	}

	// Guardar un nuevo productInvoice
	public ProductInvoice saveProductInvoice(ProductInvoice productInvoice) {
		return productInvoiceRepository.save(productInvoice);
	}

	// Eliminar un productInvoice
	public void deleteProductInvoice(Long id) {
		productInvoiceRepository.deleteById(id);
	}
}
