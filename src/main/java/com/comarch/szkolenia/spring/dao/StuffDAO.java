package com.comarch.szkolenia.spring.dao;

import com.comarch.szkolenia.spring.model.Stuff;
import org.springframework.data.repository.CrudRepository;

public interface StuffDAO extends CrudRepository<Stuff, Long> {
}
