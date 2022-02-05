package Exercise3.decorator;

import Exercise3.HotDog;

public class HotDogWithSauce extends HotDogDecorator {

    public HotDogWithSauce(HotDog hotDog) {
        super(hotDog);
    }

    public String prepare() {
        return super.prepare() + " and Sauces";
    }
}
