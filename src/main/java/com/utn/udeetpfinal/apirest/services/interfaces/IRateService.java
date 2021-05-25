package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.exceptions.invalid.RateInvalidException;
import com.utn.udeetpfinal.apirest.models.Rate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IRateService {

    public void addRate(Rate rate);

    public Page<Rate> getRates(Integer page, Integer size, List<Sort.Order> orders) throws RateInvalidException;

    public Rate getRateById(Long rateId) throws RateInvalidException;

    public void updateRate(Long rateId, Rate newRate) throws RateInvalidException;

    public void deleteRate(Long rateId) throws RateInvalidException;
}
