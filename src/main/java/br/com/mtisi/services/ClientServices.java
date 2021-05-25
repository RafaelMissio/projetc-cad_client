package br.com.mtisi.services;


import br.com.mtisi.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository repository;
}
