package com.ciandt.pokedex.service;

import java.util.List;
import java.util.Optional;

import com.ciandt.pokedex.entity.Pokemon;

public interface IPokemonService {
	
	public void save(Pokemon pokemon) throws Exception;
	
	public void update(Pokemon pokemon) throws Exception;

	public List<Pokemon> getAll();
	
	public Optional<Pokemon> getSingle(Long id) throws Exception;
	
	public void deleteSingle(Long id) throws Exception;
	
	public Optional<List<Pokemon>> getPokemonByName(String name);
		
}
 