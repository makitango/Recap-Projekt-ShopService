package org.example.ShopService;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {

    //Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellungen.
    private List<Order> orders = new ArrayList<>();

    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrders(Order order) {
        orders.remove(order);
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
