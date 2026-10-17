package com.ensa.tp_one.restController;


import com.ensa.tp_one.entity.*;
import com.ensa.tp_one.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private DetailProduitRepository detailProduitRepository;

    @Autowired
    private FournisseurRepository fournisseurRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private CategorieRepository categorieRepository;


    @GetMapping("/rest/produit")
    public List<Produit> findAllProduits() {
        return produitRepository.findAll();
    }

    @GetMapping("/rest/produit/{id}")
    public Produit findProduitById(@PathVariable Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @PostMapping("/rest/produit")
    public Produit createProduit(@RequestBody Produit produit) {
        return produitRepository.save(produit);
    }

    @PutMapping("/rest/produit/{id}")
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit produit) {
        produit.setId(id);
        return produitRepository.save(produit);
    }

    @DeleteMapping("/rest/produit/{id}")
    public void deleteProduit(@PathVariable Long id) {
        produitRepository.deleteById(id);
    }

    @GetMapping("/rest/detailProduit")
    public List<DetailProduit> findAllDetailProduits() {
        return detailProduitRepository.findAll();
    }

    @GetMapping("/rest/fournisseur")
    public List<Fournisseur> findAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @GetMapping("/rest/categorie")
    public List<Categorie> findAllcategories() {
        return categorieRepository.findAll();
    }

    @GetMapping("/rest/tag")
    public List<Tag> findAllTags() {
        return tagRepository.findAll();
    }

}
