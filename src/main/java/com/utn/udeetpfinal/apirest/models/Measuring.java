package com.utn.udeetpfinal.apirest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor

public class Measuring {

    private int id;
    private int electricMeterSerial;
    private Date date;
    private double totalMeasurement;
    private Rate rate;

}
