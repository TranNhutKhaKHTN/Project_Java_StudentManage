package pojo;
// Generated Jun 10, 2020 7:55:54 PM by Hibernate Tools 4.3.1



/**
 * Diem generated by hbm2java
 */
public class Diem  implements java.io.Serializable {


     private Integer stt;
     private String maSv;
     private String maMon;
     private String lop;
     private Float diemGk;
     private Float diemCk;
     private Float diemKhac;
     private Float tongDiem;
     private Integer ketQua;

    public Diem() {
    }

    public Diem(String maSv, String maMon, String lop, Float diemGk, Float diemCk, Float diemKhac, Float tongDiem, Integer ketQua) {
       this.maSv = maSv;
       this.maMon = maMon;
       this.lop = lop;
       this.diemGk = diemGk;
       this.diemCk = diemCk;
       this.diemKhac = diemKhac;
       this.tongDiem = tongDiem;
       this.ketQua = ketQua;
    }
   
    public Integer getStt() {
        return this.stt;
    }
    
    public void setStt(Integer stt) {
        this.stt = stt;
    }
    public String getMaSv() {
        return this.maSv;
    }
    
    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }
    public String getMaMon() {
        return this.maMon;
    }
    
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public String getLop() {
        return this.lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }
    public Float getDiemGk() {
        return this.diemGk;
    }
    
    public void setDiemGk(Float diemGk) {
        this.diemGk = diemGk;
    }
    public Float getDiemCk() {
        return this.diemCk;
    }
    
    public void setDiemCk(Float diemCk) {
        this.diemCk = diemCk;
    }
    public Float getDiemKhac() {
        return this.diemKhac;
    }
    
    public void setDiemKhac(Float diemKhac) {
        this.diemKhac = diemKhac;
    }
    public Float getTongDiem() {
        return this.tongDiem;
    }
    
    public void setTongDiem(Float tongDiem) {
        this.tongDiem = tongDiem;
    }
    public Integer getKetQua() {
        return this.ketQua;
    }
    
    public void setKetQua(Integer ketQua) {
        this.ketQua = ketQua;
    }




}


