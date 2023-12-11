package com.ssu.database.domain.season;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Season {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false, length = 15)
	private String startYear;

	@Column(nullable = false, length = 15)
	private String endYear;

	protected Season() {
	}
}
