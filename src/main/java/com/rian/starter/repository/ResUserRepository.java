package com.rian.starter.repository;

import java.util.ArrayList;
import java.util.List;

import com.rian.starter.model.v1.ResUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResUserRepository extends JpaRepository<ResUser, Long> {

    List<ResUser> findAll();
    ResUser findByUserId(String userId);
    boolean existsResUserByUserId(String userId);
}
