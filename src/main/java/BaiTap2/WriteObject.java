package BaiTap2;

import baitap1.SanPham;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class WriteObject {
    public static void main(String[] args) {
        ArrayList<SanPham> sp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream Oos = new ObjectOutputStream(fos);
            for (int i = 0; i < 3; i++) {
                System.out.println("Thong tin san pham thu " + (i + 1));
                System.out.print("Nhap ma so: ");
                String maso = sc.nextLine();
                System.out.print("Nhap ten: ");
                String ten = sc.nextLine();
                System.out.print("Nhap gia: ");
                float gia = sc.nextFloat();
                sc.nextLine();
                SanPham x = new SanPham(maso, ten, gia);
                sp.add(x);
            }
            
            Oos.writeObject(sp);
            Oos.close();

            System.out.println("\n Da ghi xong");

        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }
    }
}
