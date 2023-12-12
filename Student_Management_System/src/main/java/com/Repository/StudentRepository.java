package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entiity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
