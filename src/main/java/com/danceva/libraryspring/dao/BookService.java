package com.danceva.libraryspring.dao;

import org.springframework.stereotype.Service;

import com.danceva.libraryspring.models.Book;
import com.danceva.libraryspring.repository.BooksRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {
    private final BooksRepository booksRepository;

    public String getAllBooks(){
        return booksRepository.getBooks().toString();
    }

    public String getBook(String book){
        return booksRepository.getBooks().stream().filter(book1 -> book1.getName().equals(book)).findFirst().get().getContent();
    }

    public void addBook(Book book){
        booksRepository.getBooks().add(book);
    }

}
