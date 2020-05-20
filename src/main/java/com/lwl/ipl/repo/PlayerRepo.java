package com.lwl.ipl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lwl.ipl.domain.Player;

public interface PlayerRepo extends JpaRepository<Player,Integer> {

}
