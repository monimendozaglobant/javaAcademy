package Exercise2.manager;

import Exercise2.listener.Listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationManager {
    private Map<String, List<Listener>> listeners = new HashMap<>();


    public NotificationManager(List<String> products) {
        for (String product : products) {
            this.listeners.put(product, new ArrayList<>());
        }
    }

    public void addObserver(String product, Listener user) {
        List<Listener> users = listeners.get(product);
        users.add(user);
    }

    public void removeObserver(String product, Listener user) {
        List<Listener> users = listeners.get(product);
        users.remove(user);
    }

    public void notify(String product, int prize) {
        List<Listener> users = listeners.get(product);
        for (Listener user : users) {
            user.update(product, prize);
        }
    }



}
