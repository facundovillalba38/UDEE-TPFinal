package com.utn.udeetpfinal.apirest.repositories;

import com.utn.udeetpfinal.apirest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
}
