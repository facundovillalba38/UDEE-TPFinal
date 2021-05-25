package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.models.Rate;
import com.utn.udeetpfinal.apirest.repositories.IRateRepository;
import com.utn.udeetpfinal.apirest.services.interfaces.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RateServiceImpl implements IRateService {

    private final IRateRepository IRateRepository;

    @Autowired
    public RateServiceImpl(IRateRepository IRateRepository){
        this.IRateRepository = IRateRepository;
    }

    public void addRate(@RequestBody Rate rate){
        IRateRepository.save(rate);
    }

    public Page<Rate> getRates(Integer page, Integer size, List<Order> orders){
        Pageable pageable = PageRequest.of(page, size, Sort.by(orders));

        return IRateRepository.findAll(pageable);
    }

    public Rate getRateById(Long rateId){
        return IRateRepository.findById(rateId).orElse(null);
    }

    public void updateRate(Long rateId, Rate newRate) {
        Rate rate = this.getRateById(rateId);
        rate.setPrice(newRate.getPrice());
        rate.setType(newRate.getType());
        this.addRate(rate);
    }

    public void deleteRate(Long rateId) {
        IRateRepository.deleteById(rateId);
    }
}
