package com.example.demo.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table

public class Car {
    @Id
    private int cid;
    private String name;
    private int year_production;

    public Car(String name,
                  int year_production) {
        this.name = name;
        this.year_production = year_production;
    }

    public int getId() {
        return cid;
    }

    public void setId(int id) {
        this.cid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear_production() {
        return year_production;
    }

    public void setYear_production(int year_production) {
        this.year_production = year_production;
    }

}
