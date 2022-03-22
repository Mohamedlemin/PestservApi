package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.ChefService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChefServiceRepository extends JpaRepository<ChefService, Long> {
	
	ChefService findByUsernameAndPassword(String user,String pass);

	 void deleteChefServiceById(long id);
	 Optional<ChefService> findChefServiceById(Long id);


}
