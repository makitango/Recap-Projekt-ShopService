package org.example;

import org.example.ShopService.Product;
import org.example.ShopService.ProductRepo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Coding: ProductRepo
    @Test
    public void givenProductRepo_whenAddingProduct_thenProductAdded() {
        // Given
        Product product = new Product("31415", "Pie", new BigDecimal("3.14"), 10);
        ProductRepo newProductRepo = new ProductRepo();

        // When
        newProductRepo.addProduct(product);

        // Then
        List<Product> products = newProductRepo.getAllProducts();
        assertEquals(1, products.size());
        assertTrue(products.contains(product));
    }

    @Test
    public void givenProductRepoWithProduct_whenRemovingProduct_thenProductRemoved() {
        // Given
        Product product = new Product("31415", "Pie", new BigDecimal("3.14"), 10);
        ProductRepo newProductRepo = new ProductRepo();
        newProductRepo.addProduct(product);

        // When
        newProductRepo.removeProduct(product);

        // Then
        List<Product> products = newProductRepo.getAllProducts();
        assertEquals(0, products.size());
        assertFalse(products.contains(product));
    }

    @Test
    public void givenProductRepoWithProducts_whenGettingAllProducts_thenAllProductsReturned() {
        // Given
        Product product1 = new Product("11111", "Produkt 1", new BigDecimal("19.99"), 5);
        Product product2 = new Product("22222", "Produkt 2", new BigDecimal("29.99"), 8);
        ProductRepo newProductRepo = new ProductRepo();

        newProductRepo.addProduct(product1);
        newProductRepo.addProduct(product2);

        // When
        List<Product> products = newProductRepo.getAllProducts();

        // Then
        assertEquals(2, products.size());
        assertTrue(products.contains(product1));
        assertTrue(products.contains(product2));
    }
}