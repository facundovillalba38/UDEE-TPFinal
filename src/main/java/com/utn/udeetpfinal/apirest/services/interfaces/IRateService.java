package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.models.Rate;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IRateService {

    public void addRate(Rate rate);

    public List<Rate> getRates();

    public Rate getRateById(Long rateId);

    public void updateRate(Long rateId, Rate newRate);

    public void deleteRate(Long rateId);
}
