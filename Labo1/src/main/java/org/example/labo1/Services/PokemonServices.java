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

    public List<Pokemon> filtrarTipo(String type){
        List<Pokemon> typesList = pokemonRepository.findAllPokemons().stream()
                .filter(obj -> obj.getType().equals(type))
                .toList();
        return typesList;
    }

    public List<Pokemon> filtrarZona(String zone){
        List<Pokemon> zonelist = pokemonRepository.findAllPokemons().stream()
                .filter(obj -> obj.getZona().equals(zone))
                .toList();
        return zonelist;
    }

    public List<Pokemon> filtrarWeakness(){
        List<Pokemon> weaknesslist = pokemonRepository.findAllPokemons().stream()
                .filter(obj -> obj.getWeakness().equals(List.of("Dark", "Ghost", "Bug")))
                .toList();
        return weaknesslist;
    }
}
