package Exercise3.decorator;

import Exercise3.HotDog;

public class HotDogWithPineapple extends HotDogDecorator {

    public HotDogWithPineapple(HotDog hotDog) {
        super(hotDog);
    }

    public String prepare() {
        return super.prepare() + " and Pineapple";
    }
}
