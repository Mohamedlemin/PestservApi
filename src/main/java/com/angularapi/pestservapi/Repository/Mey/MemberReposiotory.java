package com.angularapi.pestservapi.Repository.Mey;

import com.angularapi.pestservapi.entities.Membre;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberReposiotory  extends JpaRepository<Membre, Long>{
	 @Query("select p from Membre p where p.serviice=:x")
	 public List<Membre>MembreParS(@Param("x") GService s);

}