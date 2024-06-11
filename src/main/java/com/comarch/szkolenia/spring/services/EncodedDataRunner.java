package com.comarch.szkolenia.spring.services;

import com.comarch.szkolenia.spring.dao.CategoryDAO;
import com.comarch.szkolenia.spring.dao.StuffDAO;
import com.comarch.szkolenia.spring.dao.UserDAO;
import com.comarch.szkolenia.spring.model.Category;
import com.comarch.szkolenia.spring.model.Stuff;
import com.comarch.szkolenia.spring.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

//@Component
@RequiredArgsConstructor
public class EncodedDataRunner implements CommandLineRunner {
    private final UserDAO userDAO;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        User user = new User(null, "admin", this.passwordEncoder.encode("admin123"),
                "Pan", "Admin", User.Role.ADMIN);
        User user2 = new User(null, "user", this.passwordEncoder.encode("user123"),
                "Pan", "User", User.Role.USER);

        this.userDAO.save(user);
        this.userDAO.save(user2);
    }
}
