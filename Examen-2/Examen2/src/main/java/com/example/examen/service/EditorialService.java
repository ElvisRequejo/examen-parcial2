package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Editorial;



public interface EditorialService  {
	List<Editorial> readall();
	Editorial create(Editorial al);
	Editorial read(int id);
	void delete(int id);
	Editorial update(Editorial al);
}
