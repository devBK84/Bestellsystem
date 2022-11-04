package de.neuefische;
/*
Der Auftraggeber wünscht sich einen Shop-Service, um seine Produkt-Bestellungen verwalten zu können.
Er möchte auf der Konsole ausgeben lassen können:

// ein einzelnes Produkt
// alle Produkte
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/*
- Erstelle eine Klasse ProductRepo, die eine Product Liste enthält.
- Erstelle eine Klasse OrderRepo, die eine Order Liste enthält
- Erstelle eine Klasse ShopService, über die wir eine neue Order aufgeben können.
- "throw" eine Exception, wenn nicht-existente Produkte bestellt werden
 */
public class Main {
    public static void main(String[] args) {

        Product haferdrink = new Product(69,"Haferdrink");
        Product muesli = new Product(70, "Muesli");
        Product trockenfruechte = new Product (13, "Trockenfruechte");
        Product banane = new Product(4, "Banane");
        Product gemuese = new Product(5, "Gemuese");
        Product blumen = new Product(89, "Blume");

        List<Product> breakfastProductList = new ArrayList<>();

        breakfastProductList.add(haferdrink);
        breakfastProductList.add(muesli);
        breakfastProductList.add(trockenfruechte);
        breakfastProductList.add(banane);
        breakfastProductList.add(gemuese);
        breakfastProductList.add(blumen);

        ProductRepo breakfastRepo = new ProductRepo();
        breakfastRepo.setProductList(breakfastProductList);

        // System.out.println(breakfastRepo);

        List<Product> orderFromAnnaList = new ArrayList<>();
        orderFromAnnaList.add(haferdrink);
        orderFromAnnaList.add(muesli);
        orderFromAnnaList.add(trockenfruechte);

        Order orderFromAnna = new Order(11, orderFromAnnaList);
        OrderRepo orderRepoMay = new OrderRepo();
        List<Order> orderListMay = new ArrayList<>();

        orderListMay.add(orderFromAnna);
        orderRepoMay.setOrderList(orderListMay);

       // System.out.println(orderRepoMay);

        ShopService shopify = new ShopService(breakfastRepo, orderRepoMay);

        System.out.println(shopify);
    }

}