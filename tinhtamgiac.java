/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhoc;
import java.util.Scanner;
class tamgiac {
    // Thuộc tính
    private double canha;
    private double canhb;
    private double canhc;
    public tamgiac (double canha, double canhb, double canhc) {
        this.canha = canha;
        this.canhb = canhb;
        this.canhc = canhc;
    }
    public boolean kiemtra() {
        return (canha+canhb>canhc)&&(canha+canhc>canhb)&&(canhb+canhc>canha);
    }
    public void xuat() {
        if (kiemtra()) {
            System.out.println("tam giac hop le.");
        } else {
            System.out.println("tam giac khong hop le.");
        }
    }
}

public class tinhtamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh a: ");
        double canha = scanner.nextDouble();

        System.out.print("nhap canh b: ");
        double canhb = scanner.nextDouble();

        System.out.print("Nhap canh c: ");
        double canhc = scanner.nextDouble();
        tamgiac tinh = new tamgiac(canha,canhb,canhc);
        tinh.xuat();
    }
}

