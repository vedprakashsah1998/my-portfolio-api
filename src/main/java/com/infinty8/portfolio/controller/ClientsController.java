package com.infinty8.portfolio.controller;


import com.infinty8.portfolio.entity.Clients;
import com.infinty8.portfolio.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientsController {

    @Autowired
    private ClientService service;

    @PostMapping("/addClient")
    public Clients addClient(@RequestParam String name,@RequestParam String email,@RequestParam String message)
    {
        Clients clients=new Clients(name,email,message);
        return service.saveDetail(clients);
    }


    @GetMapping("/clients")
    public List<Clients> findAllClients(){
        return service.getClients();
    }

    @GetMapping("/client/{id}")
    public Clients findClintById(@PathVariable  int id)
    {
        return service.getClientsById(id);
    }

    @GetMapping("/client/{name}")
    public Clients findClintByName(@PathVariable String name)
    {
        return service.getClientsByName(name);
    }


}
