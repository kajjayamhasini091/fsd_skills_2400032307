package com.klef.fsad.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.klef.fsad.model.Product;
import com.klef.fsad.util.HibernateUtil;

public class ProductDAO
{

 // INSERT
 public void addProduct(Product p)
 {
  Session session = HibernateUtil.getSessionFactory().openSession();
  Transaction tx = session.beginTransaction();

  session.save(p);

  tx.commit();
  session.close();

  System.out.println("Product Added");
 }

 // RETRIEVE
 public Product getProduct(int id)
 {
  Session session = HibernateUtil.getSessionFactory().openSession();

  Product p = session.get(Product.class,id);

  session.close();

  return p;
 }

 // UPDATE
 public void updateProduct(int id,double price,int quantity)
 {
  Session session = HibernateUtil.getSessionFactory().openSession();
  Transaction tx = session.beginTransaction();

  Product p = session.get(Product.class,id);

  if(p!=null)
  {
   p.setPrice(price);
   p.setQuantity(quantity);

   session.update(p);
  }

  tx.commit();
  session.close();

  System.out.println("Product Updated");
 }

 // DELETE
 public void deleteProduct(int id)
 {
  Session session = HibernateUtil.getSessionFactory().openSession();
  Transaction tx = session.beginTransaction();

  Product p = session.get(Product.class,id);

  if(p!=null)
  {
   session.delete(p);
  }

  tx.commit();
  session.close();

  System.out.println("Product Deleted");
 }

}