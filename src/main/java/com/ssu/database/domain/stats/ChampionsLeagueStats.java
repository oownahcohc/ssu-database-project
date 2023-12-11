package com.ssu.database.domain.stats;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class ChampionsLeagueStats {

	@EmbeddedId
	private StatId statId;

	private Integer goals;
	private Integer assists;
	private Float mins;
	private Float tackles_per_game;
	private Float intercepts_per_game;
	private Float pass_success_rate;
	private Float average_passes_per_game;
	private Float rating;

	protected ChampionsLeagueStats() {
	}
}
