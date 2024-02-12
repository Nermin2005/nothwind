package com.nermin.nothwind.business.abstracts;

import com.nermin.nothwind.core.utilities.results.DataResulter;
import com.nermin.nothwind.core.utilities.results.Result;
import com.nermin.nothwind.entites.Product;

import java.util.List;

public interface ProductService {
   DataResulter<List<Product>> getAll();
 Result add(Product product);
 DataResulter<List<Product>> findByProductName(String productName);
 DataResulter<List<Product>> findByProductNameAndUnitPrice(String productName, int productPrice);


    DataResulter<List<Product>> findByCategoryIdOrderByIdAsc(long categoryId);

    // DataResulter<List<Product>> findByIdLessThan(double maxId);
}
