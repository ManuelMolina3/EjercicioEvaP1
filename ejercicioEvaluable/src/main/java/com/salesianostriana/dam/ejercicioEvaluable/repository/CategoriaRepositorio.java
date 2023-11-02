package com.salesianostriana.dam.ejercicioEvaluable.repository;

import com.salesianostriana.dam.ejercicioEvaluable.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
}
