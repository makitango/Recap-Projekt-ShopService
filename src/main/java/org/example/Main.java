package org.example;

import org.example.ShopService.Order;
import org.example.ShopService.OrderListRepo;
import org.example.ShopService.Product;
import org.example.ShopService.ProductRepo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        System.out.println("Product/ProductRepo");
        ProductRepo newProductRepo = new ProductRepo();
        Product product1 = new Product("11111", "Product 1", new BigDecimal("19.99"), 5);
        Product product2 = new Product("22222", "Product 2", new BigDecimal("29.99"), 8);
        System.out.println("newProductRepo before adding: " + newProductRepo);
        newProductRepo.addProduct(product1);
        newProductRepo.addProduct(product2);
        System.out.println("newProductRepo after adding: " + newProductRepo);
        newProductRepo.removeProduct(product2);
        System.out.println("newProductRepo after removing product2: " + newProductRepo);

        System.out.println("Order/OrderListRepo");
        OrderListRepo newOrderListRepo = new OrderListRepo();
        Order order1 = new Order("jamieLannister", "29-9-2023", new BigDecimal("19.99"), "King's Landing", new ProductRepo[]{product1, product2});
        Order order2 = new Order("ladyStoneheart1337", "21-9-2023", new BigDecimal("19.99"), "remote work address", new ProductRepo[]{product1, product2});
        System.out.println("newOrderListRepo before adding: " + newOrderListRepo);
        newOrderListRepo.addOrder(order1);
        newOrderListRepo.addOrder(order2);
        System.out.println("newOrderListRepo after adding: " + newOrderListRepo);
        newOrderListRepo.removeOrders(order2);
        System.out.println("newOrderListRepo after removing order2: " + newOrderListRepo);


    }
}