package com.database.ssu.domain.stats;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class LeagueStats {

	@EmbeddedId
	private StatId statId;

	private Integer goals;
	private Integer assists;
	private Integer mins;
	private Float tackles_per_game;
	private Float intercepts_per_game;
	private Float average_passes_per_game;
	private Float rating;
	private Float offsides_per_game;
	private Float clears_per_game;
	private Float dribbles_per_game;
	private Float shots_per_game;
	private Float key_passes_per_game;

	protected LeagueStats() {
	}
}
