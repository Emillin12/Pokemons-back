package com.pokedex.pokedex.Repository;

import com.pokedex.pokedex.Model.Pokemon;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PokemonRepository {

    private String nome = "Kaun Kralho";
    private String tipo = " feioso";
    private List<Pokemon> listaPokemon;

    public PokemonRepository(List<Pokemon> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }

    public PokemonRepository() {
        this.nome = "pikachu";
        this.tipo = "elétrico";
    }

    public String MostrarNome(){
        return nome;
    }

    public Pokemon PegarPokemon(){
        Pokemon pikachu =  new Pokemon ("Pikachu", "raio" );
                return pikachu;
    }

    public String addPokemon(Pokemon pokemon){
        this.listaPokemon.add(pokemon);

        return "Deu certo!";
    }

    public List<Pokemon> getLista(){
        return this.listaPokemon;
    }
}
