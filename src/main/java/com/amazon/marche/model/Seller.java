package com.amazon.marche.model;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Seller extends AccountInfo{

    private int id;
    private int rating;
}
