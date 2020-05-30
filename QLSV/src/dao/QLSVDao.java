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
import org.hibernate.Transaction;
import pojo.Lop;
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

    public static boolean themDanhSachLop(Lop lop) {
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
//        if (QLSVDAO.layThongTinSach(sach.getMaSach()) != null) {
//            return false;
//        }
        boolean kq = true;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lop);
            transaction.commit();
        } catch (HibernateException ex) {
            transaction.rollback();
            System.err.println(ex);
            kq = false;
        } finally {
            session.close();
        }
        return kq;
    }

    public static void themTaiKhoanDN(Tkdangnhap tk)
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
}
