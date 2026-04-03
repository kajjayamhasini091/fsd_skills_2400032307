package com.store;

import com.store.dao.ProductDAO;
import com.store.entity.Product;

public class App {
    public static void main(String[] args) {

        Product product = new Product("Laptop", 55000);

        ProductDAO dao = new ProductDAO();
        dao.saveProduct(product);

        System.out.println("Product saved successfully!");
    }
}
