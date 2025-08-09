package com.akm.finance.services.impl;

import com.akm.finance.entities.Category;
import com.akm.finance.repositories.CategoryRepository;
import com.akm.finance.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategoriesByUserId(Long userId) {
        return categoryRepository.findAll()
                .stream()
                .filter(t -> t.getUser().getId().equals(userId))
                .toList();
    }
}
