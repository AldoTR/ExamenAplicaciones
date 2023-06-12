package org.uv.examenaldo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.uv.examenaldo.entities.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long>{

}