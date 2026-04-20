package org.example.labo1.Repositories;

import lombok.RequiredArgsConstructor;
import org.example.labo1.Common.ListaPokemon;
import org.example.labo1.Domain.Entities.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {

    private final ListaPokemon listaPokemon;

    public List<Pokemon> findAllPokemons(){
        return listaPokemon.getPokemons();
    }
}
