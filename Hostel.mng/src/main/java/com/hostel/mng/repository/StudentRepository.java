package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	Student findByEmailAndPassword( String email,String password);
}
