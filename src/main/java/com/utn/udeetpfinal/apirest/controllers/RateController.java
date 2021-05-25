package com.utn.udeetpfinal.apirest.controllers;


import com.utn.udeetpfinal.apirest.exceptions.invalid.RateInvalidException;
import com.utn.udeetpfinal.apirest.models.Rate;
import com.utn.udeetpfinal.apirest.services.implementations.RateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Rate getRateById(@PathVariable Long rateId) throws RateInvalidException{
        return rateService.getRateById(rateId);
    }

    @GetMapping("/")
    public Page<Rate> getAllRates(
            @RequestParam(defaultValue = "0") Integer page,
            @RequestParam(defaultValue = "5") Integer size,
            @RequestParam(defaultValue = "id") String sortField1
    ) throws RateInvalidException {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(Direction.ASC, sortField1));

        return rateService.getRates(page, size, orders);
    }

    @PostMapping("/")
    public void addRate(@RequestBody Rate rate) throws RateInvalidException{
        rateService.addRate(rate);
    }

    @PutMapping("/{rateId}")
    public void updateRate(@PathVariable Long rateId, @RequestBody Rate newRate) throws RateInvalidException{
        rateService.updateRate(rateId, newRate);
    }

    @DeleteMapping("/{rateId}")
    public void deleteRate(@PathVariable Long rateId) throws RateInvalidException{
        rateService.deleteRate(rateId);
    }

}
