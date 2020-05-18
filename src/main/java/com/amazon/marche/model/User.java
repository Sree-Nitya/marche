package com.amazon.marche.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter @Setter
public class User extends AccountInfo{

    private int id;
    private boolean valid;
}
