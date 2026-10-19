package org.example.B3_OOP.hinh;

public class HinhTron {
    private Diem o;
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(Diem o, double banKinh) {
        this.o = o;
        this.banKinh = banKinh;
    }

    public Diem getO() { return o; }
    public void setO(Diem o) { this.o = o; }

    public double getBanKinh() { return banKinh; }
    public void setBanKinh(double banKinh) { this.banKinh = banKinh; }

    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }
}
