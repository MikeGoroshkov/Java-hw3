package org.example.Seminar3.hw1;

import java.util.ArrayList;
import java.util.List;

/**
 * Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Молоко высшего качества", 78, 1);
        Product pr2 = new Product("Печенье овсяное", 43, 2);
        Product pr3 = new Product("Шоколад молочный", 90, 1);
        Product pr4 = new Product("Конфеты желейные", 250, 5);
        Product pr5 = new Product("Колбаса вареная Высший стандарт", 400, 2);
        Product pr6 = new Product("Хлеб ржаной Высшей категории", 500, 3);
        List<Product> productList = new ArrayList<>();
        productList.add(pr1);
        productList.add(pr2);
        productList.add(pr3);
        productList.add(pr4);
        productList.add(pr5);
        productList.add(pr6);
        Integer maxPrice = MaxPrice(productList);
        if (maxPrice == 0) {
            System.out.println("Товар с заданными параметрами не найден");
        } else {
            System.out.println(maxPrice);
        }
    }

    public static Integer MaxPrice(List<Product> productList) {
        Integer maxPrice = 0;
        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i).getGrade() == 1 || productList.get(i).getGrade() == 2) && productList.get(i).getName().toLowerCase().contains("высш")) {
                if (productList.get(i).getPrice() > maxPrice) {
                    maxPrice = productList.get(i).getPrice();
                }
            }
        }
        return maxPrice;
    }
}
