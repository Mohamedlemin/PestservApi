package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Accueilleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccueilleurRepo  extends JpaRepository<Accueilleur, Long>{

	Accueilleur findByUsernameAndPassword(String user,String pass);
}
