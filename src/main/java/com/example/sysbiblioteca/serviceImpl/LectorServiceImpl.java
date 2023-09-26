package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Lector;
import com.example.sysbiblioteca.repository.LectorRepository;
import com.example.sysbiblioteca.service.Operaciones;
@Service
public class LectorServiceImpl implements Operaciones<Lector>{
	
	@Autowired
	private LectorRepository lectorRepository;

	@Override
	public Lector create(Lector t) {
		// TODO Auto-generated method stub
		return lectorRepository.save(t);
	}

	@Override
	public Lector update(Lector t) {
		// TODO Auto-generated method stub
		return lectorRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		lectorRepository.deleteById(id);
	}

	@Override
	public Optional<Lector> read(Long id) {
		// TODO Auto-generated method stub
		return lectorRepository.findById(id);
	}

	@Override
	public List<Lector> readAll() {
		// TODO Auto-generated method stub
		return lectorRepository.findAll();
	}

}
