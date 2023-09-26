package com.example.sysbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Seccion;

@Repository
public interface SeccionRepository extends JpaRepository<Seccion, Long>{

}
