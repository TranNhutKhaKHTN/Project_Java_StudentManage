package pojo;
// Generated Jun 3, 2020 2:23:50 PM by Hibernate Tools 4.3.1



/**
 * Tkbieu generated by hbm2java
 */
public class Tkbieu  implements java.io.Serializable {


     private Integer stt;
     private String maMon;
     private String tenMon;
     private String lop;
     private String phong;

    public Tkbieu() {
    }

    public Tkbieu(String maMon, String tenMon, String lop, String phong) {
       this.maMon = maMon;
       this.tenMon = tenMon;
       this.lop = lop;
       this.phong = phong;
    }
   
    public Integer getStt() {
        return this.stt;
    }
    
    public void setStt(Integer stt) {
        this.stt = stt;
    }
    public String getMaMon() {
        return this.maMon;
    }
    
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public String getTenMon() {
        return this.tenMon;
    }
    
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    public String getLop() {
        return this.lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getPhong() {
        return this.phong;
    }
    
    public void setPhong(String phong) {
        this.phong = phong;
    }




}


