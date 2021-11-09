package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
	

}
