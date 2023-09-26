package com.example.sysbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long>{

}
