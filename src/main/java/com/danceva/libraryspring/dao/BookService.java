package com.danceva.libraryspring.dao;

import com.danceva.libraryspring.BooksRepository;
import com.danceva.libraryspring.models.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {
    private final BooksRepository booksRepository;

    public String getAllBooks(){
        return booksRepository.getBooks().toString();
    }

    public String getBook(String book){
        return booksRepository.getBooks().stream().filter(book1 -> book1.getName().equals(book)).findFirst().toString();
    }

}
