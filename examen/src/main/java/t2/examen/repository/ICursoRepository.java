package t2.examen.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import t2.examen.controller.Curso;


public interface ICursoRepository extends JpaRepository<Curso, Long> {
}
