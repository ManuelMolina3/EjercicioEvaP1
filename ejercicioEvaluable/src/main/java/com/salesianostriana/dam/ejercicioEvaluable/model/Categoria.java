package com.salesianostriana.dam.ejercicioEvaluable.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @ManyToOne
    private Categoria padre;

    @OneToMany(mappedBy = "padre")
    private List<Categoria> hijo= new ArrayList<>();

    public void addPadre (Categoria c){
        this.hijo.add(c);

    }


}
