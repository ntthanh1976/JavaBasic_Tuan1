package btmang;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ADMIN
 */
public class BaiTap19 {

    public static void main(String[] args) {
        //khai bao mang luu so nguyen
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        //Đọc số phần tử từ bàn phím 
        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();
        //cap phat so phan tu cho mang 
        a = new int[n];       
              
        
        phatSinhMang(a);
        System.out.print("\nMang a:");        
        xuatMang(a);       
       
        sapXepTang(a);
        System.out.print("\nMang sau khi sap xep:");
        xuatMang(a);
        
        System.out.print("\nCho biet so nguyen x:");
        int x = sc.nextInt();
        System.out.print("\nCac phan tu la uoc so cua x:");         
        lietKeUocSo(a, x);
    }

    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
    }

    //dinh nghia phuong thuc xuat mang
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + ", ");
        }
    }

    //dinh nghia phuong thuc sap xep tang dan
    public static void sapXepTang(int[] a) {
         //su dung phuong thuc sort() cua lop Arrays
         Arrays.sort(a);      
        
    }

    //dinh nghia phuong thuc liet ke cac phan tu la uoc so cua x
    public static void lietKeUocSo(int[] a, int x) {
        //sinh vien tu cai dat
        for (int item : a) {
            if(item>0 && x%item==0)
            {
                System.out.print(item + "  ");
            }
        }
    }
}
