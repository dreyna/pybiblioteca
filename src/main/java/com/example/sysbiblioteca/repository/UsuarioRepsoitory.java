package com.example.sysbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Usuario;

@Repository
public interface UsuarioRepsoitory extends JpaRepository<Usuario, Long>{

}
