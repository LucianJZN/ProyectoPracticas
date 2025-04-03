package com.example.ProyectoPracticas.base.services;

import java.util.List;

import com.example.ProyectoPracticas.base.entities.Invoice;
import com.example.ProyectoPracticas.base.repositories.InvoiceRepository;

public class InvoiceService {
	
	private final InvoiceRepository invoiceRepository;

	public InvoiceService(InvoiceRepository invoiceRepository) {
		this.invoiceRepository = invoiceRepository;
	}

	// Obtener todos los invoices
	public List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}

	// Obtener un invoices por ID
	public Invoice getInvoiceById(Long id) {
		return invoiceRepository.findById(id).orElse(null);
	}

	// Guardar un nuevo invoices
	public Invoice saveInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

	// Eliminar un invoices
	public void deleteInvoice(Long id) {
		invoiceRepository.deleteById(id);
	}
}
