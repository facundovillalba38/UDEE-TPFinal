package com.utn.udeetpfinal.apirest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Employee extends User {

    private String dni;
    private String name;
    private String surname;
    private String age;
    private String position;

}
