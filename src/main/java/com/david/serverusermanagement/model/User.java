package com.david.serverusermanagement.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String mame;


    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
