package com.uca.capas.modelo.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {

	//@Size(min = 0, max = 12, message = "El codigo debe tener 12 digitos")
	int id;
	
	//@Size(min = 1, max = 100, message = "el nombre debe tener de uno a cien caracteres")
	String nombre;
	
	//@NotNull(message = "Debe ingresar una cantidad")
	Integer cantidad;
	
	public Product() {
		
	}

	public Product(int id, String nombre, Integer cantidad) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer existencias) {
		this.cantidad = existencias;
	}


}
