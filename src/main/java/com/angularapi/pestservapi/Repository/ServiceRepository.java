package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.GService;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface ServiceRepository  extends JpaRepository<GService, Long> {
	


	void deleteGServiceById(Long id);

	Optional<GService> findGServiceById(Long id);
}
