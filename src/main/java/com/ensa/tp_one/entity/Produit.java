package com.ensa.tp_one.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String nom;
    String description;
    BigDecimal prix;
    String codeBarre;
    LocalDate dateExpiration;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_detailProduit")
    @JsonIgnore
    DetailProduit detailProduit;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categorie")
    @JsonIgnore
    Categorie categorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fournisseur")
    @JsonIgnore
    Fournisseur fournisseur;

    @ManyToMany
    @JoinTable(
            name = "produit_tag",
            joinColumns = @JoinColumn(name = "id_produit"),
            inverseJoinColumns = @JoinColumn(name = "id_tag")
    )
    @JsonIgnore
    List<Tag> tags;
}
