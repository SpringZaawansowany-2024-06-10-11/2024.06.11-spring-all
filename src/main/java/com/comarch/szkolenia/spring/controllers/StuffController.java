package com.comarch.szkolenia.spring.controllers;

import com.comarch.szkolenia.spring.dao.StuffDAO;
import com.comarch.szkolenia.spring.model.Stuff;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/stuff")
public class StuffController {

    private final StuffDAO stuffDAO;

    @GetMapping
    public Iterable<Stuff> getAll() {
        return this.stuffDAO.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Stuff> getById(@PathVariable("id") Long id) {
        return this.stuffDAO.findById(id)
                .map(stuff -> ResponseEntity.ok(stuff))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public void save(@RequestBody Stuff stuff) {
        this.stuffDAO.save(stuff);
    }
}
