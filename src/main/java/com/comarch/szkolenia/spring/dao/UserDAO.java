package com.comarch.szkolenia.spring.dao;

import com.comarch.szkolenia.spring.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDAO extends CrudRepository<User, Long> {
    Optional<User> findByLogin(String login);
}
