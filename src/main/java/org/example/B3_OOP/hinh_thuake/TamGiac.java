package org.example.B3_OOP.hinh_thuake;

public class TamGiac extends Hinh {
    private Diem a;
    private Diem b;
    private Diem c;

    public TamGiac() {
    }

    public TamGiac(Diem a, Diem b, Diem c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Diem getA() { return a; }
    public Diem getB() { return b; }
    public Diem getC() { return c; }

    @Override
    public double chuVi() {
        return a.khoangCach(b) + b.khoangCach(c) + c.khoangCach(a);
    }

    @Override
    public double dienTich() {
        // Công thức determinant: 0.5 * |xA(yB-yC) + xB(yC-yA) + xC(yA-yB)|
        double dt = a.getX() * (b.getY() - c.getY())
                  + b.getX() * (c.getY() - a.getY())
                  + c.getX() * (a.getY() - b.getY());
        return Math.abs(dt) / 2.0;
    }

    @Override
    public String tenHinh() {
        return "Tam giác";
    }

    public boolean laTamGiac() {
        return dienTich() > 1e-9;
    }
}
