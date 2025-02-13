package com.example.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evento.entities.Atividade;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {

}
