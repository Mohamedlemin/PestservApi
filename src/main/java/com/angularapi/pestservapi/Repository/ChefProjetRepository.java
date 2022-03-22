package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.ChefProjet;
import com.angularapi.pestservapi.entities.ChefService;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface ChefProjetRepository extends JpaRepository<ChefProjet, Long> {
	
//	@Query("select c from ChefProjet c,GService s where c.servicee=s.id and s.directeur.id = :x")
//	public List<ChefProjet> listeChefProjet(
//			@Param("x")Long id);
	ChefProjet findByUsernameAndPassword(String user,String pass);
    void deleteChefProjetById(long id);
    Optional<ChefProjet> findChefProjetById(Long id);

    @Query("select p from ChefProjet p where p.servicee=:x")
    public List<ChefProjet>ChefProjetParS(@Param("x") GService s);


}
