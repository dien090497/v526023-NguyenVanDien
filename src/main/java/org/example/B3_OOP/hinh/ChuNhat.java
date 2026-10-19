package org.example.B3_OOP.hinh;

public class ChuNhat {
    private double chieuDai;
    private double chieuRong;

    public ChuNhat() {
    }

    public ChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() { return chieuDai; }
    public void setChieuDai(double chieuDai) { this.chieuDai = chieuDai; }

    public double getChieuRong() { return chieuRong; }
    public void setChieuRong(double chieuRong) { this.chieuRong = chieuRong; }

    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }
}
