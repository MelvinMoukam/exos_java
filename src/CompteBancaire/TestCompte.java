package CompteBancaire;

import java.util.Locale;
import java.util.Scanner;

public class TestCompte {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            scanner.useLocale(Locale.US); // Utilisation de la configuration régionale avec le point comme séparateur décimal

            Compte compte = new Compte(1000.0);


            System.out.print("Entrez la somme à déposer : ");
            double sommeDepot = getValidDouble(scanner);
            compte.deposer(sommeDepot );

            System.out.print("Entrez la somme à retirer : ");
            double sommeRetrait = getValidDouble(scanner);;
            compte.retirer(sommeRetrait);

            compte.afficher();


            scanner.close();
    }

    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Valeur invalide. Réessayez : ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
