/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hinhhoc;
import java.util.Scanner;
class sv {
    private String ten;
    private String namsinh;
    private String mssv;
    public sv(String ten, String namsinh, String mssv) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.mssv = mssv;
    }
    public void in() {
        System.out.println("chieu dai: " + ten);
        System.out.println("ngay sinh: " + namsinh);
        System.out.println("Ma so sinh vien: " + mssv);
    }
}
public class bai1{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        String ten = scanner.nextLine();

        System.out.print("Nhap ngay thang: ");
        String namsinh = scanner.nextLine();

        System.out.print("Nhap mssv: ");
        String mssv = scanner.nextLine();

         sv sinhvien = new sv(ten,namsinh,mssv);
        sinhvien.in();
    }
}
