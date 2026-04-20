package org.example.labo1.Services;

import lombok.RequiredArgsConstructor;
import org.example.labo1.Common.ListaPokemon;
import org.example.labo1.Domain.Entities.Pokemon;
import org.example.labo1.Repositories.PokemonRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonServices {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> findAll() {
        return pokemonRepository.findAllPokemons();
    }

    public void filtrarTipo(){
        List<Pokemon> typesList = pokemonRepository.findAllPokemons().stream()
                .filter(obj -> obj.getType() == "Water")
                .toList();
    }

    public void filtrarZona(){
        List<Pokemon> zonelist = pokemonRepository.findAllPokemons().stream()
                .filter(obj -> obj.getZona() == "Lago")
                .toList();
    }

    public void filtrarWeakness(){
        List<Pokemon> weaknesslist = pokemonRepository.findAllPokemons().stream()
                .filter(obj -> obj.getWeakness() == List.of("Dark", "Ghost", "Bug"))
                .toList();
    }
}
