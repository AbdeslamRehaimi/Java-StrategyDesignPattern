package com.company;

import java.util.Scanner;

public class PaypalStrategy implements PaiementStrategy{

    private String id;
    private String email;
    private String password;
    private boolean signedIn;

    public PaypalStrategy() {
    }

    @Override
    public void payer(int montant) {
        System.out.println(montant + "€ payés par Paypal.");
    }

    @Override
    public void collectPaymentDetails() {
        Scanner clavier = new Scanner(System.in);
            while (!signedIn) {
                System.out.print("Enter the user's email: ");
                email = clavier.nextLine();
                System.out.print("Enter the password: ");
                password = clavier.nextLine();
                if (login()) {
                    System.out.println("You connection avec Paypa is successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
    }

    public boolean login(){
        if(email.equals("email@email.com") && password.equals("admin")){
            signedIn = true;
        }else{
            signedIn = false;
        }
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

}
