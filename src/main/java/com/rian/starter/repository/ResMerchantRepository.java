package com.rian.starter.repository;

import com.rian.starter.model.v1.ResMerchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ResMerchantRepository extends JpaRepository<ResMerchant, Long> {

    Optional<ResMerchant> findById(Long id);
    ResMerchant findByMerchantName(String name);
}
