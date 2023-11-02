package com.salesianostriana.dam.ejercicioEvaluable.service;


import com.salesianostriana.dam.ejercicioEvaluable.model.Producto;
import com.salesianostriana.dam.ejercicioEvaluable.repository.ProductoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductoServicio {

    private final ProductoRepositorio repositorio;

    public List<Producto> findAll (){
        return repositorio.findAll();
    }
    public Optional<Producto> findById (Long id){
        return repositorio.findById(id);
    }
}
