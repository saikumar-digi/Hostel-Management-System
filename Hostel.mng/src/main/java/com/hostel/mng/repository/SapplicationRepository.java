package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Sapplication;

@Repository
public interface SapplicationRepository extends JpaRepository<Sapplication, Integer>{
	
	

}
