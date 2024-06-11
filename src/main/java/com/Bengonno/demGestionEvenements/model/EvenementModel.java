package com.Bengonno.demGestionEvenements.model;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name = "evenement")

public class EvenementModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(nullable = false)
    private   String name;
    @Column(nullable = false)
    private   String tenueVestimentaire;
    //@Column(nullable = false)
    private   Long nombresDePersonnes;


}
