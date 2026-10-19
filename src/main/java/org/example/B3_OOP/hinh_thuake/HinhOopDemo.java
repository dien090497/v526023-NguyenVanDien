package org.example.B3_OOP.hinh_thuake;

import java.util.Scanner;

public class HinhOopDemo {

    public static void run(Scanner sc) {
        System.out.println("\n=== BÀI TẬP: NHẬP HÌNH + KẾ THỪA (ABSTRACT Hinh) ===");

        int n = 0;
        while (true) {
            System.out.print("Bạn muốn nhập bao nhiêu hình? (n > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                System.out.println("Lỗi: n phải lớn hơn 0.");
            } else {
                System.out.println("Lỗi: vui lòng nhập số nguyên.");
                sc.next();
            }
        }

        Hinh[] ds = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập hình thứ " + (i + 1) + "/" + n + " ---");
            int loai = 0;
            while (true) {
                System.out.print("Chọn loại hình (1. Tam giác, 2. Chữ nhật, 3. Hình tròn): ");
                if (sc.hasNextInt()) {
                    loai = sc.nextInt();
                    if (loai >= 1 && loai <= 3) break;
                    System.out.println("Lỗi: chỉ chọn 1, 2 hoặc 3.");
                } else {
                    System.out.println("Lỗi: vui lòng nhập số nguyên.");
                    sc.next();
                }
            }
            ds[i] = nhapHinh(sc, loai);
        }

        System.out.println("\n===== DANH SÁCH CÁC HÌNH =====");
        for (int i = 0; i < ds.length; i++) {
            System.out.printf("%d. ", i + 1);
            ds[i].inThongTin();
        }
    }

    private static Hinh nhapHinh(Scanner sc, int loai) {
        switch (loai) {
            case 1: return nhapTamGiac(sc);
            case 2: return nhapChuNhat(sc);
            case 3: return nhapHinhTron(sc);
            default: return null;
        }
    }

    private static TamGiac nhapTamGiac(Scanner sc) {
        System.out.println("Nhập 3 đỉnh của tam giác:");
        Diem a = nhapDiem(sc, "A");
        Diem b = nhapDiem(sc, "B");
        Diem c = nhapDiem(sc, "C");
        TamGiac tg = new TamGiac(a, b, c);
        if (!tg.laTamGiac()) {
            System.out.println("Cảnh báo: 3 điểm thẳng hàng, không tạo thành tam giác!");
        }
        return tg;
    }

    private static ChuNhat nhapChuNhat(Scanner sc) {
        double dai = readPositiveDouble(sc, "Nhập chiều dài: ");
        double rong = readPositiveDouble(sc, "Nhập chiều rộng: ");
        return new ChuNhat(dai, rong);
    }

    private static HinhTron nhapHinhTron(Scanner sc) {
        System.out.println("Nhập tâm O:");
        Diem o = nhapDiem(sc, "O");
        double r = readPositiveDouble(sc, "Nhập bán kính: ");
        return new HinhTron(o, r);
    }

    private static Diem nhapDiem(Scanner sc, String ten) {
        System.out.println("  Điểm " + ten + ":");
        double x = readDouble(sc, "    x = ");
        double y = readDouble(sc, "    y = ");
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

    private static double readPositiveDouble(Scanner sc, String prompt) {
        while (true) {
            double v = readDouble(sc, prompt);
            if (v > 0) return v;
            System.out.println("Lỗi: giá trị phải lớn hơn 0.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
