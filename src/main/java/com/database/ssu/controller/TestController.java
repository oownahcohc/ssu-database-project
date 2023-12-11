package com.database.ssu.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.ssu.domain.club.ClubPlayerResult;
import com.database.ssu.domain.club.ClubRepository;
import com.database.ssu.domain.player.ChampsStatsResult;
import com.database.ssu.domain.player.LeagueStatsResult;
import com.database.ssu.domain.player.PlayerRepository;
import com.database.ssu.domain.player.PlayerWithClub;

/**
 * 각각 model.addAttribute("results", results);
 * 형식으로 매핑해서 화면 보여주면 될듯
 */
@RestController
@RequestMapping("/test")
public class TestController {

	private final PlayerRepository playerRepository;
	private final ClubRepository clubRepository;

	public TestController(PlayerRepository playerRepository, ClubRepository clubRepository) {
		this.playerRepository = playerRepository;
		this.clubRepository = clubRepository;
	}

	@GetMapping("/search/name")
	public List<PlayerWithClub> test() {
		return playerRepository.searchPlayerInfoBy("Ro");
	}

	@GetMapping("/search/league")
	public List<LeagueStatsResult> test2() {
		return playerRepository.searchLeagueStatBy(49, 5);
	}

	@GetMapping("/search/champs")
	public List<ChampsStatsResult> test3() {
		return playerRepository.searchChampsStatBy(49, 5);
	}

	@GetMapping("/search/club")
	public List<ClubPlayerResult> test4() {
		return clubRepository.searchClubPlayersBy("Man Utd");
	}
}
