package com.soham.maven.spring.spring_simple_rest_service_application.repository;

import com.soham.maven.spring.spring_simple_rest_service_application.model.Cricketer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketerRepository  extends JpaRepository<Cricketer,Long>
{
}
