package com.database.ssu.domain.club;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClubRepository extends JpaRepository<Club, Integer> {

	@Query(
		"SELECT new com.database.ssu.domain.club.ClubPlayerResult(c.name, c.nation, p.name, p.position) "
			+ "FROM Club c "
			+ "LEFT JOIN PlayerClub pc ON c.id = pc.clubId "
			+ "LEFT JOIN Player p ON pc.playerId = p.id "
			+ "WHERE c.name = :name")
	List<ClubPlayerResult> searchClubPlayersBy(String name);
}
