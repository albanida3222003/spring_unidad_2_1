package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.entity.cliente;
import com.example.repository.Irepositorycliente;
import com.example.service.Iservicecliente;

@Service("servicecliente")
public class servicecliente implements Iservicecliente {
	
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
	
	

}
