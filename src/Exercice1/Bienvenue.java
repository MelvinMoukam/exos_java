package exercice1;

import java.util.Scanner;

public class Bienvenue {

    public void methodeBienvenue (){

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre nom : ");

        String nom = sc.nextLine();

        System.out.println("Bienvenue " +nom + "!");
        
    }
}
