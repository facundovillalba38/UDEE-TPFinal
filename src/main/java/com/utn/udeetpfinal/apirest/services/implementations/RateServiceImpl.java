package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.models.Rate;
import com.utn.udeetpfinal.apirest.repositories.IRateRepository;
import com.utn.udeetpfinal.apirest.services.interfaces.IRateService;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<Rate> getRates(){
        return IRateRepository.findAll();
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
