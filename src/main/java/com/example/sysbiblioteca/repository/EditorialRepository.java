package com.example.sysbiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sysbiblioteca.entity.Editorial;
@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Long>{

}
