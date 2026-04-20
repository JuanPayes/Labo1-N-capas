package org.example.labo1.Common;

import org.example.labo1.Domain.Entities.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListaPokemon {
    private final List<Pokemon> pokemons;

    public ListaPokemon() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder()
                .id(1L)
                .name("Poliwirth")
                .type("Water")
                .weakness("Grass")
                .zona("Ruta 24")
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(2L)
                .name("Zoroak")
                .type("Dark")
                .weakness("Bug")
                .zona("Ruta 20")
                .region("Teselia")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(3L)
                .name("Tapu Koko")
                .type("Electric")
                .weakness("Ground")
                .zona("Mele-Mele Temple")
                .region("Alola")
                .build());
        this.pokemons.add(Pokemon.builder()
                .id(4L)
                .name("Ralts")
                .type("Psychic")
                .weakness("Dark")
                .zona("Ruta 103")
                .region("Hoenn")
                .build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
