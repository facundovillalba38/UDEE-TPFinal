package com.utn.udeetpfinal.apirest.repositories;

import com.utn.udeetpfinal.apirest.models.ElectricMeter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElectricMeterRepository extends JpaRepository<ElectricMeter,Long> {
    Page<ElectricMeter> findAll(Pageable pageable);

}
