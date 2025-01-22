package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.entity.detalle;
import com.example.repository.Irepositorydetalle;
import com.example.service.Iservicedetalle;

@Service("servicedetalle")
public class servicedetalle implements Iservicedetalle{
	@Autowired
	@Qualifier("repositorydetalle")
	private Irepositorydetalle repositorydetalle;
	

	@Override
	public List<detalle> listarpordutosseguncliente(int id) {		
		return repositorydetalle.listarProductosSegunIdCliente(id);
	}

}
