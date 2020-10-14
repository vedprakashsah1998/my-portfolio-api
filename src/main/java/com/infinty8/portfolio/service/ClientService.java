package com.infinty8.portfolio.service;

import com.infinty8.portfolio.entity.Clients;
import com.infinty8.portfolio.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
   private ClientRepository clientRepository;

    //save single data at a time
    public Clients saveDetail(Clients clients)
    {
       return clientRepository.save(clients);
    }

    //insert multiple data at a time
    public List<Clients> saveDetails(List<Clients> clients)
    {
        return clientRepository.saveAll(clients);
    }

    //Retrive all clients
    public List<Clients> getClients()
    {
         return clientRepository.findAll();
    }

    public Clients getClientsById(int id)
    {
        return clientRepository.findById(id).orElse(null);
    }

    //Retrive data by name
    public Clients getClientsByName(String name)
    {
        return clientRepository.findByName(name);
    }

}
