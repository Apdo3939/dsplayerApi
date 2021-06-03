package com.apdo3939.dsplayer.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apdo3939.dsplayer.dtos.PlayerDTO;
import com.apdo3939.dsplayer.entities.Player;
import com.apdo3939.dsplayer.repositories.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository repository;
	
	@Transactional(readOnly = true)
	public List<PlayerDTO> findAll(){
		List<Player> res =  repository.findAll();
		return res.stream().map(p -> new PlayerDTO(p)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public PlayerDTO findById(Long id) {
		Optional<Player> res = repository.findById(id);
		Player player = res.orElseThrow();
		return new PlayerDTO(player);
	}
}
