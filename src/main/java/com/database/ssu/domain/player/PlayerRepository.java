package com.database.ssu.domain.player;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

	@Query(
		"SELECT new com.database.ssu.domain.player.PlayerWithClub"
			+ "("
			+ "p.id, p.name, p.position, "
			+ "s.id, CONCAT(s.startYear, '-', s.endYear), c.name, c.nation"
			+ ") "
			+ "FROM Player p "
			+ "LEFT JOIN PlayerClub pc ON p.id = pc.playerId "
			+ "LEFT JOIN Club c ON pc.clubId = c.id "
			+ "LEFT JOIN Season s ON pc.seasonId = s.id "
			+ "WHERE p.name LIKE CONCAT('%', :name, '%') "
	)
	List<Void> searchPlayerInfoBy(String name);
}
