package com.utn.udeetpfinal.apirest.repositories;

import com.utn.udeetpfinal.apirest.models.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRateRepository extends JpaRepository<Rate,Long> {
}
