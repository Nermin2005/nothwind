package com.nermin.nothwind.api.controllers;

import com.nermin.nothwind.business.abstracts.ProductService;
import com.nermin.nothwind.core.utilities.results.DataResulter;
import com.nermin.nothwind.core.utilities.results.Result;
import com.nermin.nothwind.entites.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor

public class ProductController  {
    private ProductService productService;
    @GetMapping("/getAll")
    public DataResulter<List<Product>> getAll() {
        return this.productService.getAll();
    }


    @PostMapping("/add")

    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }
    @GetMapping("/find-by-product-name")
    public DataResulter<List<Product>> findByProductName(@RequestParam String productName) {
        return this.productService.findByProductName(productName);

    }
    @GetMapping("/find-by-unitprice-name")
    public DataResulter<List<Product>> findByProductNameAndUnitPrice(@RequestParam String productName,@RequestParam int productPrice) {
        return this.productService.findByProductNameAndUnitPrice(productName,productPrice);

    }
    @GetMapping("/find-by-IdLess")
    public DataResulter<List<Product>> findByIdLessThan(@RequestParam double maxId) {
        return productService.findByIdLessThan(maxId);
    }

}
