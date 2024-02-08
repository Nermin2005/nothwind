package com.nermin.nothwind.business.concretes;

import com.nermin.nothwind.business.abstracts.ProductService;
import com.nermin.nothwind.core.utilities.results.*;
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
    public DataResulter<List<Product>> getAll() {

        return new SuccessDataResult<>("ugurla alindi",this.productDao.findAll());
    }
public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ugurla save olundu");
}

    @Override
    public DataResulter<List<Product>> findByProductName(String productName) {
      List<Product> product= (List<Product>) this.productDao.findByProductName(productName);
        if(product==null) {
            return new ErrorDataResult<>("Bele bir data yoxdur");
        }
        else {
            return new SuccessDataResult<>("Ugurla tapildi", product);
        }
    }

    @Override
    public DataResulter<List<Product>> findByProductNameAndUnitPrice(String productName, int productPrice) {
       List<Product> product= (List<Product>) this.productDao.findByProductNameAndUnitPrice(productName,productPrice);
        if(product==null) {
            return new ErrorDataResult<>("Bele data yoxdur");
        }
        else {
            return new SuccessDataResult<>("Ugurla tapildi",product);
        }
    }




    @Override
    public DataResulter<List<Product>> findByIdLessThan(double maxId) {

      List<Product> price= this.productDao.findByIdLessThan(maxId);
      if(price==null) {
          return new ErrorDataResult<>("Bele bir netice tapilmadi");
      }
      else {
          return new SuccessDataResult<>("Tapildi", price);
      }
    }


}


