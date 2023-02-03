package com.danceva.libraryspring.dao;

import com.danceva.libraryspring.BooksRepository;
import com.danceva.libraryspring.models.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
@AllArgsConstructor
@Data
public class BookService {
    private final BooksRepository booksRepository;

    public String getAllBooks(){
        return booksRepository.getBooks().toString();
    }

    public String getBook(String book){
        return booksRepository.getBooks().stream().filter(book1 -> book1.getName().equals(book)).findFirst().get().getContent();
    }

    public void addBook(String name, String content){
        booksRepository.getBooks().add(new Book(name, content));
    }

}
