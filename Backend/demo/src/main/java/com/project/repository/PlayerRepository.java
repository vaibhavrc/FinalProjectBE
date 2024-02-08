package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
