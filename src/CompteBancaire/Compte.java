package CompteBancaire;

import java.util.Scanner;

public class Compte {

    public double solde ;

    public Compte(double s) {
        this.solde = s;
    }

    //gére les versements
    public void deposer (double d){

      this.solde+=d;


    }

    //gère les retraits
    public void retirer (double montant_retrait){

        if (montant_retrait<= solde){

            this.solde-=montant_retrait;
        }
     else{

            System.out.println("le solde est insufisant , veilleuz approvisionner votre compte!!");
        }

        }


    //affiche le solde
    public void afficher (){
        System.out.println("le nouveau solde est : " +this.solde + " euros ");

    }
}
