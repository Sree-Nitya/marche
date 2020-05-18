package com.amazon.marche.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class AccountInfoDTO {
    private int id;
    private String name;
    private String username;
    private String password;
    private boolean active;
    private String email;
    private String role;
    private String phoneNumber;
    private String gender;
    private Date createdOn;
    private Date infoUpdatedOn;
    private Date passwordUpadedOn;
}
