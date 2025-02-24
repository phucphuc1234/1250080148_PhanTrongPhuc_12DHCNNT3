/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhoc;
import java.util.Scanner;
class nhietdo{
   private double f;
   public nhietdo(double f){
    this.f=f;
}
   public double chuyendoi(){
       return (f-32)/1.8;
}
   public void xuat(){
     System.out.println("do f sang c la: " + chuyendoi());
   }
}
/**
 *
 * @author admin
 */
public class bai3 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("nhap do f: ");
        double f = scanner.nextDouble();
        nhietdo inn = new nhietdo(f);
        inn.xuat();
}
}
