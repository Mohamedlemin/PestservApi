package com.angularapi.pestservapi.Repository;

import com.angularapi.pestservapi.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo  extends JpaRepository<Admin, Long>{
	Admin findByUsernameAndPassword(String user,String pass);

}
