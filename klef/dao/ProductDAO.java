package com.store.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.store.entity.Product;
import com.store.entityutil.HibernateUtil;


public class ProductDAO {

    public void saveProduct(Product product) {

        Transaction tx = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.save(product);
            tx.commit();

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
}
