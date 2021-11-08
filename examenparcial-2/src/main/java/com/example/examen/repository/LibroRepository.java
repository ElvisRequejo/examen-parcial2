package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
