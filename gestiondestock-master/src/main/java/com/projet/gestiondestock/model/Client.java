package com.projet.gestiondestock.model;

import java.util.List;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numTel")
    private String numTel;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
