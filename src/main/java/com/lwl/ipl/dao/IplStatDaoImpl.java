package com.lwl.ipl.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lwl.ipl.domain.Player;
import com.lwl.ipl.domain.Team;
import com.lwl.ipl.dto.IRoleAmountDTO;
import com.lwl.ipl.dto.IRoleCountDTO;
import com.lwl.ipl.dto.MaxAmountDTO;
import com.lwl.ipl.dto.PlayerDTO;
import com.lwl.ipl.repo.CommonRepo;
import com.lwl.ipl.repo.PlayerRepo;
import com.lwl.ipl.repo.TeamRepo;
import com.lwl.ipl.service.exception.TeamAlreadyExistsException;
@Repository
public class IplStatDaoImpl implements IplStatDao{

	
	private PlayerRepo playerRepo;
	private TeamRepo teamRepo;
	private CommonRepo commonRepo;
	
	
	@Autowired
	public IplStatDaoImpl(PlayerRepo playerRepo, TeamRepo teamRepo, CommonRepo commonRepo) {
		this.playerRepo = playerRepo;
		this.teamRepo = teamRepo;
		this.commonRepo = commonRepo;
	}

	@Override
	public List<String> allTeamsLables() {
		return commonRepo.getAllTeamLabels();
	}

	@Override
	public List<PlayerDTO> getPlayersByTeam(String teamLabel) {
		
		return commonRepo.getPlayersByTeam(teamLabel);
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
