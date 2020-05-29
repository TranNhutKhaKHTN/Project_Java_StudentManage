/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

import dao.QLSVDao;
import java.awt.List;
import java.util.*;
import pojo.Tkdangnhap;

/**
 *
 * @author HP
 */
public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Tkdangnhap> tk = new ArrayList<>();
        tk = (ArrayList<Tkdangnhap>) QLSVDao.layDanhSachTKDangNhap();
        for(int i=0;i<tk.size();i++)
        {
            System.out.println(tk.get(i).getMssv());
            System.out.println(tk.get(i).getPassword());
        }
    }
    
}
