package com.akm.finance.services;

import com.akm.finance.entities.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    List<Category> getAllCategoriesByUserId(Long userId);
}
