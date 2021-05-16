package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.models.Address;
import com.utn.udeetpfinal.apirest.models.Client;
import com.utn.udeetpfinal.apirest.models.Employee;
import com.utn.udeetpfinal.apirest.models.User;

import java.util.List;

public interface IClientService {

    public List<Client> findAll();

    public Client findById(Long id);

    public Client save(Client user);

    public void delete(Long id);

    public List<Address> getAddressList();

}
