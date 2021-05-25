package com.utn.udeetpfinal.apirest.controllers;


import com.utn.udeetpfinal.apirest.exceptions.invalid.ElectricMeterInvalidException;
import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import com.utn.udeetpfinal.apirest.services.implementations.ElectricMeterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public ElectricMeter getElectricMeterById(@PathVariable Long electricMeterId) throws ElectricMeterInvalidException{
        return electricMeterService.getElectricMeterById(electricMeterId);
    }

    @GetMapping("/")
    public Page<ElectricMeter> getAllElectricMeters(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "5") Integer size,
            @RequestParam(defaultValue = "id") String sortField1
    ) throws ElectricMeterInvalidException {
        List<Sort.Order> orders = new ArrayList<>();
        orders.add(new Sort.Order(Sort.Direction.ASC, sortField1));

        return electricMeterService.getAll(page, size, orders);
    }

    @PostMapping("/")
    public void addElectricMeter(@RequestBody ElectricMeter electricMeter){
        electricMeterService.addElectricMeter(electricMeter);
    }

    @PutMapping("/{electricMeterId}")
    public void updateElectricMeter(@PathVariable Long electricMeterId, @RequestBody ElectricMeter newElectricMeter) throws ElectricMeterInvalidException{
        electricMeterService.updateElectricMeter(electricMeterId, newElectricMeter);
    }

    @DeleteMapping("/{electricMeterId}")
    public void deleteElectricMeter(@PathVariable Long electricMeterId) throws ElectricMeterInvalidException{
        electricMeterService.deleteElectricMeter(electricMeterId);
    }



}
