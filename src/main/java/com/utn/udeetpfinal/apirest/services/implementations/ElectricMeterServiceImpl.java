package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import com.utn.udeetpfinal.apirest.repositories.IElectricMeterRepository;
import com.utn.udeetpfinal.apirest.services.interfaces.IElectricMeterService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<ElectricMeter> getAll() {
        return electricMeterRepository.findAll();
    }

    @Override
    public ElectricMeter getElectricMeterById(Long electricMeterId) {
        return electricMeterRepository.findById(electricMeterId).orElse(null);
    }

    @Override
    public void deleteElectricMeter(Long electricMeterId) {
        electricMeterRepository.deleteById(electricMeterId);
    }
}
