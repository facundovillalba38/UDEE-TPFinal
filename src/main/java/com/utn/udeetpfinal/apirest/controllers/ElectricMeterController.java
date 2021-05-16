package com.utn.udeetpfinal.apirest.controllers;


import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import com.utn.udeetpfinal.apirest.models.Rate;
import com.utn.udeetpfinal.apirest.services.implementations.ElectricMeterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/electricMeter")
public class ElectricMeterController {

    private final ElectricMeterServiceImpl electricMeterService;

    @Autowired
    public ElectricMeterController(ElectricMeterServiceImpl electricMeterService) {
        this.electricMeterService = electricMeterService;
    }

    @GetMapping("/{electricMeterId}")
    public ElectricMeter getElectricMeterById(@PathVariable Long electricMeterId){
        return electricMeterService.getElectricMeterById(electricMeterId);
    }

    @GetMapping("/")
    public List<ElectricMeter> getAllElectricMeters(){
        return electricMeterService.getAll();
    }

    @PostMapping("/")
    public void addElectricMeter(@RequestBody ElectricMeter electricMeter){
        electricMeterService.addElectricMeter(electricMeter);
    }

    @PutMapping("/{electricMeterId}")
    public void updateElectricMeter(@PathVariable Long electricMeterId, @RequestBody ElectricMeter newElectricMeter){
        electricMeterService.updateElectricMeter(electricMeterId, newElectricMeter);
    }

    @DeleteMapping("/{electricMeterId}")
    public void deleteElectricMeter(@PathVariable Long electricMeterId){
        electricMeterService.deleteElectricMeter(electricMeterId);
    }



}
