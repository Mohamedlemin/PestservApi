package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Phase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhaseRepository extends JpaRepository<Phase, Long> {
	
	@Query("select c from Phase c where  c.projet.id like :x")
	public List<Phase> listePhaseProjet(
			@Param("x")Long id);

	
	

}
