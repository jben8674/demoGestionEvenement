package com.Bengonno.demGestionEvenements.model;


import jakarta.persistence.*;
import lombok.*;

import java.awt.print.Book;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name = "utilisateur")
public class UtilisateurModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false)
    private   String name;
    @Column(nullable = false)
    private   String preNom;
    @Column(nullable = false)
    private   String email;



}
