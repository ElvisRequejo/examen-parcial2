package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Editorial;
@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Integer> {

}
