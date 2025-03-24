package com.example.ProyectoPracticas.base.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.ProyectoPracticas.base.entities.DetailsSale;
import com.example.ProyectoPracticas.base.entities.Invoice;
import com.example.ProyectoPracticas.base.entities.Product;
import com.example.ProyectoPracticas.base.entities.ProductInvoice;
import com.example.ProyectoPracticas.base.entities.Sale;
import com.example.ProyectoPracticas.base.entities.User;

public class HibernateUtil {

	private static SessionFactory factory;

	static {
		// Configurar la SessionFactory - Hay que agregar todas las entidades para que hibernate funcione
		factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Invoice.class)
				.addAnnotatedClass(Product.class)
				.addAnnotatedClass(Sale.class)
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(DetailsSale.class)
				.addAnnotatedClass(ProductInvoice.class)
				.buildSessionFactory();
	}

	public static Session getSession() {
		return factory.getCurrentSession();
	}

	public static void close() {
		factory.close();
	}
}