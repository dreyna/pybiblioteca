package com.example.sysbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Autor;
@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{

}
