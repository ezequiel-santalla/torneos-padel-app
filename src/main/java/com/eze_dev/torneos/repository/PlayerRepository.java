package com.eze_dev.torneos.repository;

import com.eze_dev.torneos.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {

    boolean existsByDni(String dni);
}
