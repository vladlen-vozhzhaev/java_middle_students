package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String lastname;
    public String name;
    public String stream_group;
    public boolean status;
    public Date date;
    public Student(){}
    public Student(String lastname, String name, String stream_group, boolean status, Date date) {
        this.lastname = lastname;
        this.name = name;
        this.stream_group = stream_group;
        this.status = status;
        this.date = date;
    }
}
