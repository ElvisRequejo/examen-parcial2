package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Autor;



public interface AutorService {
	List<Autor> readall();
	Autor create(Autor al);
	Autor read(int id);
	void delete(int id);
	Autor update(Autor al);
}
