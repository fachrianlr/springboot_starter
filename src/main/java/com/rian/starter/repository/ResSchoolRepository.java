package com.rian.starter.repository;

import com.rian.starter.model.v1.ResSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface ResSchoolRepository extends JpaRepository<ResSchool, Long> {

    Optional<ResSchool> findById(Long id);
    ResSchool findBySchoolName(String name);
}
