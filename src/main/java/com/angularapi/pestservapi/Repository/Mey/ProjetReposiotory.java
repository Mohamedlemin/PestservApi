package com.angularapi.pestservapi.Repository.Mey;

import com.angularapi.pestservapi.entities.Projet;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjetReposiotory  extends JpaRepository<Projet, Long>{
	 @Query("select p from Projet p where p.service1=:x order by p.date_creation desc")
	 public List<Projet>projetParS(@Param("x") GService s);

}