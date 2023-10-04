package org.example.ShopService;

import java.math.BigDecimal;

// Schritt 1: Erstelle einen Record Order mit den benötigten Attributen.
public record Order(String userName, String orderDate, BigDecimal totalPrice, String deliveryAddress, ProductRepo products) {
}
