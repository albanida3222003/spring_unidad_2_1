package com.example.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.detalle;

@Repository("repositorydetalle")
public interface Irepositorydetalle extends JpaRepository<detalle, Serializable> {

	@Query(value = "select * from detalle \r\n"
			   + "where idcliente = ?1", nativeQuery = true)
			 List<detalle> listarProductosSegunIdCliente(int idcliente);


}
