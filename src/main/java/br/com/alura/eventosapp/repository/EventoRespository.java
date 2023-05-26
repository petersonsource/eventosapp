package br.com.alura.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.eventosapp.models.Evento;

@Repository
public interface EventoRespository extends CrudRepository<Evento, Long>{
	
	Evento findByCodigo(long id);
	
}
