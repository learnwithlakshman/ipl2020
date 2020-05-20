package com.lwl.ipl.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.service.IplStatService;

@RestController
@RequestMapping("/api/ipl2020/")
public class IplStatController {

	private static final Logger LOG = LoggerFactory.getLogger(IplStatController.class);
	@Autowired
	private IplStatService iplStatService;

	@GetMapping("alllabels")
	public List<String> getAllLabels() {
		return iplStatService.allTeamsLables();
	}

	@GetMapping("allplayers/{label}")
	public List<PlayerDTO> getAllPlayers(@PathVariable("label")String teamLabel){
		return iplStatService.getPlayersByTeam(teamLabel);
	}
	
}
