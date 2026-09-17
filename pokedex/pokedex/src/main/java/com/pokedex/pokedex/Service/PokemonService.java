package com.pokedex.pokedex.Service;


import com.pokedex.pokedex.Repository.PokemonRepository;
import org.springframework.stereotype.Service;
@Service
public class PokemonService {

    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public String HelloWorld(String nome){
        return "Hello " + pokemonRepository.MostrarNome();
    }

    public String ByeWorld(String nome){
        return "Bye " + nome;
    }

    public String Pikachu(String pikachu) {
        return "pokemon: " + pokemonRepository.PegarPokemon() ;
    }
}
