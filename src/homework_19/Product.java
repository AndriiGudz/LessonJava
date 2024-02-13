package homework_19;

/*
Задание: Создайте класс Product
Основные требования:
Класс должен содержать приватные поля: static long counterId для подсчета и автоматического
присвоения уникального идентификатора каждому создаваемому объекту, final long id для хранения
уникального идентификатора конкретного объекта, String name для названия продукта и double price для хранения его цены.
Реализуйте конструктор, который принимает название и цену продукта. Внутри конструктора уникальный
id должен автоматически присваиваться продукту, используя counterId для подсчета идентификаторов.
Добавьте геттеры и сеттеры для полей name и price.
Создайте метод info(), который возвращает строку с информацией о продукте, включая его id, название и цену.

Дополнительные требования:
Добавьте в класс Product метод, который позволяет изменить цену продукта на заданный процент
(например, повышение или понижение цены на 5%). Метод должен принимать один параметр — процент изменения цены.
Реализуйте статический метод, который возвращает общее количество созданных продуктов.
Этот метод должен возвращать текущее значение counterId.

Задача для отработки:
Создайте несколько объектов класса Product, используя разные названия и цены.
Выведите информацию о каждом продукте, используя метод info().
Измените цену одного из продуктов с помощью созданного метода изменения цены.
Выведите общее количество созданных продуктов.
 */
public class Product {

    private static long counterId;
    private final long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.id = counterId;
        this.name = name;
        this.price = price;
        counterId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String info() {
        return "Id продукта: " + id + " | Название продукта: " + name + " | Цена: " + price;
    }

    public void changePrice(int percent) {
        double newPrice = getPrice() * (1 + (double)percent / 100);
        setPrice(newPrice);
    }

    public static long counterID() {
        return counterId;
    }

}
