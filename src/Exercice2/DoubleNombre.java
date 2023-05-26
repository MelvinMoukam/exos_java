package Exercice2;

import java.util.Scanner;

public class DoubleNombre {



    public void doublenumber(){

        System.out.println("Entrez votre nombre : ");

        Scanner number = new Scanner (System.in );

        int n = number.nextInt();

        int result = n*2;

        System.out.println("le double de votre nombre entré est : " + result );
    }




}
