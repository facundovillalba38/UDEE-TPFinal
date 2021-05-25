package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.models.Rate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IRateService {

    public void addRate(Rate rate);

    public Page<Rate> getRates(Integer page, Integer size, List<Sort.Order> orders);

    public Rate getRateById(Long rateId);

    public void updateRate(Long rateId, Rate newRate);

    public void deleteRate(Long rateId);
}
