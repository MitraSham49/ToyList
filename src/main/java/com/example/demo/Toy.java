package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Toy implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String model;
    private String brand;
    private String dateOfMade;
    private boolean inStock;


    public Toy(String toyDateOfMade, boolean toyInStock){
        this.toyDateOfMade = toyDateOfMade;
        this.toyInStock= toyInStock;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(String dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
/*
    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", inStock=" + inStock +
                '}';
    }
    */
}

