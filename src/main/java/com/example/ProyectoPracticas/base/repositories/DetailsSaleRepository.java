package com.example.ProyectoPracticas.base.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProyectoPracticas.base.entities.DetailsSale;

public interface DetailsSaleRepository extends JpaRepository<DetailsSale, Long>{
	Optional<DetailsSale> findById(Long id);
}
