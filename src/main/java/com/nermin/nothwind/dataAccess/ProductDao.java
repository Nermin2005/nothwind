package com.nermin.nothwind.dataAccess;

import com.nermin.nothwind.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Long> {
    Product findByProductName(String productName);
Product findByProductNameAndUnitPrice(String productName, int priceName);

List<Product> findByCategoryIdOrderByIdAsc(long categoryId);
}
