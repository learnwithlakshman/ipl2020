package com.lwl.ipl.dto;

import com.lwl.ipl.domain.PlayerRole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlayerDTO {
	
	private String name;
	private String team;
	private PlayerRole role;
	private String label;
	private double price;
	public PlayerDTO(String name, String team, PlayerRole role, String label, double price) {
		super();
		this.name = name;
		this.team = team;
		this.role = role;
		this.label = label;
		this.price = price;
	}
	
	
	
	
	
	
}
