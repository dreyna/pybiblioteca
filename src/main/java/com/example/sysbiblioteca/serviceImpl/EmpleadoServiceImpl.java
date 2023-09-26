package com.example.sysbiblioteca.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sysbiblioteca.entity.Empleado;
import com.example.sysbiblioteca.repository.EmpleadoRepository;
import com.example.sysbiblioteca.service.Operaciones;

@Service
public class EmpleadoServiceImpl implements Operaciones<Empleado>{
	
	@Autowired
	private EmpleadoRepository empleadoRepository;

	@Override
	public Empleado create(Empleado t) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(t);
	}

	@Override
	public Empleado update(Empleado t) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
