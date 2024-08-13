/*
  Giải phương trình bậc nhất. ax+b=0

 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap01 {
    public static void main(String[] args) {
        
         double a,b;
         String kq="";
         Scanner sc = new Scanner(System.in);
         //b1. nhap he so a,b
         System.out.println("=====Giai phuong trinh bac 1====");
         System.out.print("Cho biet he so a:");
         a= sc.nextDouble();
         System.out.print("Cho biet he so b:");
         b= sc.nextDouble();
         
         //b2. giai phuong trinh 
         if(a==0)
         {
             if(b==0){
                 kq="Phuong trinh vo so nghiem";
             }else{
                 kq= "Phuong trinh vo nghiem";
             }
         }else{
             kq ="Phuong trinh co nghiem x =" + (-b/a);
         }        
      
         //b3.xuat ket qua
         System.out.println(kq);        
    }
}
