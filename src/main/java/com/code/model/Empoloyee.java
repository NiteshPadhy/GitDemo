package com.code.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Empoloyee {
	
	private String emp_id;
	private String emp_name;

}
