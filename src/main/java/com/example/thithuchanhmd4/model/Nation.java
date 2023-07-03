package com.example.thithuchanhmd4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nations")
public class Nation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Nation(){}
    public Nation(String name){
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
