package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Warden;
@Repository
public interface WardenRepository extends CrudRepository<Warden, Integer> {

}
