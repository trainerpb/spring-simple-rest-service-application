package com.soham.maven.spring.spring_simple_rest_service_application.repository;

import com.soham.maven.spring.spring_simple_rest_service_application.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
