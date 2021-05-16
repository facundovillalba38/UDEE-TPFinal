package com.utn.udeetpfinal.apirest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ElectricMeter {
    @Id
    @GeneratedValue
    private Long id;
    private String id_serial;
    private String brand;
    private String model;

}
