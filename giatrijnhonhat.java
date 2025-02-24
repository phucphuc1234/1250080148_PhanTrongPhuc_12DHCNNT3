/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hinhhoc;
import java.util.Scanner;
class giatri{
   private double a;
   private double b;
   private double c;
   public giatri(double a,double b,double c){
   this.a=a;
   this.b=b;
   this.c=c;
   }
   public double tinh(){
       if(a<b&&a<c){
           return a;
   }
       else if(b<a&&b<c){
           return b;
   }
       else{
           return c;
}
   }
       public void xuat(){
           System.out.print("gia tri nho nhat la: "+ tinh());
       }
       }
/**
 *
 * @author admin
 */
public class giatrijnhonhat {
       public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      System.out.print("nhap a: ");
      double a = scanner.nextDouble();
       System.out.print("nhap b: ");
      double b = scanner.nextDouble();
       System.out.print("nhap c: ");
      double c = scanner.nextDouble();
      giatri tinh=new giatri(a,b,c);
      tinh.xuat();   
      
}
}
