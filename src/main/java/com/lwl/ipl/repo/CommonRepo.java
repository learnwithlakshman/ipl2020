package com.lwl.ipl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lwl.ipl.domain.Player;

public interface CommonRepo extends JpaRepository<Player,String>{
	@Query("select label from Team")
	List<String> getAllTeamLabels();

		
}
