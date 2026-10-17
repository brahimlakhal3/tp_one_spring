package com.ensa.tp_one.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DetailProduit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String fabricant;
    String paysOrigine;
    String composition;
    String dosage;
    String indications;


    @OneToOne(mappedBy = "detailProduit")
    @JsonIgnore
    Produit produit;
}
