package com.example.examen.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.examen.entity.Libro;
import com.example.examen.repository.LibroRepository;
import com.example.examen.service.LibroService;


@Service
public class LibroServiceImpl implements LibroService {
@Autowired
private LibroRepository librosRepository;
	@Override
	public List<Libro> readall() {
		// TODO Auto-generated method stub
		return librosRepository.findAll();
	}

	@Override
	public Libro create(Libro al) {
		// TODO Auto-generated method stub
		return librosRepository.save(al);
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		return librosRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		librosRepository.deleteById(id);
		
	}

	@Override
	public Libro update(Libro al) {
		// TODO Auto-generated method stub
		return librosRepository.save(al);
	}

}
