package ma.enset.decorators;


import ma.enset.composant.Boissan;

public abstract class AbstractDecorator extends Boissan {

    protected Boissan boissan;
    public AbstractDecorator( Boissan boissan){
          this.boissan=boissan;
    }
    public abstract String getDescription();
}
