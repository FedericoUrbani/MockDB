package com.develhope.MockDB.entities;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String firstName;

    @Column
    private String lastname;

    @Column(unique = true)
    private String mail;


}
