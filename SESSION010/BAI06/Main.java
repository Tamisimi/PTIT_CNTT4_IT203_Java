package SESSION10.BAI06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 20000));
        list.add(new Product("Chuột", 500));
        list.add(new Product("Bàn phím", 1000));

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.price - p2.price;
            }
        });

        System.out.println("--- Sắp xếp theo Giá (Anonymous Class) ---");
        for (Product p : list) { System.out.println(p); }
        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
        System.out.println("\n--- Sắp xếp theo Tên (Lambda Expression) ---");
        for (Product p : list) { System.out.println(p); }
    }
}
