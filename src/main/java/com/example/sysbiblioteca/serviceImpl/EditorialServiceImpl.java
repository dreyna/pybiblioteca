package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Editorial;
import com.example.sysbiblioteca.repository.EditorialRepository;
import com.example.sysbiblioteca.service.Operaciones;

@Service
public class EditorialServiceImpl implements Operaciones<Editorial>{
	
	@Autowired
	private EditorialRepository editorialRepository;

	@Override
	public Editorial create(Editorial t) {
		// TODO Auto-generated method stub
		return editorialRepository.save(t);
	}

	@Override
	public Editorial update(Editorial t) {
		// TODO Auto-generated method stub
		return editorialRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		editorialRepository.deleteById(id);
	}

	@Override
	public Optional<Editorial> read(Long id) {
		// TODO Auto-generated method stub
		return editorialRepository.findById(id);
	}

	@Override
	public List<Editorial> readAll() {
		// TODO Auto-generated method stub
		return editorialRepository.findAll();
	}
	

}
