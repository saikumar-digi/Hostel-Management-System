package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Hostel;
@Repository
public interface HostelRepository  extends JpaRepository<Hostel, Integer>{

}
