package br.com.alura.eventosapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.eventosapp.models.Convidado;
import br.com.alura.eventosapp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>  {
	
	Iterable<Convidado> findByEvento(Evento evento);
	
	Convidado findByRg(String rg);
	
}
