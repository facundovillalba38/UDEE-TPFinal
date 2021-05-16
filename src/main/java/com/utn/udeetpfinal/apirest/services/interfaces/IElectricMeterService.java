package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import com.utn.udeetpfinal.apirest.models.Rate;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IElectricMeterService {

    public void addElectricMeter(ElectricMeter electricMeter);

    public List<ElectricMeter> getAll();

    public ElectricMeter getElectricMeterById(Long electricMeterId);

    public void updateElectricMeter(Long electricMeterId, ElectricMeter newElectricMeter);

    public void deleteElectricMeter(Long electricMeterId);
}
