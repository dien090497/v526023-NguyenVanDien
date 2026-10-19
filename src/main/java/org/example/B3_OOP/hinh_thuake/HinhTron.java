package org.example.B3_OOP.hinh_thuake;

public class HinhTron extends Hinh {
    private Diem o;
    private double banKinh;

    public HinhTron() {
    }

    public HinhTron(Diem o, double banKinh) {
        this.o = o;
        this.banKinh = banKinh;
    }

    public Diem getO() { return o; }
    public double getBanKinh() { return banKinh; }

    @Override
    public double chuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public String tenHinh() {
        return "Hình tròn";
    }
}
