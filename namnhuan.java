/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhoc;
import java.util.Scanner;


class namm {
    private int nam;
    public namm(int nam) {
        this.nam =nam;
    }
    public boolean kiemtra() {
        return (nam % 400 == 0);
    }
    public void xuat() {
        if (kiemtra()) {
            System.out.println("nam " + nam + " la nam nhuan.");
        } else {
            System.out.println("nam " + nam + " not nam nhuan.");
        }
    }
}
public class namnhuan {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nam: ");
        int nam = scanner.nextInt();
        namm hien=new namm(nam);
        hien.xuat();
}
}


