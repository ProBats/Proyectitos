package ar.org.centro8.especialidad.web.interfaces.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.org.centro8.especialidad.web.interfaces.repositories.CandidatoRepository;

@Controller
public class EmpresaController {

    @Autowired
    private CandidatoRepository cr;

    @GetMapping("/empresa")
    public String getCandidato(){
        cr.findAll().forEach(System.out::println);
        return "empresa";
    }
}
