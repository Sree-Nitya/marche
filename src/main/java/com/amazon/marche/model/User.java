package com.amazon.marche.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter @Setter
public class User{

    private int id;
    private String username;
    private String password;
    private String email;
    private boolean enabled;
    private String roles;
}
