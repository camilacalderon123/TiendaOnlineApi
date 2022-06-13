package com.tiendaapi.tiendaapi.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import com.tiendaapi.tiendaapi.entity.Tienda;
import com.tiendaapi.tiendaapi.repository.TiendaRepository;

public class TeindaDao implements ITiendaDao{
	
	@Autowired
	private TiendaRepository tiendaRepository;

	@Override
	@Transactional(readOnly=true)
	public Iterable<Tienda> findAll() {
		return tiendaRepository.findAll();
	}
	
	//NO LO IMPLEMENTO
	@Override
	public Page<Tienda> findAll(Pageable pagebale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Tienda> findById(Integer id) {
		return tiendaRepository.findById(id);
	}

	@Override
	public Tienda save(Tienda tienda) {
		return tiendaRepository.save(tienda);
	}

	@Override
	public void deleteById(Integer id) {
		tiendaRepository.deleteById(id);
		
	}

}
