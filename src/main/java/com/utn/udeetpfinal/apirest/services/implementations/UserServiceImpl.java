package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.models.Client;
import com.utn.udeetpfinal.apirest.models.Employee;
import com.utn.udeetpfinal.apirest.models.User;
import com.utn.udeetpfinal.apirest.repositories.IUserRepository;
import com.utn.udeetpfinal.apirest.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Client> findAllClients() {
        return null;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return null;
    }
}
