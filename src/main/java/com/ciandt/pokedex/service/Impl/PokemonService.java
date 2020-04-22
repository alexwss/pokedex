package com.ciandt.pokedex.service.Impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciandt.pokedex.entity.Pokemon;
import com.ciandt.pokedex.repository.PokemonRepository;
import com.ciandt.pokedex.service.IPokemonService;

@Service
@Transactional
public class PokemonService implements IPokemonService{
	
	@Autowired
	private PokemonRepository pokemonRepository;

	@Override
	public void save(Pokemon pokemon) throws Exception{
		pokemonRepository.save(pokemon);
	}

	@Override
	public List<Pokemon> getAll() {
		return pokemonRepository.findAll();
	}

	@Override
	public Optional<Pokemon> getSingle(Long id) throws Exception {
		return pokemonRepository.findById(id);
	}

	@Override
	public void update(Pokemon pokemon) throws Exception {
		pokemonRepository.findById(pokemon.getId()).map(poke -> {
			poke.setName(pokemon.getName());
			poke.setPower(pokemon.getPower());
			
			return pokemonRepository.save(poke);
		});
	}

	@Override
	public void deleteSingle(Long id) throws Exception {
		pokemonRepository.deleteById(id);
	}

	@Override
	public Optional<List<Pokemon>> getPokemonByName(String name) {
		return pokemonRepository.findByNameIgnoreCaseContaining(name);
	}

}
