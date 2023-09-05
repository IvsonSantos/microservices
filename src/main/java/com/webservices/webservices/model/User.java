package com.webservices.webservices.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;


}
