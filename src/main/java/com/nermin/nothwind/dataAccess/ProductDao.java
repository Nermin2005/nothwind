package com.nermin.nothwind.dataAccess;

import com.nermin.nothwind.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {


}
