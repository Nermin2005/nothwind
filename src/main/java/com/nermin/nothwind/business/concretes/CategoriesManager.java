package com.nermin.nothwind.business.concretes;

import com.nermin.nothwind.business.abstracts.CategoriesService;
import com.nermin.nothwind.dataAccess.CategoriesDao;
import com.nermin.nothwind.entites.Categories;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CategoriesManager implements CategoriesService {
    private CategoriesDao categoriesDao;

    @Override
    public List<Categories> getAll() {
        return this.categoriesDao.findAll();
    }
}
