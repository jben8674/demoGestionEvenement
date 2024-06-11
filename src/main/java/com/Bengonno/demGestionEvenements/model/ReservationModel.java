package com.Bengonno.demGestionEvenements.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
@Entity
@Table(name = "reservation_model")
public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reservationName;
    private String reservationDetails;
    private String reservationDate;
    private String reservationLieu;
    private String email;

    @ManyToOne
    @JoinColumn(name = "evenementModel_id", nullable = false)
    private EvenementModel evenementModel;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false)
    private UtilisateurModel utilisateurModel;
}
