package com.pokedex.pokedex.Controller;

import com.pokedex.pokedex.Model.Pokemon;
import com.pokedex.pokedex.Service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


    @GetMapping("/oi/{nome}")
    public String HelloWork(@PathVariable String nome){
        String saudacao = pokemonService.HelloWorld(nome);
            return saudacao;
    }
    @GetMapping("/tchau/{nome}")
    public String ByeWord(@PathVariable String nome){
        String tchau = pokemonService.ByeWorld(nome);
        return tchau;
    }

    @GetMapping("/pikachu")
    public String Pikachu(@PathVariable String pikachu){
        String pokemon = pokemonService.Pikachu(pikachu);
        return pokemon;
    }

    @PostMapping("/add")
    public String addPokemon(@RequestBody Pokemon pokemon){

        return pokemonService.adicionarPokemon(pokemon);
    }

    @GetMapping("/lista")
    public List<Pokemon> getLista(){
        return pokemonService.getLista();
    }
    @DeleteMapping("/excluir")
    public PokemonService.removerPokemon(@PathVariable );




}

