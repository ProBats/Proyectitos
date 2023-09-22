package ar.org.centro8.especialidad.web.interfaces.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.especialidad.web.interfaces.Entities.Candidato;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, Integer>{
    
}