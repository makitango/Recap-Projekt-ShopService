package org.example;

import org.example.ShopService.Product;
import org.example.ShopService.ProductRepo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ProductRepo newProductRepo = new ProductRepo();
        Product product1 = new Product("11111", "Product 1", new BigDecimal("19.99"), 5);
        Product product2 = new Product("22222", "Product 2", new BigDecimal("29.99"), 8);
        System.out.println("newProductRepo before adding: " + newProductRepo);
        newProductRepo.addProduct(product1);
        newProductRepo.addProduct(product2);
        System.out.println("newProductRepo after adding: " + newProductRepo);
        newProductRepo.removeProduct(product2);
        System.out.println("newProductRepo after removing product2: " + newProductRepo);
    }
}