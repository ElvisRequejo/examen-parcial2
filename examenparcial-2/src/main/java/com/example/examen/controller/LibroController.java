package com.example.examen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Libro;
import com.example.examen.service.LibroService;

@RestController
@RequestMapping("/api/libros")
public class LibroController {
	@Autowired
	private LibroService libroService;
	@GetMapping("/all")
	public ResponseEntity<List<Libro>> getPersona(){
		try {
			List<Libro> list = new ArrayList<>();
			list = libroService.readall();
			if(list.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/read/{id}")
	public ResponseEntity<Libro> getLibro(@PathVariable("id") int id){
		Libro libro = libroService.read(id);
			if(libro.getId()>0) {
				return new ResponseEntity<>(libro, HttpStatus.OK);
			}else {
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} 
	}
	@PostMapping("/insert")
	public ResponseEntity<Libro> save(@RequestBody Libro libro){
		try {
			Libro a = new Libro();
			
			a.setId(libro.getId());
			a.setTitulo(libro.getTitulo());
			a.setDescripcion(libro.getDescripcion());
			a.setPaginas(libro.getPaginas());
			a.setAutor(libro.getAutor());
			a.setEditorial(libro.getEditorial());
			Libro al = libroService.create(a);
			return new ResponseEntity<>(al, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Libro> update(@RequestBody Libro libro, @PathVariable("id") int id){
		try {
			Libro a = libroService.read(id);
			if(a.getId()>0) {
				
				
				a.setTitulo(libro.getTitulo());
				a.setDescripcion(libro.getDescripcion());
				a.setPaginas(libro.getPaginas());
				a.setAutor(libro.getAutor());
				a.setEditorial(libro.getEditorial());
				return new ResponseEntity<>(libroService.create(a),HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}			

		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") int id){
		try {
			libroService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
