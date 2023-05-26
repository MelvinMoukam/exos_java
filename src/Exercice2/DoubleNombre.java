package Exercice2;

import java.util.Scanner;

public class DoubleNombre {



    public void doublenumber(){

        Scanner number = new Scanner (System.in );

        System.out.println("Entrez votre nombre : ");

        int n = number.nextInt();

        System.out.println("le double de votre nombre est : " + (n*2));
    }




}
