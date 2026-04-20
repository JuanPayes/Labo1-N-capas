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
                .weakness(List.of("Electric", "Grass"))
                .zona("Lago")
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(2L)
                .name("Zoroak")
                .type("Dark")
                .weakness(List.of("Bug", "Fighting", "Fairy"))
                .zona("Bosque")
                .region("Teselia")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(3L)
                .name("Tapu Koko")
                .type("Fairy")
                .weakness(List.of("Poison", "Steel"))
                .zona("Mele-Mele Temple")
                .region("Alola")
                .build());
        this.pokemons.add(Pokemon.builder()
                .id(4L)
                .name("Ralts")
                .type("Psychic")
                .weakness(List.of("Dark", "Ghost", "Bug"))
                .zona("Bosque")
                .region("Hoenn")
                .build());
        this.pokemons.add(Pokemon.builder()
                .id(5L)
                .name("Kyogre")
                .type("Water")
                .weakness(List.of("Electric", "Grass"))
                .zona("Cueva Origen")
                .region("Hoenn")
                .build());
        this.pokemons.add(Pokemon.builder()
                .id(6L)
                .name("Mudkip")
                .type("Water")
                .weakness(List.of("Electric", "Grass"))
                .zona("Lago")
                .region("Hoenn")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(7L)
                .name("Sharpedo")
                .type("Water")
                .weakness(List.of("Electric", "Grass"))
                .zona("Mar")
                .region("Hoenn")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(8L)
                .name("Absol")
                .type("Dark")
                .weakness(List.of("Bug", "Fighting", "Fairy"))
                .zona("Bosque")
                .region("Hoenn")
                .build());

        this.pokemons.add(Pokemon.builder()
                .id(9L)
                .name("Gardevoir")
                .type("Psychic")
                .weakness(List.of("Dark", "Ghost", "Bug"))
                .zona("Ciudad")
                .region("Hoenn")
                .build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}
