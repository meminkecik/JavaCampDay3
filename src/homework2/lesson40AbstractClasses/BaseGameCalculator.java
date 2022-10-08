package homework2.lesson40AbstractClasses;

public abstract class BaseGameCalculator {
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }
}
