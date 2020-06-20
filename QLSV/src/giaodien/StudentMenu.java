/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodien;

import dao.QLSVDao;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pojo.Diem;
import pojo.Phuckhao;
import pojo.Tgphuckhao;

/**
 *
 * @author HP
 */
public class StudentMenu extends javax.swing.JFrame {

    private DefaultTableModel dfmtbDiem;
    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
        initComponents();
        dfmtbDiem = (DefaultTableModel) tbDiemSV.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        xemDiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDiemSV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        edtmaSV = new javax.swing.JTextField();
        edthoTen = new javax.swing.JTextField();
        edtMon = new javax.swing.JTextField();
        edtcotDiem = new javax.swing.JTextField();
        edtDiemMongMuon = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSubmitPK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txlyDo = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        btnXemKQPK = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbXemKQPK = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbNgayBD = new javax.swing.JLabel();
        lbNgayKT = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Menu");
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xem tất cả" }));

        xemDiem.setText("Xem");
        xemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemDiemActionPerformed(evt);
            }
        });

        tbDiemSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Môn", "Điểm GK", "Điểm CK", "Điểm Khác", "Tổng Điểm", "Kết Quả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDiemSV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(xemDiem)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xemDiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xem điểm", jPanel1);

        edthoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edthoTenActionPerformed(evt);
            }
        });

        edtMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtMonActionPerformed(evt);
            }
        });

        edtDiemMongMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDiemMongMuonActionPerformed(evt);
            }
        });

        jLabel1.setText("MSSV");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Môn");

        jLabel4.setText("Cột điểm");

        jLabel5.setText("Điểm mong muốn");

        jLabel6.setText("lý do");

        btnSubmitPK.setText("Gửi đơn");
        btnSubmitPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitPKActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txlyDo);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtmaSV)
                                    .addComponent(edthoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edtMon)
                                    .addComponent(edtcotDiem)
                                    .addComponent(edtDiemMongMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSubmitPK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSubmitPK)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtmaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtcotDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edthoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDiemMongMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Gửi đơn phúc khảo", jPanel2);

        btnXemKQPK.setText("Xem ket qua phuc khao");
        btnXemKQPK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemKQPKActionPerformed(evt);
            }
        });

        tbXemKQPK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Môn", "Cột Điểm", "Điểm mong đợi", "Kết quả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbXemKQPK);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemKQPK, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnXemKQPK)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kết quả phúc khảo", jPanel3);

        jLabel7.setText("Ngày BD");

        jLabel8.setText("Ngày KT");

        jButton1.setText("Xem thời gian phúc khảo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbNgayBD.setText(" ");
        lbNgayBD.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbNgayKT.setText(" ");
        lbNgayKT.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel8)
                        .addGap(55, 339, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lbNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Xem thời gian phúc khảo", jPanel4);

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Sinh Viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDangXuat)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnDangXuat))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtMonActionPerformed

    private void edtDiemMongMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDiemMongMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDiemMongMuonActionPerformed

    private void edthoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edthoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edthoTenActionPerformed

    private void xemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemDiemActionPerformed
        // TODO add your handling code here:
        String MSSV = DangNhap.MSSV;
        ArrayList<Diem> ds = QLSVDao.layDiemSV(MSSV);
        String ketQua="";
        if(ds.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "khong co gi");
        }
        for(int i=0;i<ds.size();i++)
        {
            ketQua="R";
            if(ds.get(i).getKetQua()==1)
            {
                ketQua="Đ";
            }
            dfmtbDiem.addRow(new Object[]{
            i+1,
            ds.get(i).getMaMon(),
            ds.get(i).getDiemGk(),
            ds.get(i).getDiemCk(),
            ds.get(i).getDiemKhac(),
            ds.get(i).getTongDiem(),
            ketQua
            });
        }
    }//GEN-LAST:event_xemDiemActionPerformed

    private void btnSubmitPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitPKActionPerformed
        // TODO add your handling code here:
        Date now = new Date();
        ArrayList<Tgphuckhao> ngPK=QLSVDao.layTGPK();
        Date ngBD = ngPK.get(0).getNgayBd();
        Date ngKT = ngPK.get(0).getNgayKt();
        if(now.compareTo(ngBD)<0)
        {
            JOptionPane.showMessageDialog(rootPane, "chưa đến thời gian phúc khảo");
        }
        else
        {
            if (now.compareTo(ngKT) > 0) {
                JOptionPane.showMessageDialog(rootPane, "Đã hết hạn phúc khảo");
            } else {
                String MSSV = edtmaSV.getText().toString();
                String hoTen = edthoTen.getText().toString();
                String mon = edtMon.getText().toString();
                String cotDiem = edtcotDiem.getText().toString();
                String diemMongdoi = edtDiemMongMuon.getText().toString();
                String lyDo = txlyDo.getText();
                if(MSSV.isEmpty()||hoTen.isEmpty()||mon.isEmpty()||cotDiem.isEmpty()||diemMongdoi.isEmpty()||lyDo.isEmpty())
                {
                    JOptionPane.showMessageDialog(rootPane, "chưa điền đầy đủ thông tin");
                }else
                {
                    Phuckhao pk = new Phuckhao(MSSV, hoTen, mon, cotDiem, diemMongdoi, lyDo, "C");
                    QLSVDao.themPhucKhao(pk);
                    JOptionPane.showMessageDialog(rootPane, "Gửi phúc khảo thành công");
                }
            }
        }
    }//GEN-LAST:event_btnSubmitPKActionPerformed

    private void btnXemKQPKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemKQPKActionPerformed
        // TODO add your handling code here:
        String Mssv=DangNhap.MSSV;
        ArrayList<Phuckhao> dsPK=QLSVDao.layKetQuaPhucKhao(Mssv);
        DefaultTableModel dfmXemKQPK=(DefaultTableModel) tbXemKQPK.getModel();
        if(dsPK.isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "bạn không có yêu cầu phúc khảo nào");
            dfmXemKQPK.setRowCount(0);
        }
        else
        {
            dfmXemKQPK.setRowCount(0);
            for(int i=0;i<dsPK.size();i++)
            {
                Phuckhao pk = dsPK.get(i);
                String KQ=pk.getTrangThai();
                if(KQ.equals("C"))
                {
                    KQ="Đang phê duyệt";
                }
                if(KQ.equals("D"))
                {
                    KQ="Đã duyệt";
                }
                if(KQ.equals("H"))
                {
                    KQ="Không được phê duyệt";
                }
                dfmXemKQPK.addRow(new Object[]{
                    pk.getMaMon(),
                    pk.getCotDiem(),
                    pk.getDiemMongDoi(),
                    KQ
                });
            }
        }
    }//GEN-LAST:event_btnXemKQPKActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        //StudentMenu.EXIT_ON_CLOSE;
        DangNhap.stdmn.setVisible(false);
        DangNhap.stdmn.dispose();
        
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Tgphuckhao> tgpk = null;
        tgpk = QLSVDao.layTGPK();
        lbNgayBD.setText(tgpk.get(0).getNgayBd().toString()+"");
        lbNgayKT.setText(tgpk.get(0).getNgayKt().toString()+"");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static StudentMenu Stdmn;
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Stdmn = new StudentMenu();
                Stdmn.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnSubmitPK;
    private javax.swing.JButton btnXemKQPK;
    private javax.swing.JTextField edtDiemMongMuon;
    private javax.swing.JTextField edtMon;
    private javax.swing.JTextField edtcotDiem;
    private javax.swing.JTextField edthoTen;
    private javax.swing.JTextField edtmaSV;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbNgayBD;
    private javax.swing.JLabel lbNgayKT;
    private javax.swing.JTable tbDiemSV;
    private javax.swing.JTable tbXemKQPK;
    private javax.swing.JTextPane txlyDo;
    private javax.swing.JButton xemDiem;
    // End of variables declaration//GEN-END:variables
}
