package com.amazon.marche.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;


@Setter @Getter
public class Product {
    private int id;
    private String name;
    private Float price;
    private String description;
    private int quantity;
}
