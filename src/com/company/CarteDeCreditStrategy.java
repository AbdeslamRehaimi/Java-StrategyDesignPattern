package com.company;

import java.util.Scanner;

public class CarteDeCreditStrategy implements PaiementStrategy {

    private String numeroCarte;
    private String cryptogramme;
    private String dateExpiration;

    public CarteDeCreditStrategy() {
    }

    @Override
    public void payer(int montant) {
        System.out.println(montant + "€ payés par carte de crédit.");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Enter the card number: ");
        String number = clavier.nextLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        String date = clavier.nextLine();
        System.out.print("Enter the CVV code: ");
        String cvv = clavier.nextLine();
    }

}
