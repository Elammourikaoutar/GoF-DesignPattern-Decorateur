package ma.enset.decorators;


import ma.enset.composant.Boissan;

public class Vanille extends AbstractDecorator {
    public Vanille(Boissan boissan) {
        super(boissan);
    }

    @Override
    public double cout() {
        return super.boissan.cout()+2.5;
    }

    @Override
    public String getDescription() {
        return super.boissan.getDescription()+" Avec vanille";
    }
}
