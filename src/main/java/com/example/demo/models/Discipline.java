package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Discipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String discipline;
    private int status;
    public Discipline(){}
    public Discipline(String discipline, int status) {
        this.discipline = discipline;
        this.status = status;
    }
}
