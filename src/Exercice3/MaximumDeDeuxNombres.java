package exercice3;

import java.util.Scanner;

public class MaximumDeDeuxNombres {

    public void maximumNumber(){
        System.out.println("Entrez votre premier nombre réel :");
        Scanner number1 = new Scanner(System.in);
        float n1 = number1.nextFloat();

        System.out.println("Entrez votre second nombre réel :");
        Scanner number2 = new Scanner(System.in);
        float n2 = number2.nextFloat();


        if( n1 < n2){

            System.out.println("le plus grand entre les deux nombres entrés est  : " +n2);

        }else{

            System.out.println("le plus grand entre les deux nombres entrés est  : " +n1);
        }


    }
}
