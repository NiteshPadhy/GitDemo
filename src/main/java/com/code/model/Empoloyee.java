package com.code.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Empoloyee {
	
	private String id;
	private String name;
	private String email;

}
