package com.danceva.libraryspring.models;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Book {
    private String name;
    private String content;
}
