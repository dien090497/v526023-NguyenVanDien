package org.example.B3_OOP;

import org.example.B3_OOP.diem.DuongThangDemo;
import org.example.B3_OOP.hinh.HinhDemo;
import org.example.B3_OOP.hinh_thuake.HinhOopDemo;
import org.example.B3_OOP.student.StudentDemo;

import java.util.Scanner;

/**
 * Menu chạy các bài tập OOP (Java B3). Scanner đóng 1 lần khi user chọn Thoát.
 */
public class BaiTapOOP {
    static Scanner scanner = new Scanner(System.in);

    public static void mainBaiTapOOP() {
        while (true) {
            System.out.println("\n========== MENU BÀI TẬP OOP ==========");
            System.out.println("1. Bài tập Student: nhập sinh viên, in ĐTB > 5");
            System.out.println("2. Bài tập 1: Diem & DuongThang (tính độ dài)");
            System.out.println("3. Bài tập 2: Các hình cơ bản (chu vi, diện tích)");
            System.out.println("4. Bài tập: Nhập hình + kế thừa abstract Hinh");
            System.out.println("0. Thoát");
            System.out.println("=====================================");

            int choice = -1;
            while (true) {
                System.out.print("Chọn bài (0-4): ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Lỗi: vui lòng nhập số nguyên.");
                    scanner.next();
                }
            }

            switch (choice) {
                case 1:
                    StudentDemo.run(scanner);
                    break;
                case 2:
                    DuongThangDemo.run(scanner);
                    break;
                case 3:
                    HinhDemo.run();
                    break;
                case 4:
                    HinhOopDemo.run(scanner);
                    break;
                case 0:
                    System.out.println("Cảm ơn đã sử dụng chương trình. Tạm biệt!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }

    public static void main(String[] args) {
        mainBaiTapOOP();
    }
}
