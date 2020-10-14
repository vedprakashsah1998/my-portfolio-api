package com.infinty8.portfolio.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT_TBL")
public class Clients {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Email
    private String email;
    private String message;

    public Clients(String name, @Email String email, String message) {
        this.name = name;
        this.email = email;
        this.message = message;
    }
}
