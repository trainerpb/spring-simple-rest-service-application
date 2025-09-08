package com.soham.maven.spring.spring_simple_rest_service_application.controller;

import com.soham.maven.spring.spring_simple_rest_service_application.model.Cricketer;
import com.soham.maven.spring.spring_simple_rest_service_application.service.CricketService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cricketer")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class CricketerController {
//    static List<Cricketer> cricketers=List.of(
//            Cricketer.builder()
//                    .name("Dhoni").runs(100)
//                    .build(),
//
//            Cricketer.builder()
//                    .name("Rohit Sharma").runs(10_000)
//                    .build(),
//            Cricketer.builder()
//                    .name("Rahul Drivid").runs(12_000)
//                    .build(),
//            Cricketer.builder()
//                    .name("Rahane").runs(100)
//                    .build(),
//            Cricketer.builder()
//                    .name("SAchin Tendulkar").runs(50_000)
//                    .build(),
//            Cricketer.builder()
//                    .name("Saurabh").runs(500)
//                    .build(),
//            Cricketer.builder()
//                    .name("Sehwag").runs(100)
//                    .build()
//
//    );

    private final CricketService cricketService;

    @GetMapping("/search")
    public  List<Cricketer> getCricketers(@RequestParam("q") String q){
        List<Cricketer> result=new ArrayList<>();

        List<Cricketer> cricketers=cricketService.findAll();
        for(Cricketer cr:cricketers){
            if(cr.getName().toLowerCase().startsWith(q.toLowerCase())){
                result.add(cr);
            }
        }
        return result;
    }

    @PostMapping(path="/save", produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public Cricketer save(@RequestBody  Cricketer cr){
        return cricketService.save(cr);
    }
}
