package com.utn.udeetpfinal.apirest.models;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Long id;

    @com.sun.istack.NotNull(message = "City Field is Required")
    private String city;
    @com.sun.istack.NotNull(message = "Country Field is Required")
    private String country;
    @com.sun.istack.NotNull(message = "Message Field is Required")
    private String street;
    @com.sun.istack.NotNull(message = "Number Field is Required")
    private Integer number;
    @NotNull(message = "Details Field is Required")
    private String details; //floor 1, apartment d, blue door

    @OneToMany
    @JoinColumn(name = "rate_id", referencedColumnName = "rate_id")
    private Rate rate;

    @ManyToOne
    @JoinColumn(name = "DNI", referencedColumnName = "DNI")
    private Client client;


}
