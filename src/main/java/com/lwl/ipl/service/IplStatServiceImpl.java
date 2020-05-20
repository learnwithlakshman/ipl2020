package com.lwl.ipl.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwl.ipl.dao.IplStatDao;
import com.lwl.ipl.domain.Player;
import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.IRoleAmountDTO;
import com.lwl.ipl.dto.IRoleCountDTO;
import com.lwl.ipl.dto.MaxAmountDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.service.exception.TeamAlreadyExistsException;

@Service
public class IplStatServiceImpl implements IplStatService {
	
	private Logger log = LoggerFactory.getLogger(IplStatServiceImpl.class);

	private IplStatDao iplStatDao;
	
	
	@Autowired
	public IplStatServiceImpl(IplStatDao iplStatDao) {
		this.iplStatDao = iplStatDao;
	}

	@Override
	public List<String> allTeamsLables() {
		List<String> labels = iplStatDao.allTeamsLables();
		log.info("Total labels count is :{}",labels!=null ? labels.size():0);
		return labels;
	}

	@Override
	public List<PlayerDTO> getPlayersByTeam(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IRoleCountDTO> getCountByRole(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IRoleAmountDTO> getAmountByRole(String teamLabel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getByRole(String teamLabel, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaxAmountDTO getMaxAmountByRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team addNewTeam(Team team) throws TeamAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTeam(String label) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player addNewPlayer(String label, Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePlayer(String label) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return null;
	}


}
