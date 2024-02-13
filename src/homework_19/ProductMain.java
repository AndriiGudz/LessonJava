package homework_19;

import lesson_18.Car;

public class ProductMain {
    public static void main(String[] args) {

        Product product = new Product("Молоко", 1.19);
        Product product1 = new Product("Масло", 2.10);
        Product product2 = new Product("Хлеб черный", 1.55);
        Product product3 = new Product("Сыр плавленный", 2.31);

        System.out.println(product.info());
        System.out.println(product1.info());
        System.out.println(product2.info());
        System.out.println(product3.info());

        System.out.println("=====================");
        product2.changePrice(10);
        product2.info();

        System.out.println("Всего создано продуктов: " + Product.counterID());


    }
}
