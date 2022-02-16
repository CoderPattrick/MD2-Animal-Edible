import Animal.*;
import Edible.*;
import Fruit.*;
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chikin();
        for (Animal a:animals
             ) {
            a.makeSomeNoise();
            if(a instanceof Chikin){
                Edible chikin = (Chikin) a;
                chikin.howToEat();
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit f:fruits
             ) {
            f.howToEat();
        }
    }
}
