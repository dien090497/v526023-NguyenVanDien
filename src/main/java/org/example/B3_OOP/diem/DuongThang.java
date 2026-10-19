package org.example.B3_OOP.diem;

public class DuongThang {
    private Diem a;
    private Diem b;

    public DuongThang() {
    }

    public DuongThang(Diem a, Diem b) {
        this.a = a;
        this.b = b;
    }

    public Diem getA() { return a; }
    public void setA(Diem a) { this.a = a; }

    public Diem getB() { return b; }
    public void setB(Diem b) { this.b = b; }
    public double doDai() {
        return a.khoangCach(b);
    }
}
