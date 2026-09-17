package com.pokedex.pokedex.Repository;

import com.pokedex.pokedex.Model.Pokemon;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepository {

    private String nome;

    public PokemonRepository() {
        this.nome = "pikachu";
    }

    public String MostrarNome(){
        return nome;
    }

    public Pokemon PegarPokemon(){
        Pokemon pikachu =  new Pokemon ("Pikachu", "raio" );
                return pikachu;
    }
}
