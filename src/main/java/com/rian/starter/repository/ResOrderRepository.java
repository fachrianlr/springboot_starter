package com.rian.starter.repository;

import com.rian.starter.model.v1.ResOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public interface ResOrderRepository extends JpaRepository<ResOrder, Long> {

    List<ResOrder> findByNoVa(String noVa);
}
