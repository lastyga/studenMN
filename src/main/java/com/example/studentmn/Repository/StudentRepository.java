package com.example.studentmn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmn.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
