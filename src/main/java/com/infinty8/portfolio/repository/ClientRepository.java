package com.infinty8.portfolio.repository;

import com.infinty8.portfolio.entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clients,Integer>
{
    Clients findByName(String name);
}
