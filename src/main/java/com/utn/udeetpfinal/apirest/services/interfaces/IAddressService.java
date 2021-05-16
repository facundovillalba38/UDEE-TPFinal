package com.utn.udeetpfinal.apirest.services.interfaces;

import com.utn.udeetpfinal.apirest.models.Address;

import java.util.List;

public interface IAddressService {

    public List<Address> findAll();

    public Address findById(Long id);

    public Address save(Address address);

    public void delete(Long id);

}
