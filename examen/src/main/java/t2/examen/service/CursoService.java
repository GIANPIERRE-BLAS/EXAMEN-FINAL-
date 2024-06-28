package t2.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import t2.examen.controller.Curso;
import t2.examen.repository.ICursoRepository;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    ICursoRepository repositorio;

    public List<Curso> listarCursos() {
        return repositorio.findAll();
    }

    public Curso guardarCurso(Curso curso) {
        return repositorio.save(curso); 
    }

    public Curso buscarCurso(Long id) {
        return repositorio.findById(id).orElse(null); 
    }

    public void eliminarCurso(Long id) {
        repositorio.deleteById(id);
    }
}
