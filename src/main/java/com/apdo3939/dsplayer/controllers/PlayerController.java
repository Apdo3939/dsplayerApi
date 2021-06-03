package com.apdo3939.dsplayer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apdo3939.dsplayer.dtos.PlayerDTO;
import com.apdo3939.dsplayer.services.PlayerService;

@RestController
@RequestMapping(value = "/musics")
public class PlayerController {
	
	@Autowired
	private PlayerService service;
	
	@GetMapping
	ResponseEntity<List<PlayerDTO>> findAll(){
		List<PlayerDTO> list = service.findAll();
		return ResponseEntity.ok(list);	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<PlayerDTO> findById(@PathVariable Long id){
		
		PlayerDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
		
	}

}
