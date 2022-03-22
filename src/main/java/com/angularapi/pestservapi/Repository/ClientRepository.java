package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {
	@Query("select c from Client c where c.id = :x")
	public Client getClient(
			@Param("x")Long id
			);
	
	@Query("select c from Client c,Projet s where c.id=s.clientt.id and s.chefprojet.id = :x")
	public List<Client> listeClient(
			@Param("x")Long id);

}
