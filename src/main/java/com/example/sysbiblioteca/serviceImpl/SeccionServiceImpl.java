package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Seccion;
import com.example.sysbiblioteca.repository.SeccionRepository;
import com.example.sysbiblioteca.service.Operaciones;
@Service
public class SeccionServiceImpl implements Operaciones<Seccion>{
	
	@Autowired
	private SeccionRepository seccionRepository;

	@Override
	public Seccion create(Seccion t) {
		// TODO Auto-generated method stub
		return seccionRepository.save(t);
	}

	@Override
	public Seccion update(Seccion t) {
		// TODO Auto-generated method stub
		return seccionRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		seccionRepository.deleteById(id);
	}

	@Override
	public Optional<Seccion> read(Long id) {
		// TODO Auto-generated method stub
		return seccionRepository.findById(id);
	}

	@Override
	public List<Seccion> readAll() {
		// TODO Auto-generated method stub
		return seccionRepository.findAll();
	}

}
