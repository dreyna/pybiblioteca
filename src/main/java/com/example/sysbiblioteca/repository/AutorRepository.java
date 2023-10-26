package com.example.sysbiblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sysbiblioteca.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
	
	@Query(value = "SELECT u FROM Autor u WHERE u.nombres = ?1", nativeQuery = true)
	Autor findAutorByNombresNative(String nombres);
	
	@Query("SELECT u FROM Autor u WHERE u.nombres LIKE ?1%")
	List<Autor> searchByNombresStartsWith(String nombres);

}
