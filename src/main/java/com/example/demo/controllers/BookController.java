package com.example.demo.controllers;

import com.example.demo.entities.BookDto;
import com.example.demo.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping
    ResponseEntity<List<BookDto>> findAll() {
        return ResponseEntity.ok(bookService.findAll());
    }
}
