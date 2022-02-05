package Exercise3.decorator;

import Exercise3.HotDog;

public class HotDogWithPotato extends HotDogDecorator {

    public HotDogWithPotato(HotDog hotDog) {
        super(hotDog);
    }

    public String prepare() {
        return super.prepare() + " and Potato";
    }
}
