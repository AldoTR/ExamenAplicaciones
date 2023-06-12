package org.uv.examenaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.uv.examenaldo.entities.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, String>{

}