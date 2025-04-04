package com.example.ProyectoPracticas.base.services;

import java.util.List;

import com.example.ProyectoPracticas.base.entities.DetailsSale;
import com.example.ProyectoPracticas.base.repositories.DetailsSaleRepository;

public class DetailsSaleService {
	
	private final DetailsSaleRepository detailsSaleRepository;

	public DetailsSaleService(DetailsSaleRepository detailsSaleRepository) {
		this.detailsSaleRepository = detailsSaleRepository;
	}

	// Obtener todos los detailsSales
	public List<DetailsSale> getAllDetailsSales() {
		return detailsSaleRepository.findAll();
	}

	// Obtener un detailsSale por ID
	public DetailsSale getDetailsSaleById(Long id) {
		return detailsSaleRepository.findById(id).orElse(null);
	}

	// Guardar un nuevo detailsSale
	public DetailsSale saveDetailsSale(DetailsSale detailsSale) {
		return detailsSaleRepository.save(detailsSale);
	}

	// Eliminar un detailsSale
	public void deleteDetailsSale(Long id) {
		detailsSaleRepository.deleteById(id);
	}
}
