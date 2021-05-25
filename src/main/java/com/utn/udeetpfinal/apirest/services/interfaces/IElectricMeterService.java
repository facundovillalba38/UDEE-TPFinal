package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.exceptions.invalid.ElectricMeterInvalidException;
import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Order;

import java.util.List;

public interface IElectricMeterService {

    public void addElectricMeter(ElectricMeter electricMeter);

    public Page<ElectricMeter> getAll(Integer page, Integer size, List<Order>orders) throws ElectricMeterInvalidException;

    public ElectricMeter getElectricMeterById(Long electricMeterId) throws ElectricMeterInvalidException;

    public void updateElectricMeter(Long electricMeterId, ElectricMeter newElectricMeter) throws ElectricMeterInvalidException;

    public void deleteElectricMeter(Long electricMeterId) throws ElectricMeterInvalidException;
}
