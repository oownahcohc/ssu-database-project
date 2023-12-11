package com.database.ssu.domain.club;

public class ClubPlayerResult {

	private final String clubName;
	private final String clubNation;
	private final String playerName;
	private final String position;

	public ClubPlayerResult(String clubName, String clubNation, String playerName, String position) {
		this.clubName = clubName;
		this.clubNation = clubNation;
		this.playerName = playerName;
		this.position = position;
	}

	public String getClubName() {
		return clubName;
	}

	public String getClubNation() {
		return clubNation;
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getPosition() {
		return position;
	}
}
