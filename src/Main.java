import Exercice1.Bienvenue;
import Exercice2.DoubleNombre;
import Exercice3.MaximumDeDeuxNombres;
import Exercice4.PairImpair;
import Exercice5.SommeDesCentPremiersNombres;
import Exercice5.SommeNpremiersNombres;


public class Main {

    public static void main(String[]  arg){

        // message de bienvenue
        Bienvenue bienvenue = new Bienvenue();
        bienvenue.methodeBienvenue();

         //Double d'un nombre entier
        DoubleNombre number = new DoubleNombre();
        number.doublenumber();

         //Maximum de deux nombres
        MaximumDeDeuxNombres maximum =new MaximumDeDeuxNombres();
        maximum.maximumNumber();

        //Nombre pair ou impair
        PairImpair r = new PairImpair();
        r.nombrePairImpair();

        // somme des 100 premiers nombres entiers
        SommeDesCentPremiersNombres somme = new SommeDesCentPremiersNombres();
        somme.sommeDesCentspremiersNombres();

        // somme des n premiers nombres entiers
        SommeNpremiersNombres so_n = new SommeNpremiersNombres();
        so_n.sommesNpremiersNombres();
    }
}
