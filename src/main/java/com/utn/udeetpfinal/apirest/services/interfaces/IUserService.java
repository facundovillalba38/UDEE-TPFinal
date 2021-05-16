package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.models.Client;
import com.utn.udeetpfinal.apirest.models.Employee;
import com.utn.udeetpfinal.apirest.models.User;

import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public User findById(Long id);

    public User save(User user);

    public void delete(Long id);

    public List<Client> findAllClients();

    public List<Employee> findAllEmployees();

}
