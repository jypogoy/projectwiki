package com.amdatex.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Container {

	@Id
	@GeneratedValue
	private Long id;
	
}
