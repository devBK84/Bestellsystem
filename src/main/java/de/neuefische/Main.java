package de.neuefische;
/*
Der Auftraggeber wünscht sich einen Shop-Service, um seine Produkt-Bestellungen verwalten zu können.
Er möchte auf der Konsole ausgeben lassen können:

// ein einzelnes Produkt
// alle Produkte
 */

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
- Erstelle eine Klasse ProductRepo, die eine Product Liste enthält.
- Erstelle eine Klasse OrderRepo, die eine Order Liste enthält
- Erstelle eine Klasse ShopService, über die wir eine neue Order aufgeben können.
- "throw" eine Exception, wenn nicht-existente Produkte bestellt werden
 */
public class Main {
    public static void main(String[] args) {

        Product haferdrink = new Product("69","Haferdrink");
        Product muesli = new Product("70", "Muesli");
        Product trockenfruechte = new Product ("13", "Trockenfruechte");
        Product banane = new Product("4", "Banane");
        Product gemuese = new Product("5", "Gemuese");
        Product blumen = new Product("89", "Blume");

        Map<String, Product> breakfastProductList = new HashMap<>();

        breakfastProductList.put(haferdrink.getId(),haferdrink);
        breakfastProductList.put(muesli.getId(),muesli);
        breakfastProductList.put(trockenfruechte.getId(),trockenfruechte);
        breakfastProductList.put(banane.getId(), banane);
        breakfastProductList.put(gemuese.getId(), gemuese);
        breakfastProductList.put(blumen.getId(), blumen);

        ProductRepo breakfastRepo = new ProductRepo();
        breakfastRepo.setProductList(breakfastProductList);

        // System.out.println(breakfastRepo);

        Map<String, Product> orderFromAnnaList = new HashMap<>();
        orderFromAnnaList.put(haferdrink.getId(), haferdrink);
        orderFromAnnaList.put(muesli.getId(), muesli);
        orderFromAnnaList.put(trockenfruechte.getId(), trockenfruechte);

        Order orderFromAnna = new Order("", orderFromAnnaList);
        OrderRepo orderRepoMay = new OrderRepo();
        Map<String, Order> orderListMay = new HashMap<>();

        orderListMay.put("", orderFromAnna);
        orderRepoMay.addOrder(orderFromAnna);

       // System.out.println(orderRepoMay);

        ShopService shopify = new ShopService(breakfastRepo, orderRepoMay);

        System.out.println(shopify);
    }

}