package com.ciandt.pokedex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciandt.pokedex.entity.Pokemon;
import com.ciandt.pokedex.models.DTO.PokemonDTO;
import com.ciandt.pokedex.service.Impl.PokemonService;

@RestController("/pokedex")
public class PokedexController {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/pokedex")
	public List<Pokemon> getAll(){
		return pokemonService.getAll();
	}
	
	@GetMapping("/pokedex/{id}")
	public Optional<Pokemon> getPokemon(@PathVariable("id") Long id) throws Exception {
		return pokemonService.getSingle(id);
	}
	
	@PutMapping("/pokedex/{id}")
	public Pokemon updatePokemon(@PathVariable("id") Long id, @RequestBody PokemonDTO pokeDTO) throws Exception {
		pokeDTO.id = id;
		pokemonService.update(pokeDTO.parseToEntity());
		return pokeDTO.parseToEntity();
	}	
	
	@PostMapping("/pokedex")
	public void post(@RequestBody PokemonDTO pokemonDTO) throws Exception {
		pokemonService.save(pokemonDTO.parseToEntity());
	}
	
	@DeleteMapping("/pokedex/{id}")
	public void delete(@PathVariable("id") Long id) throws Exception{
		pokemonService.deleteSingle(id);
	}
	
	@GetMapping("/pokedex/find/{name}")
	public Optional<List<Pokemon>> findPokemon(@PathVariable String name){
		return pokemonService.getPokemonByName(name);
	}

}
