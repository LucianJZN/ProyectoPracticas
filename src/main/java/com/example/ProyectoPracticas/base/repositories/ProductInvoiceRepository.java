package com.example.ProyectoPracticas.base.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ProyectoPracticas.base.entities.ProductInvoice;

public interface ProductInvoiceRepository extends JpaRepository<ProductInvoice, Long>{
	Optional<ProductInvoice> findById(Long id);
}
