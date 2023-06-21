package com.project.GestionPersonne.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private Integer age;

}
