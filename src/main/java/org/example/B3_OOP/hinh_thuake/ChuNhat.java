package org.example.B3_OOP.hinh_thuake;

public class ChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    public ChuNhat() {
    }

    public ChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() { return chieuDai; }
    public double getChieuRong() { return chieuRong; }

    @Override
    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    @Override
    public double dienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    public String tenHinh() {
        return "Chữ nhật";
    }
}
