package com.utn.udeetpfinal.apirest.controllers;


import com.utn.udeetpfinal.apirest.models.Rate;
import com.utn.udeetpfinal.apirest.services.implementations.RateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/rate")
public class RateController {

    private final RateServiceImpl rateService;

    @Autowired
    public RateController(RateServiceImpl rateService) {
        this.rateService = rateService;
    }

    @GetMapping("/{rateId}")
    public Rate getRateById(@PathVariable Long rateId){
        return rateService.getRateById(rateId);
    }

    @GetMapping("/")
    public List<Rate> getAllRates(){
        return rateService.getRates();
    }

    @PostMapping("/")
    public void addRate(@RequestBody Rate rate){
        rateService.addRate(rate);
    }

    @PutMapping("/{rateId}")
    public void updateRate(@PathVariable Long rateId, @RequestBody Rate newRate){
        rateService.updateRate(rateId, newRate);
    }

    @DeleteMapping("/{rateId}")
    public void deleteRate(@PathVariable Long rateId){
        rateService.deleteRate(rateId);
    }

}
