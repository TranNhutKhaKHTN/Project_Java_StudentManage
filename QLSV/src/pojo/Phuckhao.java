package pojo;
// Generated May 29, 2020 11:00:17 PM by Hibernate Tools 4.3.1



/**
 * Phuckhao generated by hbm2java
 */
public class Phuckhao  implements java.io.Serializable {


     private Integer stt;
     private String maSv;
     private String ten;
     private String maMon;
     private String cotDiem;
     private String diemMongDoi;
     private String liDo;
     private String trangThai;

    public Phuckhao() {
    }

    public Phuckhao(String maSv, String ten, String maMon, String cotDiem, String diemMongDoi, String liDo, String trangThai) {
       this.maSv = maSv;
       this.ten = ten;
       this.maMon = maMon;
       this.cotDiem = cotDiem;
       this.diemMongDoi = diemMongDoi;
       this.liDo = liDo;
       this.trangThai = trangThai;
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
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getMaMon() {
        return this.maMon;
    }
    
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public String getCotDiem() {
        return this.cotDiem;
    }
    
    public void setCotDiem(String cotDiem) {
        this.cotDiem = cotDiem;
    }
    public String getDiemMongDoi() {
        return this.diemMongDoi;
    }
    
    public void setDiemMongDoi(String diemMongDoi) {
        this.diemMongDoi = diemMongDoi;
    }
    public String getLiDo() {
        return this.liDo;
    }
    
    public void setLiDo(String liDo) {
        this.liDo = liDo;
    }
    public String getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }




}


