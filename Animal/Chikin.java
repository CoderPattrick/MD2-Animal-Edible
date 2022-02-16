package Animal;
import Edible.Edible;
public class Chikin extends Animal implements Edible{
    @Override
    public void makeSomeNoise() {
        System.out.println("ConGa: Ò ó o!");
    }

    @Override
    public void howToEat() {
        System.out.println("KFC");
    }
}
