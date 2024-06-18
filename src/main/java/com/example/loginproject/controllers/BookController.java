package com.example.loginproject.controllers;

import com.example.loginproject.domain.book.Book;
import com.example.loginproject.domain.book.BookRequestDTO;
import com.example.loginproject.domain.book.BookResponseDTO;
import com.example.loginproject.repositories.BookRepository;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping
    public ResponseEntity postBook(@RequestBody @Valid BookRequestDTO body){
        Book newBook = new Book(body);

        this.repository.save(newBook);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity getAllBooks() {
    List<BookResponseDTO> bookList = this.repository.findAll().stream().map(BookResponseDTO::new).toList();

    return ResponseEntity.of(Optional.of(bookList));
    }

}
