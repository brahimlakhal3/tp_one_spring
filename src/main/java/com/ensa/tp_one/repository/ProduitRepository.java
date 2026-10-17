package com.ensa.tp_one.repository;

import com.ensa.tp_one.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
