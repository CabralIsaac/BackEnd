package com.Portfolio.back.Repository;

import com.Portfolio.back.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;



public interface SkillsRepo extends JpaRepository<Skills, Integer> {

}