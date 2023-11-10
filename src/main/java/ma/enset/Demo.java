package ma.enset;


import ma.enset.composant.Boissan;
import ma.enset.composant.Espresso;
import ma.enset.decorators.Chocolat;
import ma.enset.decorators.Vanille;

public class Demo {
    public static void main(String[] args) {
        Boissan boissan=new Espresso();
        System.out.println("========================");
        System.out.println("Description: "+boissan.getDescription());
        System.out.println("Montant    : "+boissan.cout());
        // boissaon au chocolat
        boissan=new Chocolat(boissan);
        System.out.println("========================");
        System.out.println("Description: "+boissan.getDescription());
        System.out.println("Montant    : "+boissan.cout());
        // boissaon au chocolat  avec vanille
        boissan=new Vanille(boissan);
        System.out.println("========================");
        System.out.println("Description: "+boissan.getDescription());
        System.out.println("Montant    : "+boissan.cout());
        //........... PROBLEME EST RESOLU AVEC DP DECORATOR

    }
}
