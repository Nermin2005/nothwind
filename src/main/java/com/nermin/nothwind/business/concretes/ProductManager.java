package com.nermin.nothwind.business.concretes;

import com.nermin.nothwind.business.abstracts.ProductService;
import com.nermin.nothwind.dataAccess.ProductDao;
import com.nermin.nothwind.entites.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Override
    public List<Product> getAll() {
        List<Product> products= this.productDao.findAll();

        return products;
    }
}
