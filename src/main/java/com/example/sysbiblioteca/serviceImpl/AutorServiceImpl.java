package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Autor;
import com.example.sysbiblioteca.repository.AutorRepository;
import com.example.sysbiblioteca.service.Operaciones;
@Service
public class AutorServiceImpl implements Operaciones<Autor>{
	
	@Autowired
	private AutorRepository autorRepository;

	@Override
	public Autor create(Autor t) {
		// TODO Auto-generated method stub
		return autorRepository.save(t);
	}

	@Override
	public Autor update(Autor t) {
		// TODO Auto-generated method stub
		return autorRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		autorRepository.deleteById(id);
		
	}

	@Override
	public Optional<Autor> read(Long id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id);
	}

	@Override
	public List<Autor> readAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

	public Autor searchAutor(String nombres) {		
		return autorRepository.findAutorByNombresNative(nombres);
	}
	public List<Autor> searchAutorNombres(String nombres) {		
		return autorRepository.searchByNombresStartsWith(nombres);
	}
}
