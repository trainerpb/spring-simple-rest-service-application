package com.soham.maven.spring.spring_simple_rest_service_application.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cricketer {

    private String name;
    private String country;
    private int runs;


}
