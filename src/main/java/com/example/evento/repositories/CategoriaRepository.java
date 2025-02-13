package com.example.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evento.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
