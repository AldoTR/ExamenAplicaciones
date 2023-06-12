package org.uv.examenaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.uv.examenaldo.entities.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, String>{

}
