/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.awt.List;
import java.util.*;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import pojo.Diem;
import pojo.Lop;
import pojo.Phuckhao;
import pojo.Tkbieu;
import pojo.Tkdangnhap;
import util.NewHibernateUtil;

/**
 *
 * @author HP
 */
public class QLSVDao {

    /**
     *
     * @return
     */
    public static Tkdangnhap laySinhVien(String maSV) {
        Tkdangnhap tk = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            tk = (Tkdangnhap) session.get(Tkdangnhap.class,
                    maSV);
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return tk;
    }
    
    
    public static java.util.List<Tkdangnhap> layDanhSachTKDangNhap() {
        java.util.List<Tkdangnhap> ds = null;
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from Tkdangnhap sv";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }

    public static void themDanhSachLop(Lop lop) {
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        if (QLSVDao.laySinhVien(lop.getMssv()) != null) {
            return;
        }
        //boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lop);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            //kq = false;
        } finally {
            session.close();
        }
        
    }

    public static void themTaiKhoanDN(Tkdangnhap tk)
    {
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        if (QLSVDao.laySinhVien(tk.getMssv()) != null) {
            return;
        }
        //boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            //kq = false;
        } finally {
            session.close();
        }
        //return kq;
    }
    
    
    public static ArrayList<Lop> layDanhSachLop(String tenLop) {
        ArrayList<Lop> ds = null;
        ArrayList<Lop> dsLop= new ArrayList<>();
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select sv from Lop sv";
            Query query = session.createQuery(hql);
            ds = (ArrayList<Lop>) query.list();
            for(int i=0;i<ds.size();i++)
            {
                if(ds.get(i).getLop().equals(tenLop))
                {
                    dsLop.add(ds.get(i));
                }
            }
        } catch (HibernateException ex) {
//Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return dsLop;
    }
    
    public static void themDiem(Diem d)
    {
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
//        if (QLSVDAO.layThongTinSach(sach.getMaSach()) != null) {
//            return false;
//        }
        //boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(d);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            //kq = false;
        } finally {
            session.close();
        }
        //return kq;
    }
    
    public static ArrayList<Diem> layDSDiem(String tenLop)
    {
        ArrayList<Diem> ds = null;
        ArrayList<Diem> dsDiem= new ArrayList<>();
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "select diem from Diem diem";
            Query query = session.createQuery(hql);
            ds = (ArrayList<Diem>) query.list();
            for(int i=0;i<ds.size();i++)
            {               
                if(ds.get(i).getLop().equals(tenLop))
                {
                    dsDiem.add(ds.get(i));
                }
            }
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return dsDiem;
    }
    
    public static void updateDiem(Diem d) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
//        if (QLSVDao.laySinhVien(d.getMaSv()) == null) {
//            return;
//        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(d);
            transaction.commit();
        } catch (HibernateException ex) {
//Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        //return true;
    }
    
    public static void doiMatKhau(Tkdangnhap tk)
    {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(tk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
    }
    
    public static ArrayList<Diem> layDiemSV(String MSSV)
    {
        ArrayList<Diem> ds = null;
        //ArrayList<Diem> dsDiem= new ArrayList<>();
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "from Diem diem where diem.maSv=:maSV";
            Query query = session.createQuery(hql);
            query.setString("maSV", MSSV);
            ds = (ArrayList<Diem>) query.list();
//            for(int i=0;i<ds.size();i++)
//            {               
//                if(ds.get(i).getLop().equals(tenLop))
//                {
//                    dsDiem.add(ds.get(i));
//                }
//            }
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static void ThemTKB(Tkbieu tkb)
    {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(tkb);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            //kq = false;
        } finally {
            session.close();
        }
    }
    
    public static Lop GetSinhVien(String MSSV)
    {
        Lop lop=null;
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "from Lop lp where lp.mssv=:maSV";
            Query query = session.createQuery(hql);
            query.setString("maSV", MSSV);
            lop = (Lop) query.list();

        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lop;
    }
    
    public static ArrayList<Tkbieu> LayDSTKB(String lop)
    {
        ArrayList<Tkbieu> ds = null;
        
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "from Tkbieu tkb where tkb.lop=:LOP";
            Query query = session.createQuery(hql);
            query.setString("LOP", lop);
            ds = (ArrayList<Tkbieu>) query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
    
    public static void themPhucKhao(Phuckhao pk)
    {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(pk);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            //kq = false;
        } finally {
            session.close();
        }
    }
    
    public static ArrayList<Phuckhao> layDanhSachPhucKhao()
    {
        ArrayList<Phuckhao> ds = null;
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
        try {
            String hql = "from Phuckhao PK where PK.trangThai=:tt";
            Query query = session.createQuery(hql);
            query.setString("tt", "C");
            ds = (ArrayList<Phuckhao>) query.list();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ds;
    }
}
