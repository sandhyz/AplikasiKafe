package forms.pegawai.manager;

import classes.menu;
import classes.pegawai;
import classes.session;
import db.connection.connection;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class index extends javax.swing.JFrame {

    public Connection conn;
    String path_menu;
    private menu menu;
    int id_menus;
    

    public index() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        connection connect = new connection();
        this.conn = connect.koneksi();
        tampildata();
        resetform();
 
       
    }
    
  
    public final void tampildata() {

        try {
            menu = new menu();
            List<menu> lmn = menu.select_menu();
            DefaultTableModel tblmodel = (DefaultTableModel) TableMenu.getModel();
            tblmodel.setRowCount(0);

            for (int i = 0; i < lmn.size(); i++) {

                String id_menu = String.valueOf(lmn.get(i).getId_menu());
                String jenis_menu = String.valueOf(lmn.get(i).getJenis_menu());
                String nama_menu = String.valueOf(lmn.get(i).getNama_menu());
                String gambar = String.valueOf(lmn.get(i).getGambar());
                String harga = String.valueOf(lmn.get(i).getHarga());

                String datamenu[] = {id_menu, jenis_menu, nama_menu, gambar, harga};
                System.out.println(datamenu);
                tblmodel.addRow(datamenu);
                conn.close();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada : " + e);
        }
    }

    public void resetform() {
        nama.setText(null);
        harga.setText(null);
        labelimage.setIcon(null);
        jenis.setEnabled(true);
        jenis.setEditable(false);
        simpan.setEnabled(true);
        hapus.setEnabled(false);
        edit.setEnabled(false);
    }
    
     public void settable() {
        simpan.setEnabled(false);
        hapus.setEnabled(true);
        edit.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelimage = new javax.swing.JLabel();
        attach = new javax.swing.JButton();
        harga = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jenis = new javax.swing.JComboBox<>();
        simpan = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        hapus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMenu = new javax.swing.JTable();
        padding = new javax.swing.JPanel();
        text = new javax.swing.JLabel();
        bgpad = new javax.swing.JLabel();
        layform2 = new javax.swing.JLabel();
        layform = new javax.swing.JLabel();
        txtuser = new javax.swing.JLabel();
        txtuser1 = new javax.swing.JLabel();
        refresh = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1115, 730));
        setPreferredSize(new java.awt.Dimension(1115, 730));

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(159, 159, 159)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1102, 756));

        labelimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        attach.setText("Attach Image");
        attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachActionPerformed(evt);
            }
        });

        harga.setBorder(null);

        nama.setBorder(null);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jenis.setFont(new java.awt.Font("Bree Serif", 0, 11)); // NOI18N
        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- JENIS MENU --", "MAKANAN BERAT", "DESSERT", "MINUMAN" }));
        jenis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/b.simpan.png"))); // NOI18N
        simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/b.edit.png"))); // NOI18N
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/b.hapus.png"))); // NOI18N
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.setMinimumSize(new java.awt.Dimension(1000, 800));
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });

        TableMenu.setAutoCreateRowSorter(true);
        TableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_MENU", "JENIS_MENU", "NAMA_MENU", "GAMBAR", "HARGA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Byte.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableMenu.setSelectionBackground(new java.awt.Color(190, 91, 32));
        TableMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMenuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableMenu);

        padding.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setFont(new java.awt.Font("Bree Serif", 1, 40)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setText("MANAGE MENU");
        padding.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        bgpad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/padding top.png"))); // NOI18N
        padding.add(bgpad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 80));

        layform2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/layform.png"))); // NOI18N

        layform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/layform.png"))); // NOI18N

        txtuser.setFont(new java.awt.Font("Bree Serif", 0, 18)); // NOI18N
        txtuser.setText("Nama Menu");

        txtuser1.setFont(new java.awt.Font("Bree Serif", 0, 18)); // NOI18N
        txtuser1.setText("Harga");

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/b.refresh.png"))); // NOI18N
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(padding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jenis, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(layform, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(layform2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtuser1)))
                            .addComponent(txtuser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelimage, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(simpan)
                                .addGap(18, 18, 18)
                                .addComponent(edit)
                                .addGap(18, 18, 18)
                                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refresh))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(attach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(padding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuser1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(layform)
                            .addComponent(layform2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(labelimage, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(attach)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit)
                    .addComponent(simpan)
                    .addComponent(refresh)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Manager");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/user24px.png"))); // NOI18N
        jMenuItem1.setText("My Account");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/logout24px.png"))); // NOI18N
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Feature");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/manage.png"))); // NOI18N
        jMenuItem3.setText("Manage Menu");
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/activity23px.png"))); // NOI18N
        jMenuItem5.setText("Log Aktivitas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);
        jMenu2.add(jSeparator2);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/dollar.png"))); // NOI18N
        jMenuItem4.setText("Pemesanan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        path_menu = f.getAbsolutePath();

        try {
            BufferedImage img = null;
            img = ImageIO.read(f.getAbsoluteFile());
            Image img1 = img.getScaledInstance(labelimage.getWidth(), labelimage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img1);
            labelimage.setIcon(icon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada = " + e);
        }

    }//GEN-LAST:event_attachActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
       if(simpan.isEnabled() == true) {
        int id_menu = 0;
        String jenis_menu = jenis.getSelectedItem().toString();
        String nama_menu = nama.getText().toString();
        String harga_menu = harga.getText().toString();
        int harga = Integer.parseInt(harga_menu);
        boolean validate = false;

        
        if (nama_menu.isEmpty() || harga_menu.isEmpty() || path_menu == null || jenis_menu == "-- JENIS MENU --") {
            JOptionPane.showMessageDialog(null, "Salah Satu Data Kosong, Mohon Isi Semua Data Dengan Benar");
        } else {

            menu menu = new menu();
            menu.setId_menu(id_menu);
            menu.setJenis_menu(jenis_menu);
            menu.setNama_menu(nama_menu);
            menu.setGambar(path_menu);
            menu.setHarga(harga);

            boolean inserted = menu.insert_menu(menu);

            if (inserted) {
                JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Data!", "Success Insert", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Gagal Menambahkan Data, Coba Ulangi Kembali!", "Failed Insert", JOptionPane.ERROR_MESSAGE);
            }

        }

        tampildata();
        resetform();

           
       }
    }//GEN-LAST:event_simpanMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
       if(edit.isEnabled() == true) {
        menu menu = new menu();

        String jenis_menu = jenis.getSelectedItem().toString();
        String nama_menu = nama.getText().toString();
        String harga_menu = harga.getText().toString();
        int harga = Integer.parseInt(harga_menu);
        boolean validate = false;

        if (nama_menu.isEmpty() || harga_menu.isEmpty() || path_menu == null || jenis_menu == "-- JENIS MENU --") {
            JOptionPane.showMessageDialog(null, "Salah Satu Data Kosong, Mohon Isi Semua Data Dengan Benar");
        } else {

            menu.setId_menu(id_menus);
            menu.setJenis_menu(jenis_menu);
            menu.setNama_menu(nama_menu);
            menu.setGambar(path_menu);
            menu.setHarga(harga);

            boolean editted = menu.edit_menu(menu);

            if (editted) {
                JOptionPane.showMessageDialog(this, "Berhasil Edit Data!", "Success Insert", JOptionPane.INFORMATION_MESSAGE);
                resetform();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal Edit Data, Coba Ulangi Kembali!", "Failed Insert", JOptionPane.ERROR_MESSAGE);
            }
        }

        tampildata();
        resetform();
       }
    }//GEN-LAST:event_editMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        if (hapus.isEnabled() == true){
        JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data Tersebut?");

        if (id_menus == 0) {
            JOptionPane.showMessageDialog(null, "ID_CARD Tidak Ditemukan");
        } else {

            menu menu = new menu();

            menu.setId_menu(id_menus);

            boolean deleted = menu.delete_menu(menu);

            if (deleted) {
                JOptionPane.showMessageDialog(this, "Berhasil Hapus Data!", "Delete Success", JOptionPane.INFORMATION_MESSAGE);
                resetform();
            } else {
                JOptionPane.showMessageDialog(this, "Gagal Hapus Data, Coba Ulangi Kembali!", "Failed Delete", JOptionPane.ERROR_MESSAGE);
            }
        }

        resetform();
        tampildata();
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int validate = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?");
        if (validate == 0) {
            this.setVisible(false);
            new forms.validation.login().setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        new strukpesan().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void TableMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMenuMouseClicked
        settable();

        int baris = TableMenu.rowAtPoint(evt.getPoint());

        String id_menu = TableMenu.getValueAt(baris, 0).toString();
        int id = Integer.parseInt(id_menu);
        String jenis_menu = TableMenu.getValueAt(baris, 1).toString();
        String nama_menu = TableMenu.getValueAt(baris, 2).toString();
        String gambar = TableMenu.getValueAt(baris, 3).toString();
        String harga_menu = TableMenu.getValueAt(baris, 4).toString();

        id_menus = id;
        jenis.setSelectedItem(jenis_menu);
        nama.setText(nama_menu);

        try {
            BufferedImage img = null;
            File file = new File(gambar);
            img = ImageIO.read(file);
            Image img1 = img.getScaledInstance(labelimage.getWidth(), labelimage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img1);
            labelimage.setIcon(icon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Pada = " + e);
        }
        harga.setText(harga_menu);

    }//GEN-LAST:event_TableMenuMouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);
        new logactivity().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        tampildata();
        resetform();
    }//GEN-LAST:event_refreshMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMenu;
    private javax.swing.JButton attach;
    private javax.swing.JLabel bgpad;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel hapus;
    private javax.swing.JTextField harga;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel labelimage;
    private javax.swing.JLabel layform;
    private javax.swing.JLabel layform2;
    private javax.swing.JTextField nama;
    private javax.swing.JPanel padding;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel simpan;
    private javax.swing.JLabel text;
    private javax.swing.JLabel txtuser;
    private javax.swing.JLabel txtuser1;
    // End of variables declaration//GEN-END:variables

}