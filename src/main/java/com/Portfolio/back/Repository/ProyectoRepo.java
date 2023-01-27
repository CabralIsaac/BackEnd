package com.Portfolio.back.Repository;

import com.Portfolio.back.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProyectoRepo extends JpaRepository<Proyecto, Integer> {

}