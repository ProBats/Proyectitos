package ar.org.centro8.especialidad.web.interfaces.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.org.centro8.especialidad.web.interfaces.Entities.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa,Integer>{
    
}
