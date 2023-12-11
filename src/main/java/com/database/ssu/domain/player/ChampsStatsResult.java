package com.database.ssu.domain.player;

public class ChampsStatsResult {

	private final int playerId;
	private final String playerName;
	private final String position;
	private final int seasonId;
	private final String season;
	private final float mins;
	private final int goals;
	private final int assists;
	private final float tacklesPerGame;
	private final float interceptsPerGame;
	private final float rating;
	private final float averagePassesPerGame;

	public ChampsStatsResult(int playerId, String playerName, String position, int seasonId, String season,
		float mins, int goals, int assists, float tacklesPerGame, float interceptsPerGame, float rating,
		float averagePassesPerGame) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.position = position;
		this.seasonId = seasonId;
		this.season = season;
		this.mins = mins;
		this.goals = goals;
		this.assists = assists;
		this.tacklesPerGame = tacklesPerGame;
		this.interceptsPerGame = interceptsPerGame;
		this.rating = rating;
		this.averagePassesPerGame = averagePassesPerGame;
	}

	public int getPlayerId() {
		return playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPosition() {
		return position;
	}

	public int getSeasonId() {
		return seasonId;
	}

	public String getSeason() {
		return season;
	}

	public float getMins() {
		return mins;
	}

	public int getGoals() {
		return goals;
	}

	public int getAssists() {
		return assists;
	}

	public float getTacklesPerGame() {
		return tacklesPerGame;
	}

	public float getInterceptsPerGame() {
		return interceptsPerGame;
	}

	public float getRating() {
		return rating;
	}

	public float getAveragePassesPerGame() {
		return averagePassesPerGame;
	}
}
