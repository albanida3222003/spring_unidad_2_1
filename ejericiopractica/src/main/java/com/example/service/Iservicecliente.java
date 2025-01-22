package com.example.service;

import java.util.List;

import com.example.entity.cliente;

public interface Iservicecliente {
	public abstract List<cliente> listarclientes();
	public abstract void Agregar(cliente cliente);
}
