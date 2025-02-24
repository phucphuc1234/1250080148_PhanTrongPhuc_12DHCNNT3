/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 import java.util.Scanner;
class hinh {
    private double dai;
    private double rong;
  
    public hinh(double dai,double rong) {
        this.dai=dai;
        this.rong=rong;
    }
    public double dientich(){
        return dai*rong;
}
    public void xuat(){
        System.out.println("dienn tich hinh chu nhat la:: " + dientich());
    }
}
/**
 *
 * @author admin
 */
public class bai2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("nhap chieu dai: ");
        double dai = scanner.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double rong = scanner.nextDouble();
        hinh dt= new hinh(dai,rong);
        dt.xuat();
}
}
