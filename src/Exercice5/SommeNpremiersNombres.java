package exercice5;

import java.util.Scanner;

public class SommeNpremiersNombres {

    public void sommesNpremiersNombres(){

        System.out.println("Entrez un nombre aléatoire : ");

        Scanner nbre_aleatoire = new Scanner(System.in);

        int result = nbre_aleatoire.nextInt();

        int s = 0;

        for (int i =1 ; i<= result; i++){

            s+=i;
        }
        System.out.println("la somme des n premiers nombres est : " +s);
    }
}
