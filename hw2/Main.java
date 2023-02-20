package org.example.Seminar3.hw2;


import java.util.ArrayList;
import java.util.List;

/**
 * Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой
 */
public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Молоко высшего качества", "Белорусь", 0.9, 78, 1);
        Product pr2 = new Product("Печенье овсяное", "Россия", 0.3, 43, 2);
        Product pr3 = new Product("Шоколад молочный", "Венгрия", 0.1, 90, 5);
        Product pr4 = new Product("Конфеты желейные", "Россия", 0.5, 250, 3);
        Product pr5 = new Product("Колбаса вареная", "Казахстан", 1.0, 400, 2);
        Product pr6 = new Product("Хлеб ржаной", "Россия", 0.4, 80, 1);
        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);
        productList.add(pr6);

        String minPriceName = MinPriceName(productList, 2);
        if (minPriceName.isEmpty()) {
            System.out.println("Товар заданной категории не найден");
        } else {
            System.out.println(minPriceName);
        }
    }

    public static String MinPriceName(List<Product> productList, Integer grade) {
        Integer minPrice = productList.get(0).getPrice();
        String minPriceName = "";
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getGrade() == grade) {
                if (productList.get(i).getPrice() <= minPrice) {
                    minPrice = productList.get(i).getPrice();
                    minPriceName = productList.get(i).getName();
                }
            }
        }
        return minPriceName;
    }
}
