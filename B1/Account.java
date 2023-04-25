package Lab2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {

    Scanner sc = new Scanner(System.in);
    int sotaikhoan;
    String tentaikhoan;
    double sotien;
    String trangthai;
    double hangso = 0.035;

    public Account(int sotaikhoan, String tentaikhoan, double sotien) {
        this.sotaikhoan = sotaikhoan;
        this.tentaikhoan = tentaikhoan;
        this.sotien = sotien;
    }

    public Account() {
        this.sotaikhoan = 999999;
        this.tentaikhoan = "Chuaxacdinh";
        this.sotien = 50;
    }

    public long getSotaikhoan() {
        return sotaikhoan;
    }

    public void setSotaikhoan(int sotaikhoan) throws Exception {
        if (sotaikhoan > 0 && sotaikhoan != 999999) {
            this.sotaikhoan = sotaikhoan;
        } else {
            throw new Exception("Loi");
        }
    }

    public String getTentaikhoan() {
        return tentaikhoan;
    }

    public void setTentaikhoan(String tentaikhoan) throws Exception {
        if (tentaikhoan.trim().equals("")) {
            this.tentaikhoan = tentaikhoan;
        } else {
            throw new Exception("Loi");
        }
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) throws Exception {
        if (sotien >= 50) {
            this.sotien = sotien;
        } else {
            throw new Exception("Loi");
        }
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public Account(int sotaikhoan, String tentaikhoan) {
        this.sotaikhoan = 50;
        this.tentaikhoan = tentaikhoan;
    }

    public double naptien() {
        int tiennhap;
        System.out.println("nhap so tien muon them: ");
        tiennhap = sc.nextInt();
        return sotien = tiennhap * sotien;
    }

    public double ruttien() {
        int tienrut;
        System.out.println("nhap so tien muon rut: ");
        tienrut = sc.nextInt();
        return sotien = sotien - tienrut;
    }

    public void chuyentien() {
        System.out.print("nhap so tai khoan can chuyen: ");
        sc.nextLong();
        System.out.print("Nhap so tai khoan nhan: ");
        sc.nextLong();
    }

    public float daohan() {
        float sodu;
        System.out.println("nhap so du: ");
        sodu = sc.nextFloat();
        return sodu = (float) (sodu + sodu * hangso);
    }
    public void inthongtin(){
        System.out.println("So tai khoan: "+ getSotaikhoan());
        System.out.println("Ten tai khoan: "+ getTentaikhoan());
        System.out.println("So tien: "+ getSotien());
    }
}