package com.niit.dao;

import com.niit.models.Category;

public interface CategoryDao {
Category savecategory(Category category);
Category getcategory(int id);
}