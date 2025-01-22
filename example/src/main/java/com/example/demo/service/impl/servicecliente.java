package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.cliente;
import com.example.demo.repository.Irepositorycliente;
import com.example.demo.service.Iservicecliente;

@Service("servicecliente")
public class servicecliente implements Iservicecliente{

	@Autowired
	@Qualifier("repositorycliente")
	private Irepositorycliente repositorycliente;
	
	@Override
	public List<cliente> listarclientes() {
		return repositorycliente.findAll();
	}

	@Override
	public void Agregar(cliente cliente) {
		repositorycliente.save(cliente);
	}
	
	@Override
	public cliente buscarPorId(int id) {
	    return repositorycliente.findById(id).orElse(null);
	}

	@Override
	public void Eliminar(int id) {
	    repositorycliente.deleteById(id);
	}
	
	@Override
	public List<cliente> buscarPorNombre(String nombre) {
	    return repositorycliente.findByNombreContaining(nombre);
	}


}
