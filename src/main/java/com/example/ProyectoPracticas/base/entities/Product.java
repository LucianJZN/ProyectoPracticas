package com.example.ProyectoPracticas.base.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "name", nullable = false, unique = true, length = 100)
    private String name;

    @Column(name = "amount", nullable = false)
    private int amount;

    @Column(name = "minimum_amount", nullable = false)
    private int minimumAmount;

    @Column(name = "season")
    private Boolean season = true;

    @Column(name = "enabled")
    private Boolean enabled = true;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "sell_price")
    private Double sellPrice;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<ProductInvoice> productInvoices;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<DetailsSale> detailsSales;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(int minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public Boolean getSeason() {
		return season;
	}

	public void setSeason(Boolean season) {
		this.season = season;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Double sellPrice) {
		this.sellPrice = sellPrice;
	}

	public List<ProductInvoice> getProductInvoices() {
		return productInvoices;
	}

	public void setProductInvoices(List<ProductInvoice> productInvoices) {
		this.productInvoices = productInvoices;
	}

	public List<DetailsSale> getDetailsSales() {
		return detailsSales;
	}

	public void setDetailsSales(List<DetailsSale> detailsSales) {
		this.detailsSales = detailsSales;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + Objects.hash(amount, detailsSales, enabled, minimumAmount, name, price, productId,
				productInvoices, season, sellPrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return amount == other.amount && Objects.equals(detailsSales, other.detailsSales)
				&& Objects.equals(enabled, other.enabled) && Arrays.equals(image, other.image)
				&& minimumAmount == other.minimumAmount && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(productId, other.productId) && Objects.equals(productInvoices, other.productInvoices)
				&& Objects.equals(season, other.season) && Objects.equals(sellPrice, other.sellPrice);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", image=" + Arrays.toString(image) + ", name=" + name + ", amount="
				+ amount + ", minimumAmount=" + minimumAmount + ", season=" + season + ", enabled=" + enabled
				+ ", price=" + price + ", sellPrice=" + sellPrice + "]";
	}    
}
