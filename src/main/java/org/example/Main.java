package org.example;

import org.example.B3_OOP.PhanSo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PhanSo> danhSachPhanSo = new ArrayList<>();
        danhSachPhanSo.add(new PhanSo(3, 4));
        danhSachPhanSo.add(new PhanSo(8, 2));   // Số nguyên (= 4)
        danhSachPhanSo.add(new PhanSo(-5, 3));
        danhSachPhanSo.add(new PhanSo(7, 5));
        danhSachPhanSo.add(new PhanSo(12, 4));  // Số nguyên (= 3)
        danhSachPhanSo.add(new PhanSo(1, 2));

        System.out.println("=== DANH SÁCH PHÂN SỐ ===");
        for (int i = 0; i < danhSachPhanSo.size(); i++) {
            System.out.println("Phân số thứ " + (i + 1) + ": " + danhSachPhanSo.get(i));
        }

        // 1. Tìm phân số lớn nhất trong tập phân số
        PhanSo phanSoMax = danhSachPhanSo.get(0);
        for (PhanSo p : danhSachPhanSo) {
            // Nếu p lớn hơn phanSoMax (dùng hàm compareTo hoặc quy đồng chéo)
            if (p.compareTo(phanSoMax) > 0) {
                phanSoMax = p;
            }
        }
        System.out.println("\n-> Phân số lớn nhất: " + phanSoMax);

        // 2. Tính tổng các phân số trong tập
        PhanSo tongPhanSo = new PhanSo(0, 1);
        for (PhanSo p : danhSachPhanSo) {
            tongPhanSo = tongPhanSo.cong(p);
        }
        System.out.println("-> Tổng các phân số: " + tongPhanSo);

        // 3. Xác định số phân số không phải số nguyên
        long countNonInteger = danhSachPhanSo.stream().filter(p -> !p.isInteger()).count();
        System.out.println("-> Số lượng phân số không phải số nguyên: " + countNonInteger);

        // Liệt kê chi tiết các phân số không phải số nguyên
        System.out.print("   Chi tiết: ");
        danhSachPhanSo.stream()
                .filter(p -> !p.isInteger())
                .forEach(p -> System.out.print(p + " "));
        System.out.println();
    }
}
