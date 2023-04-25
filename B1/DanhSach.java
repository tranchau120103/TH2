package Lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {

    ArrayList<Account> list = new ArrayList<>();
    Account ac = new Account();
    Scanner sc = new Scanner(System.in);
    public Account[] acc = new Account[10];
    public int countAccount;
    Account found = null;

    public void Danhsach() {
        countAccount = 0;
        for (int i = 0; i < 10; i++) {
            acc[i] = new Account();
        }
    }

    public void danhsach(int n) {
        if (n < 0) {
            System.out.println("Khong co tai khoan");
        } else {
            if (n > 0) {
                acc[n] = new Account();
            } else {
                acc[10] = new Account();
            }
        }
    }

    public void nhap() {
        String choice;
        do {
            list.add(new Account(Integer.parseInt(getValue("So tai khoan")), getValue("Ten tai khoan"), Double.parseDouble(getValue("So tien"))));
            System.out.println("Nhap 1 de tiep tuc");
            System.out.println("Nhap 2 de dung chuc nang khac");
            choice = sc.nextLine();
        } while (choice.equals("1"));
    }

    public void xoa() {
        list.remove(ac);
    }

    public void count() {
         
    }

    public void xuat() {
        if (list.isEmpty()){
            System.out.println("Danh sach tai khoan");
        }else{
            int count = 1;
            for (Account account : list){
                System.out.println("Tai khoan thu "+count);
                account.inthongtin();
                count++;
            }
        }
    }

    private String getValue(String x) {
        System.out.println("Nhap vao " + x);
        return sc.nextLine();
    }
}