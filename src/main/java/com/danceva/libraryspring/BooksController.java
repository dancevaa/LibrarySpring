package com.danceva.libraryspring;

import com.danceva.libraryspring.dao.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
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
    public void addBook(){

    }

}
