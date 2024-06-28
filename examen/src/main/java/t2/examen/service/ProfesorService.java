package t2.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import t2.examen.controller.Profesor;
import t2.examen.repository.IProfesorRepository;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    IProfesorRepository repositorio;

    public List<Profesor> listarProfesores() {
        return repositorio.findAll();
    }

    public Profesor guardarProfesor(Profesor profesor) {
        return repositorio.save(profesor); 
    }

    public Profesor buscarProfesor(Long id) {
        return repositorio.findById(id).orElse(null); 
    }

    public void eliminarProfesor(Long id) {
        repositorio.deleteById(id);
    }
}