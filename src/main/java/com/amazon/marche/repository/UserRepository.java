package com.amazon.marche.repository;

import com.amazon.marche.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Integer> {
    Optional<UserDTO> findByUsername(String username);
}
