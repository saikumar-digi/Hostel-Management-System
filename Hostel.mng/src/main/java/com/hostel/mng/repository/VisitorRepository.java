package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Visitor;
@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer> {

}
