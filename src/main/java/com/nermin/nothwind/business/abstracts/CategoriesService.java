package com.nermin.nothwind.business.abstracts;

import com.nermin.nothwind.core.utilities.results.DataResulter;
import com.nermin.nothwind.entites.Categories;
import com.nermin.nothwind.entites.Product;

import java.util.List;

public interface CategoriesService {

    List<Categories> getAll();
}



