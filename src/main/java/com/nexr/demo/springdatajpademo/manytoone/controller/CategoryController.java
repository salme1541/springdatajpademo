package com.nexr.demo.springdatajpademo.manytoone.controller;

import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import com.nexr.demo.springdatajpademo.manytoone.service.CategoryService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    //마스터 카테고리 수정 2
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    //TODO category CRUD

    @PostMapping
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }
}
