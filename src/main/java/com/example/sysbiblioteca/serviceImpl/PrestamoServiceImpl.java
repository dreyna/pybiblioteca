package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Prestamo;
import com.example.sysbiblioteca.repository.PrestamoRepository;
import com.example.sysbiblioteca.service.Operaciones;
@Service
public class PrestamoServiceImpl implements Operaciones<Prestamo>{
	
	@Autowired
	private PrestamoRepository prestamoRepository;

	@Override
	public Prestamo create(Prestamo t) {
		// TODO Auto-generated method stub
		return prestamoRepository.save(t);
	}

	@Override
	public Prestamo update(Prestamo t) {
		// TODO Auto-generated method stub
		return prestamoRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		prestamoRepository.deleteById(id);
	}

	@Override
	public Optional<Prestamo> read(Long id) {
		// TODO Auto-generated method stub
		return prestamoRepository.findById(id);
	}

	@Override
	public List<Prestamo> readAll() {
		// TODO Auto-generated method stub
		return prestamoRepository.findAll();
	}

}
