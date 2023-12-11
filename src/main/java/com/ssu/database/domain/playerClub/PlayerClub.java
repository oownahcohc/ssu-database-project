package com.ssu.database.domain.playerClub;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerClub {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private Integer playerId;

	@Column(nullable = false)
	private Integer clubId;

	@Column(nullable = false)
	private Integer seasonId;

	protected PlayerClub() {
	}
}
