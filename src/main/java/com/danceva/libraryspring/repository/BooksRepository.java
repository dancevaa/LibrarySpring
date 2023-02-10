package com.danceva.libraryspring.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.danceva.libraryspring.models.Book;

import lombok.Data;

@Repository
@Data
public class BooksRepository {
    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("harry_potter", "ksjsksdjskd"),
            new Book("1984", "wkjekwjesd")));
}
