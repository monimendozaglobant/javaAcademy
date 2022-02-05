package Exercise2;

import Exercise2.listener.UserSubscribe;
import Exercise2.manager.StorageManagePrize;
import Exercise2.model.Product;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // Creating users
        UserSubscribe newUserToSubscribeOne = new UserSubscribe("Pepe");
        UserSubscribe newUserToSubscribeTwo = new UserSubscribe("Lola");

        // Creating products
        List<Product> products = new ArrayList<>();
        Product productOne = new Product("productOne", 2400);
        Product productTwo = new Product("productTwo", 3000);
        Product productThree = new Product("productThree", 12000);
        products.add(productOne);
        products.add(productTwo);
        products.add(productThree);

        System.out.println("#####################  subscribing ##############################");

        // Creating subscriptions
        StorageManagePrize storageManagePrize = new StorageManagePrize(products);
        storageManagePrize.notifications.addObserver(productOne.getName(), newUserToSubscribeOne);
        storageManagePrize.notifications.addObserver(productTwo.getName(), newUserToSubscribeOne);

        storageManagePrize.notifications.addObserver(productTwo.getName(), newUserToSubscribeTwo);
        storageManagePrize.notifications.addObserver(productThree.getName(), newUserToSubscribeTwo);

        System.out.println("#####################  Changing prizes ##########################");

        //Changing prizes
        storageManagePrize.changePrize(productOne.getName(), 50000);
        storageManagePrize.changePrize(productTwo.getName(), 78000);
        storageManagePrize.changePrize(productThree.getName(), 200);

        System.out.println("#####################  Unsubscribing ##############################");

        //unsubscribe Product two
        storageManagePrize.notifications.removeObserver(productTwo.getName(), newUserToSubscribeOne);
        storageManagePrize.notifications.removeObserver(productTwo.getName(), newUserToSubscribeTwo);

        System.out.println("#####################  Changing prizes ############################");

        //Changing prizes
        storageManagePrize.changePrize(productOne.getName(), 3000);
        storageManagePrize.changePrize(productTwo.getName(), 10000);
        storageManagePrize.changePrize(productThree.getName(), 29);

    }
}
