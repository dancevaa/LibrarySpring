package com.danceva.libraryspring.rest;

import org.springframework.web.bind.annotation.*;

import com.danceva.libraryspring.dao.BookService;
import com.danceva.libraryspring.models.Book;

import lombok.AllArgsConstructor;

@RestController("/v1")
@AllArgsConstructor
public class BooksController {

    private final BookService bookService;
    @GetMapping("/books")
    public String getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{book}")
    public String getBook(@PathVariable String book){
        return bookService.getBook(book);
    }

    @PostMapping("/books/new_book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

}
