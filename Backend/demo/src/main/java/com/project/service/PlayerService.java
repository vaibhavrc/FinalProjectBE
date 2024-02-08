package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Player;
import com.project.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository playerRepository;
	
	public void addPlayer(Player player) {
		playerRepository.save(player);
	}
	public List<Player> getPlayers() {
		return playerRepository.findAll();
	}
	public Player getPlayer(int id) {
		return playerRepository.getById(id);
	}
}
