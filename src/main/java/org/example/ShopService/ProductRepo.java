package org.example.ShopService;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    // Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
    private List<Product> products = new ArrayList<>();

    // Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
