package com.lwl.ipl.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
	
	private String name;
	private String team;
	private String role;
	private String label;
	private double price;
	
}
