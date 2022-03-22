package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Directeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirecteurRepo   extends JpaRepository<Directeur, Long>{
	Directeur findByUsernameAndPassword(String user,String pass);

}
