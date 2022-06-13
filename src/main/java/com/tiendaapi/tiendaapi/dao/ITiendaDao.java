package com.tiendaapi.tiendaapi.dao;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiendaapi.tiendaapi.entity.Tienda;

public interface ITiendaDao {
	public Iterable<Tienda> findAll(); //Devuelve un Iterable del objeto usuario 
	
	public Page<Tienda> findAll(Pageable pagebale);
	
	public Optional<Tienda> findById(Integer id); 
	
	public Tienda save(Tienda tienda);
	
	public void deleteById(Integer id);
 
 
}
