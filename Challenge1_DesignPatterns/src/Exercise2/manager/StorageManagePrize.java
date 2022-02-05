package Exercise2.manager;

import Exercise2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class StorageManagePrize {
    public NotificationManager notifications;
    List<Product> products = new ArrayList<>();

    public StorageManagePrize(List<Product> products) {
        List<String> productsName = new ArrayList<>();
        for (Product product : products) {
            productsName.add(product.getName());
        }

        this.notifications = new NotificationManager(productsName);
    }

    public void changePrize(String productName, int prize) {
        for (Product product: products) {
            if (product.getName().equals(productName)) {
                product.setPrize(prize);
            }
        }
        notifications.notify(productName, prize);
    }
}

