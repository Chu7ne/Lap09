/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap1;

import  java.io.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ReadTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> sp = new ArrayList<>();
        try {
            FileReader fr = new FileReader("sanpham.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(";");
                sp.add(new SanPham(arr[0],arr[1], Float.parseFloat(arr[2])));
            }
            fr.close();
            System.out.println("\n Da doc xong");
            for(SanPham x : sp){
                System.out.println(x);
            }   
        }
        catch (Exception ex) {
            System.out.println("Loi xay ra" + ex.toString());
        }
    }
}
