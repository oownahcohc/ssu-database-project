package com.database.ssu.controller;

import com.database.ssu.domain.club.ClubRepository;
import com.database.ssu.domain.player.ChampsStatsResult;
import com.database.ssu.domain.player.PlayerRepository;
import com.database.ssu.domain.player.PlayerWithClub;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    private final PlayerRepository playerRepository;
    private final ClubRepository clubRepository;

    public Controller(PlayerRepository playerRepository, ClubRepository clubRepository) {
        this.playerRepository = playerRepository;
        this.clubRepository = clubRepository;
    }

    @GetMapping("/")
    public String home() {
        return "player/search";
    }

    @GetMapping("/playerList")
    public String playerList(@RequestParam("name") String playerName, Model model) {
        List<PlayerWithClub> result = playerRepository.searchPlayerInfoBy(playerName);
        model.addAttribute("playerInfo", result);
        return "player/playerList";
    }

    @GetMapping("/details")
    public String details(@RequestParam("playerId") int playerId, @RequestParam("seasonId") int seasonId, Model model) {
        model.addAttribute("champs", playerRepository.searchChampsStatBy(playerId, seasonId));
        model.addAttribute("league", playerRepository.searchLeagueStatBy(playerId, seasonId));
        ChampsStatsResult result = playerRepository.searchChampsStatBy(playerId, seasonId).get(0);
        String name = result.getPlayerName();
        PlayerWithClub playerInfo = playerRepository.searchPlayerInfoBy(name)
                .stream()
                .filter(info -> info.getSeasonId() == seasonId)
                .findAny()
                .orElseThrow();
        model.addAttribute("playerInfo", playerInfo);
        return "player/details";
    }
}
