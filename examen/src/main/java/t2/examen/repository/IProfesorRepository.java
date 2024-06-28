package t2.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import t2.examen.controller.Profesor;

public interface IProfesorRepository extends JpaRepository<Profesor, Long> {
}