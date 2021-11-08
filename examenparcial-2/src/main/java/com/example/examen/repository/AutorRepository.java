package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Autor;
@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
