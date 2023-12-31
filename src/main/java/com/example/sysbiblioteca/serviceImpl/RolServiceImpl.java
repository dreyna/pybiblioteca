package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Rol;
import com.example.sysbiblioteca.repository.RolRepository;
import com.example.sysbiblioteca.service.Operaciones;
@Service
public class RolServiceImpl implements Operaciones<Rol>{
	
	@Autowired
	private RolRepository rolRepository;

	@Override
	public Rol create(Rol t) {
		// TODO Auto-generated method stub
		return rolRepository.save(t);
	}

	@Override
	public Rol update(Rol t) {
		// TODO Auto-generated method stub
		return rolRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolRepository.deleteById(id);
	}

	@Override
	public Optional<Rol> read(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}
