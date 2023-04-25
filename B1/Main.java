package Lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Account ac = new Account();
        DanhSach ds = new DanhSach();
        while (true) {
            System.out.println("1. Them tai khoan");
            System.out.println("2. So tai khoan hien co");
            System.out.println("3. Xuat thong tin tat ca tai khoan");
            System.out.println("4. Nap tien tai khoan");
            System.out.println("5. Rut tien tai khoan");
            System.out.println("6. Chuyen tien tai khoan");
            System.out.println("7. Ket thuc");
            int chon;
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ds.nhap();
                    break;
                case 2:
                    ds.count();
                    break;
                case 3:
                    ds.xuat();
                    break;
                case 4:
                    ac.naptien();
                    break;
                case 5:
                    ac.ruttien();
                    break;
                case 6:
                    ac.chuyentien();
                    break;
                case 7:

            }
        }
    }
}