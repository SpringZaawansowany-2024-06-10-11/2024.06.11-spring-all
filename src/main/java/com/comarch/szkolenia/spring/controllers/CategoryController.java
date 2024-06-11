package com.comarch.szkolenia.spring.controllers;

import com.comarch.szkolenia.spring.dao.CategoryDAO;
import com.comarch.szkolenia.spring.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/category")
public class CategoryController {

    private final CategoryDAO categoryDAO;

    @PostMapping
    public void save(@RequestBody Category category) {
        this.categoryDAO.save(category);
    }
}
