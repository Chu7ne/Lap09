/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package baitap1;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SanPham  implements Serializable{
    String maso, ten;
    Float gia;
public SanPham(String maso,String ten,Float gia){
    this.maso = maso;
    this.ten = ten;
    this.gia = gia;
}

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Float getGia() {
        return gia;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", gia=" + gia + '}';
    }


}

