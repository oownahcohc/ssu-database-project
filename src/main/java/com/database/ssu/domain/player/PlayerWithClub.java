package com.database.ssu.domain.player;

public class PlayerWithClub {

	private final int playerId;
	private final String playerName;
	private final String position;
	private final int seasonId;
	private final String season;
	private final String clubName;
	private final String clubNation;

	public PlayerWithClub(int playerId, String playerName, String position, int seasonId, String season,
		String clubName, String clubNation) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.position = position;
		this.seasonId = seasonId;
		this.season = season;
		this.clubName = clubName;
		this.clubNation = clubNation;
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

	public String getClubName() {
		return clubName;
	}

	public String getClubNation() {
		return clubNation;
	}
}
