package com.postman.postmantest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.postman.postmantest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
