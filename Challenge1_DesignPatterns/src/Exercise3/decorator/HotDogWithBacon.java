package Exercise3.decorator;

import Exercise3.HotDog;

public class HotDogWithBacon extends HotDogDecorator {

    public HotDogWithBacon(HotDog hotDog) {
        super(hotDog);
    }

    public String prepare() {
        return super.prepare() + " and Bacon";
    }
}
