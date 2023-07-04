package com.lmsProject.LMS.Repository;

import com.lmsProject.LMS.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    //findBy{attribute name}
    Student findByEmail(String email); // custom search based on attributes

    List<Student> findByAge(int age);
}
