package com.project.GestionPersonne.model;

import com.project.GestionPersonne.exception.AgeValidation;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    @AgeValidation
    private Integer age;

}
