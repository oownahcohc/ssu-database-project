package com.database.ssu.domain.player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	@Query(
		"SELECT new com.database.ssu.domain.player.PlayerWithClub("
			+ "p.id, p.name, p.position, "
			+ "s.id, CONCAT(s.startYear, '-', s.endYear), c.name, c.nation) "
			+ "FROM Player p "
			+ "LEFT JOIN PlayerClub pc ON p.id = pc.playerId "
			+ "LEFT JOIN Club c ON pc.clubId = c.id "
			+ "LEFT JOIN Season s ON pc.seasonId = s.id "
			+ "WHERE p.name LIKE CONCAT('%', :name, '%') ")
	List<PlayerWithClub> searchPlayerInfoBy(String name);

	@Query(
		"SELECT new com.database.ssu.domain.player.LeagueStatsResult("
			+ "p.id, p.name, p.position, s.id, CONCAT(s.startYear, '-', s.endYear), "
			+ "ls.mins, ls.goals, ls.assists, ls.tackles_per_game, ls.intercepts_per_game, "
			+ "ls.offsides_per_game, ls.clears_per_game, ls.dribbles_per_game, "
			+ "ls.rating, ls.shots_per_game, ls.key_passes_per_game, ls.average_passes_per_game) "
			+ "FROM Player p "
			+ "LEFT JOIN LeagueStats ls ON p.id = ls.statId.playerId "
			+ "LEFT JOIN Season s ON ls.statId.seasonId = s.id "
			+ "WHERE ls.statId.seasonId = :seasonId AND ls.statId.playerId = :playerId")
	List<LeagueStatsResult> searchLeagueStatBy(int playerId, int seasonId);

	@Query(
		"SELECT new com.database.ssu.domain.player.ChampsStatsResult("
			+ "p.id, p.name, p.position, s.id, "
			+ "CONCAT(s.startYear, '-', s.endYear), "
			+ "cls.mins, cls.goals, cls.assists, cls.tackles_per_game, "
			+ "cls.intercepts_per_game, cls.rating, cls.average_passes_per_game) "
			+ "FROM Player p "
			+ "LEFT JOIN ChampionsLeagueStats cls ON p.id = cls.statId.playerId "
			+ "LEFT JOIN Season s ON cls.statId.seasonId = s.id "
			+ "WHERE cls.statId.seasonId = :seasonId AND cls.statId.playerId = :playerId")
	List<ChampsStatsResult> searchChampsStatBy(int playerId, int seasonId);
}
