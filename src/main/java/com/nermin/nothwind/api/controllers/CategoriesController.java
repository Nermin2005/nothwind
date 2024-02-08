package com.nermin.nothwind.api.controllers;

import com.nermin.nothwind.business.abstracts.CategoriesService;
import com.nermin.nothwind.entites.Categories;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor

public class CategoriesController {
    private CategoriesService categoriesService;

    @GetMapping("/getAll")
    public List<Categories> getAll() {
        return this.categoriesService.getAll();
    }

}
