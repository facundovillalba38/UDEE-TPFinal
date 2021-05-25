package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.exceptions.invalid.RateInvalidException;
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

    public Page<Rate> getRates(Integer page, Integer size, List<Order> orders) throws RateInvalidException {
        Pageable pageable = PageRequest.of(page, size, Sort.by(orders));
        if(IRateRepository.findAll((pageable)) == null){
            throw new RateInvalidException("Can't get the Rate List");
        }
        return IRateRepository.findAll(pageable);
    }

    public Rate getRateById(Long rateId) throws RateInvalidException{
        return IRateRepository.findById(rateId).orElseThrow(() -> new RateInvalidException("Rate with id "+rateId+" doesn't exists"));
    }

    public void updateRate(Long rateId, Rate newRate) throws RateInvalidException{
        Rate rate = this.getRateById(rateId);
        rate.setPrice(newRate.getPrice());
        rate.setType(newRate.getType());
        this.addRate(rate);
    }

    public void deleteRate(Long rateId) throws RateInvalidException {
        if(getRateById(rateId) == null){
            throw new RateInvalidException("Rate with id "+rateId+" doesn't exists");
        }
        IRateRepository.deleteById(rateId);
    }
}
