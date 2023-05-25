import Exercice1.Bienvenue;
import Exercice2.Product;

public class Main {

    public static void main(String[]  arg){

        Bienvenue bienvenue = new Bienvenue();

        bienvenue.methodeBienvenue();

        Product produit = new Product("LAIT");

        System.out.println(produit.getName());
    }
}
