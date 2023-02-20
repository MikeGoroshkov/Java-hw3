package org.example.Seminar3.hw2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private String country;
    private Double weight;
    private Integer price;
    private Integer grade;
}
