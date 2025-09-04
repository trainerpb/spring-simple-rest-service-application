package com.soham.maven.spring.spring_simple_rest_service_application.service;

import com.soham.maven.spring.spring_simple_rest_service_application.model.Student;
import com.soham.maven.spring.spring_simple_rest_service_application.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class StudentCrudServiceImpl {
    private  final StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> findById(Long id){
        return studentRepository.findById(id);
    }

    public Iterable<Student> findAll(){
        return studentRepository.findAll();
    }

}
