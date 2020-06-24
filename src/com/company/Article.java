package com.company;

public class Article {
    private String nom;
    private int prix;

    public Article(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPrix() {
        return this.prix;
    }

    public void payer(PaiementStrategy methode){
        int montant=this.getPrix();
        methode.payer(montant);
    }
}
