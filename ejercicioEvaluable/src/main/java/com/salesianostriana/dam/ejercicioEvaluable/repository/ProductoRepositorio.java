package com.salesianostriana.dam.ejercicioEvaluable.repository;

import com.salesianostriana.dam.ejercicioEvaluable.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
}
