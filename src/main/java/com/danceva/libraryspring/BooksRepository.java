package com.danceva.libraryspring;

import com.danceva.libraryspring.models.Book;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@Data
public class BooksRepository {
    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("harry_potter", "ksjsksdjskd"),
            new Book("1984", "wkjekwjesd")));
}
