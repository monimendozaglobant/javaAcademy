package Exercise2.listener;

import Exercise2.listener.Listener;

public class UserSubscribe implements Listener {

    private String name;

    public UserSubscribe(String name) {
        this.name = name;
    }

    @Override
    public void update(String product, int prize) {
        System.out.println("Send notification to user: " + this.name + " subscribe to this product:" + product + ". The new prize is " + prize);
    }
}
