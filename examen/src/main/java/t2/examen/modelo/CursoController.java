package t2.examen.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import t2.examen.controller.Curso;
import t2.examen.service.CursoService;

import java.util.List;

@CrossOrigin
@RequestMapping("/api/cursos")
@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarCursos();
    }
}