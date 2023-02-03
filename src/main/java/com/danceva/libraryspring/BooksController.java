package com.danceva.libraryspring;

import com.danceva.libraryspring.dao.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
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
    public void addBook(@RequestBody String name,
                        @RequestBody String content){
        bookService.addBook(name, content);
    }

}
