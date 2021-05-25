package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import com.utn.udeetpfinal.apirest.repositories.IElectricMeterRepository;
import com.utn.udeetpfinal.apirest.services.interfaces.IElectricMeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectricMeterServiceImpl implements IElectricMeterService {

    private final IElectricMeterRepository electricMeterRepository;

    @Autowired
    public ElectricMeterServiceImpl(IElectricMeterRepository electricMeterRepository) {
        this.electricMeterRepository = electricMeterRepository;
    }

    @Override
    public void addElectricMeter(ElectricMeter electricMeter) {
        electricMeterRepository.save(electricMeter);
    }

    @Override
    public Page<ElectricMeter> getAll(Integer page, Integer size, List<Order>orders) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(orders));
        return electricMeterRepository.findAll(pageable);
    }

    @Override
    public ElectricMeter getElectricMeterById(Long electricMeterId) {
        return electricMeterRepository.findById(electricMeterId).orElse(null);
    }

    @Override
    public void updateElectricMeter(Long electricMeterId, ElectricMeter newElectricMeter) {
        ElectricMeter electricMeter = this.getElectricMeterById(electricMeterId);
        electricMeter.setBrand(newElectricMeter.getBrand());
        electricMeter.setId_serial(newElectricMeter.getId_serial());
        electricMeter.setModel(newElectricMeter.getModel());
        this.addElectricMeter(electricMeter);
    }

    @Override
    public void deleteElectricMeter(Long electricMeterId) {
        electricMeterRepository.deleteById(electricMeterId);
    }
}
