package org.example.B3_OOP.diem;

import java.util.Scanner;

public class DuongThangDemo {

    public static void run(Scanner sc) {
        System.out.println("\n=== BÀI TẬP 1: ĐIỂM & ĐƯỜNG THẲNG ===");
        System.out.println("Nhập điểm A:");
        Diem a = nhapDiem(sc);
        System.out.println("Nhập điểm B:");
        Diem b = nhapDiem(sc);

        DuongThang dt = new DuongThang(a, b);
        System.out.printf("Đường thẳng AB với A%s, B%s%n", a, b);
        System.out.printf("Độ dài đường thẳng = %.4f%n", dt.doDai());
    }

    private static Diem nhapDiem(Scanner sc) {
        double x = readDouble(sc, "  x = ");
        double y = readDouble(sc, "  y = ");
        return new Diem(x, y);
    }

    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) return sc.nextDouble();
            System.out.println("Lỗi: vui lòng nhập số thực.");
            sc.next();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
