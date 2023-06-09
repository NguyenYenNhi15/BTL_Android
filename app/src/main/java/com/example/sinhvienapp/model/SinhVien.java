package com.example.sinhvienapp.model;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private String maSv;
    private String tenSv;
    private String email;
    private String hinh;
    private String maLop;
    private String maChuyenNganh;

    public SinhVien(String maSv, String tenSv, String email, String hinh, String maLop,String maChuyenNganh) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.email = email;
        this.hinh = hinh;
        this.maLop = maLop;
        this.maChuyenNganh = maChuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getMaChuyenNganh() {
        return maChuyenNganh;
    }

    public void setMaChuyenNganh(String maChuyenNganh) {
        this.maChuyenNganh = maChuyenNganh;
    }
}
