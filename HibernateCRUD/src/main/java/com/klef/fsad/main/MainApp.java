package com.klef.fsad.main;

import com.klef.fsad.dao.ProductDAO;
import com.klef.fsad.model.Product;

public class MainApp
{

 public static void main(String[] args)
 {

  ProductDAO dao = new ProductDAO();

  // Insert
  Product p1 = new Product("Laptop","Dell Laptop",55000,10);
  dao.addProduct(p1);

  Product p2 = new Product("Mobile","Samsung Phone",20000,20);
  dao.addProduct(p2);

  // Retrieve
  Product p = dao.getProduct(1);
  System.out.println("Product Name : "+p.getName());

  // Update
  dao.updateProduct(1,60000,15);

  // Delete
  dao.deleteProduct(2);

 }

}