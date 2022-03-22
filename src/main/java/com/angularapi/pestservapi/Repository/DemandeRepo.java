package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DemandeRepo extends JpaRepository<Demande, Long>{
	
	@Query("select c from Demande c,GService s where c.service=s.id and s.directeur.id = :x")
	public List<Demande> listeDemande(
			@Param("x")Long id);

	@Query("select c from Demande c,GService s where c.service=s.id and s.directeur.id = :x and c.status='accepter'")
	public List<Demande> listeDemandeAccepter(
			@Param("x")Long id
			);
	@Query("select c from Demande c,GService s where c.service=s.id and s.directeur.id = :x and c.status='refuser'")
	public List<Demande> listeDemandeRefuser(
			@Param("x")Long id
			);
	@Query("select c from Demande c,GService s where c.service= s.id and s.directeur.id = :x and c.status='en attente'")
	public List<Demande> listeDemandeAttente(
			@Param("x")Long id
			);
	

	
	@Query("select c from Demande c where c.id = :x")
	public Demande getDemande(
			@Param("x")Long id
			);
	

}
