package com.example.ProyectoPracticas.base.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProyectoPracticas.base.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	Optional<Sale> findById(Long id);
}
