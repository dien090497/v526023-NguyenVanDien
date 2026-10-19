package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    static Scanner scanner = new Scanner(System.in);


    static void mainBaiTap1() {
        Bai3();
    }

    static void Bai4() {
        int sum = 0;

        System.out.println("=== Chương trình cộng số nguyên (Dừng khi tổng > 50) ===");

        while (true) {
            int num = 0;

            while (true) {
                System.out.print("Nhập một số nguyên: ");
                if (scanner.hasNextInt()) {
                    num = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Lỗi: Vui lòng chỉ nhập số nguyên! Thử lại.");
                    scanner.next();
                }
            }

            sum += num;
            System.out.println("--> Tổng hiện tại: " + sum);

            if (sum > 50) {
                System.out.println("\nTổng hiện tại (" + sum + ") đã lớn hơn 50. Kết thúc vòng lặp!");
                break;
            }
        }

        System.out.println("Tổng các số đã nhập là: " + sum);

        scanner.close();
    }

    static void Bai3() {
        int n = 0;

        // 1. Nhập và kiểm tra dữ liệu cho n
        while (true) {
            System.out.print("Nhập số lượng phần tử của mảng (n > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Lỗi: Số lượng phần tử n phải lớn hơn 0. Vui lòng thử lại!");
                }
            } else {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                scanner.next();
            }
        }

        int[] arr = new int[n];

        System.out.println("\n--- Nhập các phần tử cho mảng ---");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Lỗi: Phần tử mảng phải là số nguyên. Vui lòng nhập lại!");
                    scanner.next();
                }
            }
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.print("\nMảng bạn vừa nhập là: " + Arrays.toString(arr));

        System.out.println("Phần tử lớn nhất trong mảng là: " + max);

        scanner.close();
    }


    static void Bai2() {
        int n = 0;

        while (true) {
            System.out.print("Nhập số lượng phần tử của mảng (n > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Lỗi: Số lượng phần tử n phải lớn hơn 0. Vui lòng thử lại!");
                }
            } else {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                scanner.next();
            }
        }

        int[] arr = new int[n];

        System.out.println("\n--- Nhập các phần tử cho mảng ---");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Lỗi: Phần tử mảng phải là số nguyên. Vui lòng nhập lại!");
                    scanner.next();
                }
            }
        }

        int target = 0;
        while (true) {
            System.out.print("\nNhập số nguyên cần tìm chỉ số: ");
            if (scanner.hasNextInt()) {
                target = scanner.nextInt();
                break;
            } else {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                scanner.next();
            }
        }

        boolean found = false;
        System.out.print("Chỉ số của số " + target + " trong mảng là: ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("Không tìm thấy số này trong mảng.");
        }
        System.out.println();

        scanner.close();
    }
    void Bai1() {

        int n = 0;

        while (true) {
            System.out.print("Nhập số lượng phần tử của mảng (n > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Lỗi: Số lượng phần tử n phải lớn hơn 0. Vui lòng thử lại!");
                }
            } else {
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                scanner.next();
            }
        }

        int[] arr = new int[n];

        System.out.println("\n--- Nhập các phần tử cho mảng ---");
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Lỗi: Phần tử mảng phải là số nguyên. Vui lòng nhập lại!");
                    scanner.next();
                }
            }
        }

        System.out.print("\nMảng bạn vừa nhập là: " + Arrays.toString(arr));

        scanner.close();
    }
}
