package org.example.B3_OOP.student;

public class Student {
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public Student() {
    }

    public Student(String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }

    public float getDiemToan() { return diemToan; }
    public void setDiemToan(float diemToan) { this.diemToan = diemToan; }

    public float getDiemLy() { return diemLy; }
    public void setDiemLy(float diemLy) { this.diemLy = diemLy; }

    public float getDiemHoa() { return diemHoa; }
    public void setDiemHoa(float diemHoa) { this.diemHoa = diemHoa; }

    /** Điểm trung bình 3 môn. */
    public float diemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3f;
    }

    public void inThongTin() {
        System.out.printf("Họ tên: %-20s | Toán: %4.1f | Lý: %4.1f | Hoá: %4.1f | ĐTB: %5.2f%n",
                hoTen, diemToan, diemLy, diemHoa, diemTrungBinh());
    }
}
