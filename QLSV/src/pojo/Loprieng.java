package pojo;
// Generated Jun 3, 2020 2:23:50 PM by Hibernate Tools 4.3.1



/**
 * Loprieng generated by hbm2java
 */
public class Loprieng  implements java.io.Serializable {


     private Integer stt;
     private String maLop;
     private String maSv;
     private String maMon;

    public Loprieng() {
    }

    public Loprieng(String maLop, String maSv, String maMon) {
       this.maLop = maLop;
       this.maSv = maSv;
       this.maMon = maMon;
    }
   
    public Integer getStt() {
        return this.stt;
    }
    
    public void setStt(Integer stt) {
        this.stt = stt;
    }
    public String getMaLop() {
        return this.maLop;
    }
    
    public void setMaLop(String maLop) {
        this.maLop = maLop;
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




}


