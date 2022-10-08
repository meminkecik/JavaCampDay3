package homework2.lesson40AbstractClasses;

public class Main {
    public static void main(String[] args) {
        BaseGameCalculator gameCalculator = new KidsGameCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();
    }
}
