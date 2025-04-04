package com.example.ProyectoPracticas.base.DTOs;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class InvoiceDTO {
	private String CIF;
    private LocalDateTime date;
    private BigDecimal total;
    private boolean paid;
    
    // Getters y Setters
    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public LocalDateTime  getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

	@Override
	public int hashCode() {
		return Objects.hash(CIF, date, paid, total);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceDTO other = (InvoiceDTO) obj;
		return Objects.equals(CIF, other.CIF) && Objects.equals(date, other.date) && paid == other.paid
				&& Objects.equals(total, other.total);
	}

	@Override
	public String toString() {
		return "InvoiceDTO [CIF=" + CIF + ", date=" + date + ", total=" + total + ", paid=" + paid + "]";
	}
}
