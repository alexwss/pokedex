package com.ciandt.pokedex.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciandt.pokedex.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
	
	public Optional<List<Pokemon>> findByNameIgnoreCaseContaining(String name);

}
