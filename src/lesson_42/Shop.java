package lesson_42;

import java.util.List;

public class Shop {
    private String name;
    // список товаров, который есть в магазине
    private List<String> products;

    public Shop(String name, List<String> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
