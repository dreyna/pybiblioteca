package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Usuario;
import com.example.sysbiblioteca.repository.UsuarioRepsoitory;
import com.example.sysbiblioteca.service.Operaciones;
@Service
public class UsuarioServiceImpl implements Operaciones<Usuario>{
	
	@Autowired
	private UsuarioRepsoitory usuarioRepsoitory;

	@Override
	public Usuario create(Usuario t) {
		// TODO Auto-generated method stub
		return usuarioRepsoitory.save(t);
	}

	@Override
	public Usuario update(Usuario t) {
		// TODO Auto-generated method stub
		return usuarioRepsoitory.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioRepsoitory.deleteById(id);
	}

	@Override
	public Optional<Usuario> read(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepsoitory.findById(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioRepsoitory.findAll();
	}

}
