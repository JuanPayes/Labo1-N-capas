package org.example.labo1.Runner;

import lombok.RequiredArgsConstructor;
import org.example.labo1.Services.PokemonServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ServiceRunner implements CommandLineRunner {

    private final PokemonServices pokemonServices;

    @Override
    public void run(String ... args) {
        System.out.println("=== TODOS ===");
        pokemonServices.findAll()
                .forEach(p -> System.out.println(p.getName()));

        System.out.println("=== FILTRO TIPO Water ===");
        pokemonServices.filtrarTipo("Water").forEach(p -> System.out.println(p.getName()));

        System.out.println("=== FILTRO ZONA Bosque ===");
        pokemonServices.filtrarZona("Bosque").forEach(p -> System.out.println(p.getName()));

        System.out.println("=== FILTRO WEAKNESS ===");
        pokemonServices.filtrarWeakness().forEach(p -> System.out.println(p.getName()));

    }


}
