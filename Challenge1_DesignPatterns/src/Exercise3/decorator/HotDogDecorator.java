package Exercise3.decorator;

import Exercise3.HotDog;

public class HotDogDecorator implements HotDog {
    private HotDog hotDog;

    public HotDogDecorator(HotDog hotDog) {
        this.hotDog = hotDog;
    }

    @Override
    public String prepare() {
        return hotDog.prepare();
    }
}
