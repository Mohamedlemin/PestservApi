package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProjetRepo extends JpaRepository<Projet, Long> {
	
	@Query("select c from Projet c,GService s where c.service1= s.id and s.directeur.id = :x")
	public List<Projet> listeProjet(
			@Param("x")Long id);
	
	
	@Query("select c from Projet c where c.id_project = :x")
	public Projet getProjet(
			@Param("x")Long id
			);
	
	@Query("select c from Projet c where c.chefprojet.id = :x")
	public List<Projet> listeProjetChefProjet(
			@Param("x")Long id);
	
	@Query("select c from Projet c where c.chefprojet.id = :x and c.etat=100")
	public List<Projet> listeProjetComplet(
			@Param("x")Long id);
	
	@Query("select c from Projet c where c.chefprojet.id = :x and c.etat < 100")
	public List<Projet> listeProjetNoComplet(
			@Param("x")Long id);
	

	

}
