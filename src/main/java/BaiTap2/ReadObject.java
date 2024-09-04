package BaiTap2;

import baitap1.SanPham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class ReadObject {
    public static void main(String[] args) {
        ArrayList<SanPham> sp;
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            sp = (ArrayList<SanPham>) ois.readObject();
            ois.close();
            System.out.println("\n Da doc xong");
            for (SanPham x : sp) {
                System.out.println(x);

            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra: " + ex.toString());
        }

    }
}
