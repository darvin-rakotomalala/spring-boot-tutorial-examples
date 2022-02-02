package com.poc.example;

import java.util.Date;

public class Employe {
    private int id;
    private String name;
    private Date dateNaiss;
    private float salary;

    public Employe() {
    }

    public Employe(int id, String name, Date dateNaiss, float salary) {
        this.id = id;
        this.name = name;
        this.dateNaiss = dateNaiss;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
