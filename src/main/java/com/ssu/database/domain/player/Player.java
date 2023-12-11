package com.ssu.database.domain.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 50)
	private String name;

	@Column(nullable = false)
	private Integer currentAge;

	@Column(nullable = false, length = 50)
	private String position;

	protected Player() {
	}
}
