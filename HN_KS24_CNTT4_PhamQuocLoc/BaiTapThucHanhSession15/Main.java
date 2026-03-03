package HN_KS24_CNTT4_PhamQuocLoc.BaiTapThucHanhSession15;

import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        repo.add(new ElectronicProduct("E1", "Tivi Sony", 15000000, 24));
        repo.add(new ElectronicProduct("E2", "Máy điều hòa", 12000000, 12));
        repo.add(new FoodProduct("F1", "Sữa TH True Milk", 35000, 15));
        repo.add(new FoodProduct("F2", "Bánh trung thu", 450000, 30));

        System.out.println("=== 1.Hiển thị toàn bộ danh sách ===");
        displayAllProducts(repo);

        System.out.println("\n=== 2.Tìm sản phẩm theo id ===");
        Product found = repo.findById("E1");
        if(found != null){
            found.displayInfo();
            System.out.printf(" | Thành tiền: %.0f%n", found.calculateFinalPrice());
        }else{
            System.out.println("Không tìm thấy mã sản phẩm");
        }

        System.out.println("\n=== 3.Sắp xếp theo giá tăng dần ===");
        List<Product> sortList = new ArrayList<>(repo.findAll());
        sortList.sort(Comparator.comparingDouble(Product::calculateFinalPrice));

        for(Product p : sortList){
            p.displayInfo();
            System.out.printf(" | Thành tiền: %.0f%n", p.calculateFinalPrice());
        }

        System.out.println("\n=== 4.Thống kê số lượng theo loại ===");

    }



    private static void displayAllProducts(ProductRepository repo) {
        List<Product> list = repo.findAll();
        if(list.isEmpty()){
            System.out.println("Danh sách rỗng");
            return;
        }
        for (Product p : list){
            p.displayInfo();
            System.out.printf(" | Thành tiền: %.0f%n", p.calculateFinalPrice());
        }
    }

}
