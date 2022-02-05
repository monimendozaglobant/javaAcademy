package Exercise3;

import Exercise3.decorator.HotDogWithBacon;
import Exercise3.decorator.HotDogWithPineapple;
import Exercise3.decorator.HotDogWithPotato;
import Exercise3.decorator.HotDogWithSauce;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        //Create basic hot dog with "potato", "bacon", "sauce"
        HotDog hotDog1 = new HotDogWithSauce(new HotDogWithBacon(new HotDogWithPotato(new HotDogImplementation())));
        System.out.println(hotDog1.prepare());


        //Create basic hot dog with "bacon", "pineapple", "sauce"
        HotDog hotDog2 = new HotDogWithSauce(new HotDogWithPineapple(new HotDogWithBacon(new HotDogImplementation())));
        System.out.println(hotDog2.prepare());

        //Create basic hot dog with "sauce", "bacon", "potato"
        HotDog hotDog3 = new HotDogWithPotato(new HotDogWithBacon(new HotDogWithSauce(new HotDogImplementation())));
        System.out.println(hotDog3.prepare());

        //Create basic hot dog with "sauce", "potato", "pineapple", "bacon"
        HotDog hotDog4 = new HotDogWithBacon(new HotDogWithPineapple(new HotDogWithPotato(new HotDogWithSauce(new HotDogImplementation()))));
        System.out.println(hotDog4.prepare());
    }
}
