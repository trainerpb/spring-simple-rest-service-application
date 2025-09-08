package com.soham.maven.spring.spring_simple_rest_service_application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cricketer {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    Long id;
    private String name;
    private String country;
    private int runs;


}
