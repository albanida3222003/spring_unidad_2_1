package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;

	private String nombre;
	private String dni;

	public cliente(int idcliente, String nombre, String dni) {
		super();
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.dni = dni;
	}

	public cliente() {
		super();
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
