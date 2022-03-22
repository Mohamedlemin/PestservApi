package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Accueilleur;
import com.angularapi.pestservapi.entities.GService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccueilleurRepo  extends JpaRepository<Accueilleur, Long>{

	Accueilleur findAccueilleurByUsernameAndPassword(String user,String pass);

	void deleteAccueilleurById(Long id);

	Optional<Accueilleur> findAccueilleurById(Long id);
}
