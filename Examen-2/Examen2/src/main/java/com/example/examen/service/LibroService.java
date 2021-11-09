package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Libro;



public interface LibroService {
	List<Libro> readall();
	Libro create(Libro al);
	Libro read(int id);
	void delete(int id);
	Libro update(Libro al);
}
