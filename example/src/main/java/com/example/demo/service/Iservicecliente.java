package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.cliente;

public interface Iservicecliente {
	public abstract List<cliente> listarclientes();
	public abstract void Agregar(cliente cliente);
	public abstract cliente buscarPorId(int id);
	public abstract void Eliminar(int id);
	public abstract List<cliente> buscarPorNombre(String nombre);

}
