package com.pokedex.pokedex.Controller;

import com.pokedex.pokedex.Service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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



}

