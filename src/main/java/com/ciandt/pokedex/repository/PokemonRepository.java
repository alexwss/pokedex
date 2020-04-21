package com.ciandt.pokedex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciandt.pokedex.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {

}
