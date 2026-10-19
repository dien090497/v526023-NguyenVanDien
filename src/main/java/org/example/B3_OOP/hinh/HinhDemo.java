package org.example.B3_OOP.hinh;

public class HinhDemo {

    public static void run() {
        System.out.println("\n=== BÀI TẬP 2: CÁC HÌNH (CƠ BẢN) ===");

        TamGiac[] tgs = {
            new TamGiac(new Diem(0, 0), new Diem(3, 0), new Diem(0, 4)),
            new TamGiac(new Diem(1, 1), new Diem(5, 1), new Diem(3, 5))
        };
        ChuNhat[] cns = {
            new ChuNhat(4, 3),
            new ChuNhat(7, 2)
        };
        HinhTron[] hts = {
            new HinhTron(new Diem(0, 0), 5),
            new HinhTron(new Diem(2, 2), 3)
        };

        for (int i = 0; i < tgs.length; i++) {
            System.out.printf("Tam giác %d -> chu vi: %8.2f, diện tích: %8.2f%n",
                    i + 1, tgs[i].chuVi(), tgs[i].dienTich());
        }
        for (int i = 0; i < cns.length; i++) {
            System.out.printf("Chữ nhật %d -> chu vi: %8.2f, diện tích: %8.2f%n",
                    i + 1, cns[i].chuVi(), cns[i].dienTich());
        }
        for (int i = 0; i < hts.length; i++) {
            System.out.printf("Hình tròn %d -> chu vi: %8.2f, diện tích: %8.2f%n",
                    i + 1, hts[i].chuVi(), hts[i].dienTich());
        }
    }

    public static void main(String[] args) {
        run();
    }
}
