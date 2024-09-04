/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import  java.io.*;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class WriteTextFile{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        try (FileWriter file = new FileWriter("sanpham.txt")) {
            for (int i = 0; i < 3; i++) {
                System.out.println(" Nhap thong tin san pham thu " + (i + 1) + ":");
                
                System.out.print(" nhap ma so: ");
                String maso = sc.nextLine();
                
                System.out.print(" nhap ten: ");
                String ten = sc.nextLine();
                
                System.out.print(" gia: ");
                float gia = sc.nextFloat();
                sc.nextLine(); 
                SanPham sp = new SanPham(maso, ten, gia);
                file.write(sp.getMaso() + ";" + sp.getTen() + ";" + sp.getGia() + "\n");
            }
            System.out.println("thong tin da duoc nhap");
        }   catch (Exception ex) {
            System.out.println("Loi xay ra" + ex.toString());
        }
    }
}
