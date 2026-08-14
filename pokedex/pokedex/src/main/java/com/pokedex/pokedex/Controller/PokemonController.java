package com.pokedex.pokedex.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @GetMapping("/oi/{nome}")
    public String HelloWork(@PathVariable String nome){
        return "Hello " + nome;
    }
    @GetMapping("/tchau/{nome}")
    public String ByeWord(@PathVariable String nome){
        return "Bye " + nome;
    }
}

