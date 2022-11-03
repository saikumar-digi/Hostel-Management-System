package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hostel.mng.model.Allotment;
import com.hostel.mng.model.Fee;

public interface FeeRepository extends JpaRepository<Fee, Integer> {
	Fee findByemail(String email);
}
