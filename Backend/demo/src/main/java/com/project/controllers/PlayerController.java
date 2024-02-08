package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Player;
import com.project.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;
	
	@PostMapping("/addplayer")
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}
	
	@GetMapping("/players")
	public List<Player> getPlayers(){
		return playerService.getPlayers();
	}
	
	@GetMapping("*")
	public String hello() {
		return "hello";
	}

}
