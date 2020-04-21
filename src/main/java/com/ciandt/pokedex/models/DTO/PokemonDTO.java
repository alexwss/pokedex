package com.ciandt.pokedex.models.DTO;

import com.ciandt.pokedex.entity.Pokemon;

public class PokemonDTO {
	
	public Long id;
	
	public String name;
	
	public Long power;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPower() {
		return power;
	}

	public void setPower(Long power) {
		this.power = power;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
	
	public Pokemon parseToEntity() {
		Pokemon poke = new Pokemon();
		
		if(id != null) {
			poke.setId(id);
		}
		
		poke.setName(getName());
		poke.setPower(getPower());
		
		return poke;
	}
	
}
