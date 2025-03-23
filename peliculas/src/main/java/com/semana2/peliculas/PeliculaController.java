package com.semana2.peliculas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1, "Pelicula1", 2000, "Davinci", "Ficción", "Entera fome"));
        peliculas.add(new Pelicula(2, "Pelicula2", 2001, "Davinci", "Ficción", "Entera fome"));
        peliculas.add(new Pelicula(3, "Pelicula3", 2002, "Davinci", "Ficción", "Entera fome"));
        peliculas.add(new Pelicula(4, "Pelicula4", 2003, "Davinci", "Ficción", "Entera fome"));
        peliculas.add(new Pelicula(5, "Pelicula5", 2004, "Davinci", "Ficción", "Entera fome"));
    }
    

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id){
                return pelicula;
            }
        }
        // Si no encuentra estudiante con id, lanzar excepción o null como en este caso
        return null;
    }
    
    
}