package org.example.ShopService;

import java.math.BigDecimal;

// Schritt 1: Erstelle einen Record Product mit den benötigten Attributen.
public record Product(String EAN, String name, BigDecimal price, int stock) {
}
