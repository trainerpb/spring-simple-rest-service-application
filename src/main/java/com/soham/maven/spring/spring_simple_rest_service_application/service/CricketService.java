package com.soham.maven.spring.spring_simple_rest_service_application.service;

import com.soham.maven.spring.spring_simple_rest_service_application.model.Cricketer;
import com.soham.maven.spring.spring_simple_rest_service_application.repository.CricketerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CricketService {

    private final CricketerRepository cricketerRepository;

    public List<Cricketer> findAll(){
        return cricketerRepository.findAll();
    }

    public Cricketer save(Cricketer cr) {
    return cricketerRepository.save(cr);
    }
}
