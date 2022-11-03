package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hostel.mng.model.Allotment;

public interface AllotmentRepository extends JpaRepository<Allotment, Integer> {
   Allotment findByemail(String email);
   Allotment findByroomNo(String roomNo);
  
}
