package com.example.cswfinal.Model;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class ProductEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name ;
    private int price;
    private int quantity;

    public ProductEntity() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
