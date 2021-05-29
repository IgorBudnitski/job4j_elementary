package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
/*        if (index == products.length - 1) {
            products[index] = null;
            return products;
        } else {
            for (int u = index + 1; u < products.length; u++) {
                products[index] = products[u];
                products[u] = null;
                index++;
            }
            return products;
        }*/
        for (int u = index; u < products.length - 1; u++) {
            products[u] = products[u + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
