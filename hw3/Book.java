package org.example.Seminar3.hw3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private Integer price;
    private Integer year;
    private Integer pages;
}
