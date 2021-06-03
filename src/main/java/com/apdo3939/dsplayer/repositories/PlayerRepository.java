package com.apdo3939.dsplayer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apdo3939.dsplayer.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
