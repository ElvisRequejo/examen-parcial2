package com.example.examen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Libro;
import com.example.examen.repository.LibroRepository;
import com.example.examen.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository libroRepository;

	@Override
	public List<Libro> readall() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

	@Override
	public Libro create(Libro al) {
		// TODO Auto-generated method stub
		return libroRepository.save(al);
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		return libroRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		libroRepository.deleteById(id);
		
	}

	@Override
	public Libro update(Libro al) {
		// TODO Auto-generated method stub
		return libroRepository.save(al);
	}

	

}
