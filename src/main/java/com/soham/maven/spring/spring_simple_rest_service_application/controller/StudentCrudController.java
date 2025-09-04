package com.soham.maven.spring.spring_simple_rest_service_application.controller;

import com.soham.maven.spring.spring_simple_rest_service_application.model.Student;
import com.soham.maven.spring.spring_simple_rest_service_application.service.StudentCrudServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
@Slf4j
@RequiredArgsConstructor
public class StudentCrudController {
    private final StudentCrudServiceImpl studentCrudService;

    @PostMapping("/")
    public Student save(Student student){
        return studentCrudService.save(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> save(@PathVariable("id") Long id){
        
        return studentCrudService.findById(id);
    }
    @GetMapping("/")
    public Iterable<Student> findAll(){
        return studentCrudService.findAll();
    }
}
