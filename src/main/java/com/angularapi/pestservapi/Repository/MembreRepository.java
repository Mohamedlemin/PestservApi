package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MembreRepository extends JpaRepository<Membre, Long> {
	
//	@Query("select c from Membre c,GService s where c.serviice= s.id and s.directeur.id = :x")
//	public List<Membre> listeMembre(
//			@Param("x")Long id);
//
//	@Query("select c from Membre c  JOIN c.projets p where p.id_project = :x")
//	public List<Membre> listeMembreParProjet(
//			@Param("x")Long id);
//
//
//	@Query("select c from Membre c where c.serviice.id = :x")
//	public List<Membre> listeMembreParService(
//			@Param("x")Long id);
}
