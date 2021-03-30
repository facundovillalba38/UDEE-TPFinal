package com.utn.udeetpfinal.apirest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Bill {

    private int id;
    private int client_id;
    private int address_id;
    private float total;
    private Measuring measuring[];

}
