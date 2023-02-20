package org.example.Seminar3.hw3;

import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц. Найти названия книг,
 * в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно
 */
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Властелин колец", "Толкин", 500, 1954, 400);
        Book book2 = new Book("Гордость и предубеждение", "Остин", 450, 1813, 370);
        Book book3 = new Book("Автостопом по галактике", "Адамс", 520, 2012, 401);
        Book book4 = new Book("Гарри Поттер и Кубок огня", "Роулинг", 600, 1999, 380);
        Book book5 = new Book("Тэсс из рода д’Эрбервиллей", "Харди", 280, 2010, 409);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        List<String> listFind = FindBooks(bookList, "а", 2010);
        if (listFind.isEmpty()) {
            System.out.println("Книги с заданными параметрами не найдены");
        }
        else {
            System.out.println(listFind);
        }
    }

    public static List<String> FindBooks(List<Book> bookList, String authorNameChars, Integer minYear) {
        List<String> ls = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if (checkPrimeNumber(bookList.get(i).getPages()) && bookList.get(i).getAuthor().toLowerCase().contains(authorNameChars) && bookList.get(i).getYear() >= minYear) {
                ls.add(bookList.get(i).getTitle());
            }
        }
        return ls;
    }
    public static boolean checkPrimeNumber(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
