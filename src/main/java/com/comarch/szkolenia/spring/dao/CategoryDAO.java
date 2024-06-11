package com.comarch.szkolenia.spring.dao;

import com.comarch.szkolenia.spring.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDAO extends CrudRepository<Category, Long> {
}
