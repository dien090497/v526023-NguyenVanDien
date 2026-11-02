package org.example.B3_OOP;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0!");
        }
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        this.rutGon();
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
        this.rutGon();
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0!");
        }
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
        this.mauSo = mauSo;
        this.rutGon();
    }

    private int ucln(int a, int b) {
        return b == 0 ? Math.abs(a) : ucln(b, a % b);
    }

    public void rutGon() {
        int gcd = ucln(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }

    public PhanSo cong(PhanSo p) {
        int t = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int m = this.mauSo * p.mauSo;
        return new PhanSo(t, m);
    }

    public PhanSo tru(PhanSo p) {
        int t = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        int m = this.mauSo * p.mauSo;
        return new PhanSo(t, m);
    }

    public PhanSo nhan(PhanSo p) {
        int t = this.tuSo * p.tuSo;
        int m = this.mauSo * p.mauSo;
        return new PhanSo(t, m);
    }

    public PhanSo chia(PhanSo p) {
        if (p.tuSo == 0) {
            throw new ArithmeticException("Không thể chia cho phân số bằng 0!");
        }
        int t = this.tuSo * p.mauSo;
        int m = this.mauSo * p.tuSo;
        return new PhanSo(t, m);
    }

    public int compareTo(PhanSo p) {
        long val1 = (long) this.tuSo * p.mauSo;
        long val2 = (long) p.tuSo * this.mauSo;
        return Long.compare(val1, val2);
    }

    public boolean isInteger() {
        return this.tuSo % this.mauSo == 0;
    }

    @Override
    public String toString() {
        if (mauSo == 1) {
            return String.valueOf(tuSo);
        }
        if (tuSo == 0) {
            return "0";
        }
        return tuSo + "/" + mauSo;
    }
}