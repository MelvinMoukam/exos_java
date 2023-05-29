package rectangle;

public class Rectangle {

    public double L;

    public double l ;

    public Rectangle(double L, double l) {
        this.L = L;
        this.l = l;
    }

    public Double surface(){

     return L*l;


    }

    public Double perimètre (){

        return (L+l)*2;
    }

    public void afficher (){

        System.out.println("la surface du rectangle est : " + this.surface());
        System.out.println("le perimètre du rectangle est : " + this.perimètre());
    }
}
