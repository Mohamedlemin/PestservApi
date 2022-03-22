package com.angularapi.pestservapi.Repository.Mey;

import com.angularapi.pestservapi.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DemandeReposiotory  extends JpaRepository<Demande, Long>{
 @Query("select d from Demande d where d.status=:x order by d.date_creation desc")
 public List<Demande>dstatus(@Param("x")String status);
}
