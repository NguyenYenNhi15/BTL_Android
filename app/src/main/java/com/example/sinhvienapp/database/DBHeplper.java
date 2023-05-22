package com.example.sinhvienapp.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHeplper extends SQLiteOpenHelper {
    public DBHeplper(@Nullable Context context) {
        super(context, "QUANLYSINHVIENDB.sqlite", null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //tạo table lớp
        String sql = " CREATE TABLE LOP(maLop TEXT PRIMARY KEY, tenLop TEXT)";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('Android','Lap Trinh Android')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('Kinhte','Kinh te')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('Triet','Triet hoc Mac Lenin')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('Thuyettrinh','Ky nang thuyet trinh')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('Thechat','Giao duc the chat')";
        db.execSQL(sql);
        sql = " INSERT INTO LOP VALUES ('Vatly','Vat ly va thi nghiem ')";
        db.execSQL(sql);

        //tạo table chuyên ngành
        sql = " CREATE TABLE CHUYENNGANH(maChuyenNganh TEXT PRIMARY KEY, tenChuyenNganh TEXT)";
        db.execSQL(sql);
        sql = " INSERT INTO CHUYENNGANH VALUES ('KHMT','Khoa hoc may tinh')";
        db.execSQL(sql);
        sql = " INSERT INTO CHUYENNGANH VALUES ('CNTT','Cong nghe thong tin')";
        db.execSQL(sql);
        sql = " INSERT INTO CHUYENNGANH VALUES ('KETOAN','Ke toan')";
        db.execSQL(sql);
        sql = " INSERT INTO CHUYENNGANH VALUES ('ATTT','An toan thong tin')";
        db.execSQL(sql);
        sql = " INSERT INTO CHUYENNGANH VALUES ('DPT','Da phuong tien')";
        db.execSQL(sql);
        //tạo table môn học
        sql = " CREATE TABLE MONHOC(maMH TEXT PRIMARY KEY, tenmonhoc TEXT)";
        db.execSQL(sql);
        sql = " INSERT INTO MONHOC VALUES ('INT1001','Lap trinh OOP')";
        db.execSQL(sql);
        sql = " INSERT INTO MONHOC VALUES ('INT1022','Nhap mon cong nghe phan mem')";
        db.execSQL(sql);
        sql = " INSERT INTO MONHOC VALUES ('INT2222','Toan roi rac 1')";
        db.execSQL(sql);
        sql = " INSERT INTO MONHOC VALUES ('INT3243','Dai so tuyen tinh')";
        db.execSQL(sql);
        sql = " INSERT INTO MONHOC VALUES ('INT6543','Giai tich 2')";
        db.execSQL(sql);
        sql = " CREATE TABLE SINHVIEN(maSv TEXT PRIMARY KEY, tenSV TEXT ," +
                " email TEXT ,hinh TEXT, maLop TEXT REFERENCES LOP(maLop), maChuyenNganh TEXT REFERENCES CHUYENNGANH(maChuyenNganh)) ";
        db.execSQL(sql);
        sql = " INSERT INTO SINHVIEN VALUES ('B19KH001','Nguyen Van A','anv@gmail.com','avatamacdinh','Android','KHMT')";
        db.execSQL(sql);
        sql = " INSERT INTO SINHVIEN VALUES ('B20KT001','Nguyen Tuan B','bnt@gmail.com','avatamacdinh','Kinhte','KETOAN')";
        db.execSQL(sql);
        sql = " INSERT INTO SINHVIEN VALUES ('B17CN005','Nguyen Thi C','cnt@gmail.com','avatamacdinh','Toan','CNTT')";
        db.execSQL(sql);
        sql = " INSERT INTO SINHVIEN VALUES ('B22KH007','Nguyen Hoang D','dnh@gmail.com','avatamacdinh','Android','KHMT')";
        db.execSQL(sql);
        sql = " INSERT INTO SINHVIEN VALUES ('B21AT009','Nguyen Thanh E','ent@gmail.com','avatamacdinh','Kinhte','ATTT')";
        db.execSQL(sql);
        sql = " INSERT INTO SINHVIEN VALUES ('B18DPT025','Nguyen Yen G','gny@gmail.com','avatamacdinh','Toan','DPT')";
        db.execSQL(sql);
        //tạo table taikhoan
        sql = "CREATE TABLE taiKhoan(tenTaiKhoan text primary key, matKhau text)";
        db.execSQL(sql);
        //tai khoan mac dinh admin
        sql = "INSERT INTO taiKhoan VALUES('admin','admin')";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
