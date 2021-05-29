package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index == products.length - 1) {
            products[index] = null;
            return products;
        }
        for (int u = index + 1; u < products.length; u++) {
            products[index] = products[u];
            products[u] = null;
            index++;
        }
        return products;
    }
}
