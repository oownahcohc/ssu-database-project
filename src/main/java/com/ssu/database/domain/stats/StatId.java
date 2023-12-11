package com.ssu.database.domain.stats;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class StatId implements Serializable {

	private Integer playerId;
	private Integer seasonId;

	protected StatId() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		StatId that = (StatId)o;
		return Objects.equals(playerId, that.playerId) && Objects.equals(seasonId, that.seasonId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(playerId, seasonId);
	}
}
