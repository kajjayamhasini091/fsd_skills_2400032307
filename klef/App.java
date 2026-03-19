<<<<<<< HEAD
package com.store;

import com.store.dao.ProductDAO;
import com.store.entity.Product;

public class App {
    public static void main(String[] args) {

        Product product = new Product("Laptop", 55000);

        ProductDAO dao = new ProductDAO();
        dao.saveProduct(product);

        System.out.println("Product saved successfully!");
=======
package com.klef;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
>>>>>>> 8086123d04d0aa06a1528f8f203a2ebca5748162
    }
}
