package com.amazon.marche.repository;

import com.amazon.marche.dto.SellerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<SellerDTO, Integer> {
}
