package com.nexr.demo.springdatajpademo.manytoone.service.impl;

import com.nexr.demo.springdatajpademo.manytoone.dao.CategoryRepository;
import com.nexr.demo.springdatajpademo.manytoone.entity.Category;
import com.nexr.demo.springdatajpademo.manytoone.service.CategoryService;
import org.springframework.stereotype.Service;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
