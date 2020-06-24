package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Article article1 = new Article("Livre : 'Tout savoir sur le pattern Strategy'",25);
        Article article2 = new Article("Film - HarryPoter",58);
        System.out.println();
        //pay by paypal
        System.out.println("_______________Connecting to Paypal_____________");
        PaypalStrategy p = new PaypalStrategy();
        p.collectPaymentDetails();
        System.out.println("Confirmation: Vous avez demander "+article1.getNom()+ " de "+article1.getPrix() + "€");
        article1.payer(p);

        System.out.println();
        //pay by credit card
        System.out.println("_______________Connecting to Bank_____________");
        CarteDeCreditStrategy crt = new CarteDeCreditStrategy();
        crt.collectPaymentDetails();
        System.out.println("Confirmation: Vous avez demander "+article2.getNom() + " de "+article2.getPrix() + "€");
        article2.payer(crt);

        System.out.println();
        System.out.println();
        System.out.println("Merci pour votre Achat, By!");
    }
}
