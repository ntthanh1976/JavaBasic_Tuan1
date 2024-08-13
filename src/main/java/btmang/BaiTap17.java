package btmang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap17 {

    public static void main(String[] args) {
        //khai bao mang luu so nguyen
        double[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        //Đọc số phần tử từ bàn phím 
        System.out.print("Cho biet so phan tu:");
        n = sc.nextInt();
        a = new double[n];
        
        nhapMang(a, sc);
        System.out.print("\nMang so thuc: ");
        xuatMang(a);
        
        double tb = tinhTb(a);
        System.out.print("\nGia tri trung binh:" + tb);
        
        double min = timMin(a);
        System.out.print("\nGia tri nho nhat:" + min);
    }

    //dinh nghia phuong thuc nhap mang
    public static void nhapMang(double[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {             
             System.out.print("Nhap a[" + i + "]:");
             a[i] = sc.nextDouble();
        }
    }
    //dinh nghia phuong thuc xuat mang
    public static void xuatMang(double[] a) {
        for (double item : a) {
            System.out.print(item + "  ");  
        }
    }

    //dinh nghia phuong thuc dem phan duong le
    public static double tinhTb(double[] a) {
        return 0;
    }

    //phuong thuc tim phan tu nho nhat mang
    public static int timMin(double[] a) {
        return 0;
    }
}
