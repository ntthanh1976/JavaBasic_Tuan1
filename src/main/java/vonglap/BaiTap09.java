/*
 Bai tap : dem uoc so cua so nguyen n
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;        
        int dem;
        
         Scanner sc = new Scanner(System.in);
         //b1. doc n tu ban phim
         System.out.println("=====DEM SO UOC SO CUA SO NGUYEN====");         
         System.out.print("Cho biet n:");
         n= sc.nextInt();
         //b2.Dem uoc so
         dem=0;
         for (int i = 1; i <= n; i++) {
             if(n%i==0)
             {
                 dem++; //dem=dem+1
             }
         } 
         //b3. xuat ket qua
         System.out.println(n + " co " + dem + "  uoc so");            
    }
    
}
