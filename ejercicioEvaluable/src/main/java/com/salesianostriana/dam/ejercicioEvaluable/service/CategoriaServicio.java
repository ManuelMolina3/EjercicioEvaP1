package com.salesianostriana.dam.ejercicioEvaluable.service;

import com.salesianostriana.dam.ejercicioEvaluable.model.Categoria;
import com.salesianostriana.dam.ejercicioEvaluable.repository.CategoriaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaServicio {

    private final CategoriaRepositorio repositorio;

    public List<Categoria> findAll (){
        return repositorio.findAll();
    }
    public Optional<Categoria> findById (Long id){
        return repositorio.findById(id);
    }
}
