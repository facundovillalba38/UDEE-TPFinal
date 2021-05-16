package com.utn.udeetpfinal.apirest.services.implementations;

import com.utn.udeetpfinal.apirest.models.Address;
import com.utn.udeetpfinal.apirest.repositories.IAddressRepository;
import com.utn.udeetpfinal.apirest.repositories.IUserRepository;
import com.utn.udeetpfinal.apirest.services.interfaces.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        return(List<Address>) addressRepository.findAll();
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id).orElse(null);
    }

    @Override
    public Address save(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }
}
