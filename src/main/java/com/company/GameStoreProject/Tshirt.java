package com.company.GameStoreProject;  //DTO//
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Tshirt")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Tshirt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty
    @Length(max = 20)
    private String size;
    @NotEmpty
    @Length(max = 20)
    private String color;
    @NotEmpty
    @Length(max = 255)
    private String description;
    @NotNull
    private Double price;
    @com.sun.istack.internal.NotNull
    private Integer quantity;

 /*   public Tshirt(){}

    public Tshirt(int id, String size, String color, String description, double price, int quantity) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }  CONSTRUCTOR WAS NOT NEEDED */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}