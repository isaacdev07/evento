package com.example.evento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evento.entities.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {

}
