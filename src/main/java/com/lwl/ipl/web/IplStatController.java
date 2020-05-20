package com.lwl.ipl.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.ipl.domain.Team;
import com.lwl.ipl.service.IplStatService;

@RestController
@RequestMapping("/api/")
public class IplStatController {

	private static final Logger LOG = LoggerFactory.getLogger(IplStatController.class);
	@Autowired
	private IplStatService iplStatService;

	@GetMapping("teamlabels")
	public List<String> allTeamLabels() {
		List<String> list = iplStatService.allTeamsLables();
		LOG.info("All the team labels are :{}", list);
		return list;
	}


}
