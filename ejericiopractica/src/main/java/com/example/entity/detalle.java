package com.example.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="detalle")
public class detalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddetalle;

	@ManyToOne
	@JoinColumn(name = "idcliente", foreignKey = @ForeignKey(name = "fk_detalle_cliente"))
	private cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idproducto", foreignKey = @ForeignKey(name = "fk_detalle_producto"))
	private producto producto;

	
	
	
	
	
	public detalle() {
		super();
	}

	public detalle(int iddetalle, com.example.entity.cliente cliente, com.example.entity.producto producto) {
		super();
		this.iddetalle = iddetalle;
		this.cliente = cliente;
		this.producto = producto;
	}

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public producto getProducto() {
		return producto;
	}

	public void setProducto(producto producto) {
		this.producto = producto;
	}
	
	
	

}
