package com.utn.udeetpfinal.apirest.repositories;

import com.utn.udeetpfinal.apirest.models.Rate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRateRepository extends JpaRepository<Rate,Long> {
    Page<Rate> findAll(Pageable pageable);
}
