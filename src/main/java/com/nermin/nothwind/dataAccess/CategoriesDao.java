package com.nermin.nothwind.dataAccess;

import com.nermin.nothwind.entites.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesDao extends JpaRepository<Categories,Integer> {

}
