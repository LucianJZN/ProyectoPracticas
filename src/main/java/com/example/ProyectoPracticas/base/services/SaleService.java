package com.example.ProyectoPracticas.base.services;

import java.util.List;

import com.example.ProyectoPracticas.base.entities.Sale;
import com.example.ProyectoPracticas.base.repositories.SaleRepository;

public class SaleService {
	
	private final SaleRepository saleRepository;

	public SaleService(SaleRepository saleRepository) {
		this.saleRepository = saleRepository;
	}

	// Obtener todos los sales
	public List<Sale> getAllSales() {
		return saleRepository.findAll();
	}

	// Obtener un sale por ID
	public Sale getSaleById(Long id) {
		return saleRepository.findById(id).orElse(null);
	}

	// Guardar un nuevo sale
	public Sale saveSale(Sale sale) {
		return saleRepository.save(sale);
	}

	// Eliminar un sale
	public void deleteSale(Long id) {
		saleRepository.deleteById(id);
	}
}
