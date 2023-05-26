package Exercice4;

import java.util.Scanner;

public class PairImpair {

    public void nombrePairImpair(){

        System.out.println("Entrez un nombre aleatoire svp : ");

        Scanner number = new Scanner(System.in);

        int n = number.nextInt();

        int r = n%2;

        if (r==0){
            System.out.println("le nombre est pair ");

        }else {

            System.out.println("le nombre est impair ");
        }
    }

}
