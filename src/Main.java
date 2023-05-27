import Exercice1.Bienvenue;
import Exercice2.DoubleNombre;
import Exercice3.MaximumDeDeuxNombres;
import Exercice4.PairImpair;
import Exercice5.SommeDesCentPremiersNombres;


public class Main {

    public static void main(String[]  arg){

        Bienvenue bienvenue = new Bienvenue();
        bienvenue.methodeBienvenue();

        DoubleNombre number = new DoubleNombre();
        number.doublenumber();

        MaximumDeDeuxNombres maximum =new MaximumDeDeuxNombres();
        maximum.maximumNumber();

        PairImpair r = new PairImpair();
        r.nombrePairImpair();

        SommeDesCentPremiersNombres somme = new SommeDesCentPremiersNombres();
        somme.sommeDesCentspremiersNombres();
    }
}
