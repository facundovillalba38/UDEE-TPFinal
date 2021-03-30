package com.utn.udeetpfinal.apirest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class User {

    private int user_role;
    private String password;
    private String username;

}
