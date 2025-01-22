package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.cliente;

public interface Iservicecliente {
	public abstract List<cliente> listarclientes();
	public abstract void Agregar(cliente cliente);
}
