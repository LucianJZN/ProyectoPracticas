package com.example.ProyectoPracticas.base.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProyectoPracticas.base.entities.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{
	Optional<Invoice> findById(Long id);
}
