package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.cliente;

@Repository("repositorycliente")
public interface Irepositorycliente extends JpaRepository<cliente,Serializable>{

}
