package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")
public class producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	
	private String nombre;	
	private float precio;
	
	public producto() {
		super();
	}
	public producto(int idproducto, String nombre, float precio) {
		super();
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precio = precio;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	

}
