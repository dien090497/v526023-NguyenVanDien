package org.example.B3_OOP.student;

import java.util.Scanner;

public class StudentDemo {

    public static void run(Scanner sc) {
        System.out.println("\n=== BÀI TẬP STUDENT ===");

        int n = 0;
        while (true) {
            System.out.print("Nhập số sinh viên (n > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
                System.out.println("Lỗi: n phải lớn hơn 0.");
            } else {
                System.out.println("Lỗi: vui lòng nhập số nguyên.");
                sc.next();
            }
        }
        sc.nextLine(); // consume newline sau nextInt

        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhập sinh viên thứ " + (i + 1) + " ---");
            System.out.print("Họ tên: ");
            String hoTen = sc.nextLine().trim();
            float toan = readFloat(sc, "Điểm Toán: ");
            float ly = readFloat(sc, "Điểm Lý: ");
            float hoa = readFloat(sc, "Điểm Hoá: ");
            ds[i] = new Student(hoTen, toan, ly, hoa);
        }

        System.out.println("\n--- Danh sách sinh viên đã nhập ---");
        for (Student s : ds) s.inThongTin();

        System.out.println("\n--- Danh sách sinh viên có ĐTB > 5 ---");
        boolean co = false;
        for (Student s : ds) {
            if (s.diemTrungBinh() > 5) {
                s.inThongTin();
                co = true;
            }
        }
        if (!co) System.out.println("Không có sinh viên nào có điểm trung bình > 5.");
    }

    private static float readFloat(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextFloat()) {
                float v = sc.nextFloat();
                sc.nextLine(); // consume newline sau nextFloat
                if (v >= 0 && v <= 10) return v;
                System.out.println("Lỗi: điểm phải trong khoảng 0..10. Nhập lại.");
            } else {
                System.out.println("Lỗi: vui lòng nhập số. Nhập lại.");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
