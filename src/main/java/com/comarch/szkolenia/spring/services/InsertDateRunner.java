package com.comarch.szkolenia.spring.services;

import com.comarch.szkolenia.spring.dao.CategoryDAO;
import com.comarch.szkolenia.spring.dao.StuffDAO;
import com.comarch.szkolenia.spring.dao.UserDAO;
import com.comarch.szkolenia.spring.model.Category;
import com.comarch.szkolenia.spring.model.Stuff;
import com.comarch.szkolenia.spring.model.User;
import jakarta.persistence.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

//@Component
@RequiredArgsConstructor
public class InsertDateRunner implements CommandLineRunner {

    private final CategoryDAO categoryDAO;
    private final StuffDAO stuffDAO;
    private final UserDAO userDAO;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user = new User(null, "admin", "admin123",
                "Pan", "Admin", User.Role.ADMIN);
        User user2 = new User(null, "user", "user123",
                "Pan", "User", User.Role.USER);

        Category category = new Category(null, "Electronics", LocalDateTime.now());
        Category category2 = new Category(null, "Food", LocalDateTime.now());

        Stuff stuff = new Stuff(null, "PC", 2, category);
        Stuff stuff2 = new Stuff(null, "Smartphone", 1, category);

        this.userDAO.save(user);
        this.userDAO.save(user2);

        this.stuffDAO.save(stuff);
        this.stuffDAO.save(stuff2);

        this.categoryDAO.save(category2);
    }
}
