package org.example.B3_OOP.hinh_thuake;

public abstract class Hinh {
    public abstract double chuVi();

    public abstract double dienTich();

    public String tenHinh() {
        return getClass().getSimpleName();
    }

    public void inThongTin() {
        System.out.printf("Loại hình: %-10s | Chu vi: %8.2f | Diện tích: %8.2f%n",
                tenHinh(), chuVi(), dienTich());
    }
}
