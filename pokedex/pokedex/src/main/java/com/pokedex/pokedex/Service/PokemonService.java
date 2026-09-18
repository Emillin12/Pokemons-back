package com.pokedex.pokedex.Service;


import com.pokedex.pokedex.Model.Pokemon;
import com.pokedex.pokedex.Repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Pokemon> getLista(){

        return pokemonRepository.getLista();
    }


    public String adicionarPokemon(Pokemon pokemon){


        return pokemonRepository.addPokemon(pokemon);
    }



    public Pokemon buscarPokemon() {

        return pokemonRepository.PegarPokemon();
    }

    public String updatePokemon(String nome, Pokemon pokemon){
        return pokemonRepository.updatePokemon(nome, pokemon);
    }

    public String DeletePokemon(String nome)
}
