package forms.pegawai.kasir;

import classes.menu;
import classes.pesanan;
import classes.session;
import com.google.gson.Gson;
import com.mysql.cj.xdevapi.JsonArray;
import db.connection.connection;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandh
 */
public class index extends javax.swing.JFrame {

    public Connection conn;
    public int total_harga;
    public HashMap<String, menu> data_menu = new HashMap<>();
    int tot = 0;

    public index() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        connection connect = new connection();
        this.conn = connect.koneksi();
        allmenu();
        

    }
    
    public void resetform(){
    DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
    tblmodel.setRowCount(0);
    nama_pemesan.setText(null);
    meja.setSelectedItem("PILIH NOMOR MEJA");
    tot = 0;
    tot_harga.setText(null);
    pembayaran.setText(null);
    kembalian.setText(null);
    
       
    }

    public final void allmenu() {
        menu menu = new menu();
        List<menu> lmenu = menu.select_menu();

        JLabel jlabel[] = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18};
        JLabel jtext[] = {jText1, jText2, jText3, jText4, jText5, jText6, jText7, jText8, jText9, jText10, jText11, jText12, jText13, jText14, jText15, jText16, jText17, jText18};
        JLabel jnum[] = {jnum1, jnum2, jnum3, jnum4, jnum5, jnum6, jnum7, jnum8, jnum9, jnum10, jnum11, jnum12, jnum13, jnum14, jnum15, jnum16, jnum17, jnum18};

        for (int i = 0; i < jlabel.length; i++) {
            try {
                BufferedImage img = null;
                File file = new File(lmenu.get(i).getGambar());
                img = ImageIO.read(file);
                Image img1 = img.getScaledInstance(jlabel[i].getWidth(), jlabel[i].getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img1);
                jlabel[i].setIcon(icon);

                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < jtext.length; i++) {
            try {
                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < jnum.length; i++) {
            try {
                int get_harga = lmenu.get(i).getHarga();
                String harga = String.valueOf(get_harga);
                jnum[i].setText(harga);
            } catch (Exception e) {
            }
        }
    }
    public final void makananberat() {
        menu menu = new menu();
        List<menu> lmenu = menu.select_menu_makanan_berat();

        JLabel jlabel[] = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18};
        JLabel jtext[] = {jText1, jText2, jText3, jText4, jText5, jText6, jText7, jText8, jText9, jText10, jText11, jText12, jText13, jText14, jText15, jText16, jText17, jText18};
        JLabel jnum[] = {jnum1, jnum2, jnum3, jnum4, jnum5, jnum6, jnum7, jnum8, jnum9, jnum10, jnum11, jnum12, jnum13, jnum14, jnum15, jnum16, jnum17, jnum18};

        for (int i = 0; i < jlabel.length; i++) {
            try {
                BufferedImage img = null;
                File file = new File(lmenu.get(i).getGambar());
                img = ImageIO.read(file);
                Image img1 = img.getScaledInstance(jlabel[i].getWidth(), jlabel[i].getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img1);
                jlabel[i].setIcon(icon);

                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }
        }

        for (int i = 0; i < jtext.length; i++) {

            try {
                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }

        }

        for (int i = 0; i < jnum.length; i++) {

            try {
                int get_harga = lmenu.get(i).getHarga();
                String harga = String.valueOf(get_harga);
                jnum[i].setText(harga);

            } catch (Exception e) {
            }

        }
    }
    public final void dessert(){
    menu menu = new menu();
        List<menu> lmenu = menu.select_menu_dessert();

        JLabel jlabel[] = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18};
        JLabel jtext[] = {jText1, jText2, jText3, jText4, jText5, jText6, jText7, jText8, jText9, jText10, jText11, jText12, jText13, jText14, jText15, jText16, jText17, jText18};
        JLabel jnum[] = {jnum1, jnum2, jnum3, jnum4, jnum5, jnum6, jnum7, jnum8, jnum9, jnum10, jnum11, jnum12, jnum13, jnum14, jnum15, jnum16, jnum17, jnum18};

        for (int i = 0; i < jlabel.length; i++) {
            try {
                BufferedImage img = null;
                File file = new File(lmenu.get(i).getGambar());
                img = ImageIO.read(file);
                Image img1 = img.getScaledInstance(jlabel[i].getWidth(), jlabel[i].getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img1);
                jlabel[i].setIcon(icon);

                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }
        }

        for (int i = 0; i < jtext.length; i++) {

            try {
                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }

        }

        for (int i = 0; i < jnum.length; i++) {

            try {
                int get_harga = lmenu.get(i).getHarga();
                String harga = String.valueOf(get_harga);
                jnum[i].setText(harga);

            } catch (Exception e) {
            }

        }
    }
    public final void minuman(){
    menu menu = new menu();
        List<menu> lmenu = menu.select_menu_minuman();

        JLabel jlabel[] = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18};
        JLabel jtext[] = {jText1, jText2, jText3, jText4, jText5, jText6, jText7, jText8, jText9, jText10, jText11, jText12, jText13, jText14, jText15, jText16, jText17, jText18};
        JLabel jnum[] = {jnum1, jnum2, jnum3, jnum4, jnum5, jnum6, jnum7, jnum8, jnum9, jnum10, jnum11, jnum12, jnum13, jnum14, jnum15, jnum16, jnum17, jnum18};

        for (int i = 0; i < jlabel.length; i++) {
            try {
                BufferedImage img = null;
                File file = new File(lmenu.get(i).getGambar());
                img = ImageIO.read(file);
                Image img1 = img.getScaledInstance(jlabel[i].getWidth(), jlabel[i].getHeight(), Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(img1);
                jlabel[i].setIcon(icon);

                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }
        }

        for (int i = 0; i < jtext.length; i++) {

            try {
                String nama_menu = lmenu.get(i).getNama_menu();
                jtext[i].setText(nama_menu);

                data_menu.put(nama_menu, lmenu.get(i));
            } catch (Exception e) {
            }

        }

        for (int i = 0; i < jnum.length; i++) {

            try {
                int get_harga = lmenu.get(i).getHarga();
                String harga = String.valueOf(get_harga);
                jnum[i].setText(harga);

            } catch (Exception e) {
            }

        }
    }        
    
    
    public void deleteform() {
        JLabel jlabel[] = {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18};
        JLabel jtext[] = {jText1, jText2, jText3, jText4, jText5, jText6, jText7, jText8, jText9, jText10, jText11, jText12, jText13, jText14, jText15, jText16, jText17, jText18};
        JLabel jnum[] = {jnum1, jnum2, jnum3, jnum4, jnum5, jnum6, jnum7, jnum8, jnum9, jnum10, jnum11, jnum12, jnum13, jnum14, jnum15, jnum16, jnum17, jnum18};

        for (int i = 0; i < jlabel.length; i++) {
            try {
                jlabel[i].setIcon(null);

            } catch (Exception e) {
            }
        }
        for (int i = 0; i < jtext.length; i++) {
            try {
                jtext[i].setText(null);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < jnum.length; i++) {
            try {
                jnum[i].setText(null);
            } catch (Exception e) {
            }
        }
    }

    public String tojson() {
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        ArrayList<HashMap> AHM = new ArrayList<>();

        for (int i = 0; i < tblmodel.getRowCount(); i++) {
            HashMap<String, String> data_json = new HashMap<>();

            data_json.put("ID Menu", tblmodel.getValueAt(i, 0).toString());
            data_json.put("Nama Menu", tblmodel.getValueAt(i, 1).toString());
            data_json.put("QTY", tblmodel.getValueAt(i, 2).toString());
            data_json.put("Harga", tblmodel.getValueAt(i, 3).toString());
            data_json.put("Total Harga", tblmodel.getValueAt(i, 4).toString());

            AHM.add(data_json);

        }
        String hasil_json = new Gson().toJson(AHM);
        return hasil_json;
    }

    public void tampiltotalharga(int tot) {
        this.tot += tot;
        tot_harga.setText(Integer.toString(this.tot));
    }

    public void deletetotalharga(int harga) {
        this.tot -= harga;
        tot_harga.setText(Integer.toString(tot));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_pemesan = new javax.swing.JTable();
        meja = new javax.swing.JComboBox<>();
        hapus = new javax.swing.JLabel();
        tot_text = new javax.swing.JLabel();
        tot_harga = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nama_pemesan = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tot_text1 = new javax.swing.JLabel();
        pembayaran = new javax.swing.JTextField();
        tot_text2 = new javax.swing.JLabel();
        kembalian = new javax.swing.JLabel();
        laymenu = new javax.swing.JPanel();
        dessert = new javax.swing.JLabel();
        minuman = new javax.swing.JLabel();
        padding = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        all = new javax.swing.JLabel();
        makananberat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lay1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jText1 = new javax.swing.JLabel();
        jnum1 = new javax.swing.JLabel();
        lay2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jText2 = new javax.swing.JLabel();
        jnum2 = new javax.swing.JLabel();
        lay3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jText3 = new javax.swing.JLabel();
        jnum3 = new javax.swing.JLabel();
        lay4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jnum4 = new javax.swing.JLabel();
        jText4 = new javax.swing.JLabel();
        lay5 = new javax.swing.JPanel();
        jnum5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jText5 = new javax.swing.JLabel();
        lay6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jText6 = new javax.swing.JLabel();
        jnum6 = new javax.swing.JLabel();
        lay7 = new javax.swing.JPanel();
        jnum7 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jText7 = new javax.swing.JLabel();
        lay8 = new javax.swing.JPanel();
        jnum8 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jText8 = new javax.swing.JLabel();
        lay9 = new javax.swing.JPanel();
        jnum9 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jText9 = new javax.swing.JLabel();
        lay10 = new javax.swing.JPanel();
        jnum10 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jText10 = new javax.swing.JLabel();
        lay11 = new javax.swing.JPanel();
        jnum11 = new javax.swing.JLabel();
        jText11 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lay12 = new javax.swing.JPanel();
        jnum12 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jText12 = new javax.swing.JLabel();
        lay13 = new javax.swing.JPanel();
        jnum13 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jText13 = new javax.swing.JLabel();
        lay14 = new javax.swing.JPanel();
        jnum14 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jText14 = new javax.swing.JLabel();
        lay15 = new javax.swing.JPanel();
        jnum15 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jText15 = new javax.swing.JLabel();
        lay16 = new javax.swing.JPanel();
        jnum16 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jText16 = new javax.swing.JLabel();
        lay17 = new javax.swing.JPanel();
        jnum17 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jText17 = new javax.swing.JLabel();
        lay18 = new javax.swing.JPanel();
        jnum18 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jText18 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Kasir = new javax.swing.JMenu();
        myaccount = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        features = new javax.swing.JMenu();
        manageakun = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        log = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(164, 164, 164)));

        table_pemesan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Menu", "Nama Menu", "QTY", "Harga", "Total Harga"
            }
        ));
        jScrollPane2.setViewportView(table_pemesan);

        meja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH NOMOR MEJA", "1", "2", "3", "4", "5", "6", "7" }));
        meja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(98, 98, 98)));
        meja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mejaActionPerformed(evt);
            }
        });

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/b.hapus.png"))); // NOI18N
        hapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });

        tot_text.setFont(new java.awt.Font("Bree Serif", 1, 16)); // NOI18N
        tot_text.setText("TOTAL HARGA  :");

        tot_harga.setFont(new java.awt.Font("Bree Serif", 0, 16)); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/b.submit.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama_pemesan.setBorder(null);
        nama_pemesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_pemesanActionPerformed(evt);
            }
        });
        jPanel3.add(nama_pemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 250, 24));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/layform.png"))); // NOI18N
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel24.setFont(new java.awt.Font("Bree Serif", 0, 14)); // NOI18N
        jLabel24.setText("Nama Pemesan");

        tot_text1.setFont(new java.awt.Font("Bree Serif", 1, 16)); // NOI18N
        tot_text1.setText("PEMBAYARAN  :");

        pembayaran.setFont(new java.awt.Font("Bree Serif", 0, 16)); // NOI18N
        pembayaran.setBorder(null);
        pembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pembayaranKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pembayaranKeyReleased(evt);
            }
        });

        tot_text2.setFont(new java.awt.Font("Bree Serif", 1, 16)); // NOI18N
        tot_text2.setText("KEMBALIAN  :");

        kembalian.setFont(new java.awt.Font("Bree Serif", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(hapus)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tot_text1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pembayaran))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tot_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tot_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tot_text2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel24)
                .addGap(4, 4, 4)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(meja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(hapus)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_text)
                    .addComponent(tot_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_text1)
                    .addComponent(pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tot_text2)
                    .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(20, 20, 20))
        );

        laymenu.setBackground(new java.awt.Color(255, 255, 255));
        laymenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(164, 164, 164)));

        dessert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dessert.setText("DESSERT");
        dessert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dessert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dessertMouseClicked(evt);
            }
        });

        minuman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minuman.setText("MINUMAN");
        minuman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        minuman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minumanMouseClicked(evt);
            }
        });

        padding.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Bree Serif", 1, 40)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("MENU PESANAN");
        padding.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 661, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/padding top - kasir.png"))); // NOI18N
        padding.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        all.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        all.setText("ALL");
        all.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allMouseClicked(evt);
            }
        });

        makananberat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        makananberat.setText("MAKANAN BERAT");
        makananberat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        makananberat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makananberatMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(190, 91, 32));

        lay1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay1MouseClicked(evt);
            }
        });

        jText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText1.setInheritsPopupMenu(false);

        jnum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum1.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay1Layout = new javax.swing.GroupLayout(lay1);
        lay1.setLayout(lay1Layout);
        lay1Layout.setHorizontalGroup(
            lay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay1Layout.createSequentialGroup()
                        .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay1Layout.setVerticalGroup(
            lay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(lay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay2MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));

        jText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText2.setInheritsPopupMenu(false);

        jnum2.setBackground(new java.awt.Color(0, 0, 0));
        jnum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum2.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay2Layout = new javax.swing.GroupLayout(lay2);
        lay2.setLayout(lay2Layout);
        lay2Layout.setHorizontalGroup(
            lay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay2Layout.setVerticalGroup(
            lay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay2Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jText2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(lay2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        lay3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay3MouseClicked(evt);
            }
        });

        jText3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText3.setInheritsPopupMenu(false);

        jnum3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum3.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay3Layout = new javax.swing.GroupLayout(lay3);
        lay3.setLayout(lay3Layout);
        lay3Layout.setHorizontalGroup(
            lay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay3Layout.createSequentialGroup()
                        .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay3Layout.setVerticalGroup(
            lay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jText3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(lay3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(61, Short.MAX_VALUE)))
        );

        lay4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay4MouseClicked(evt);
            }
        });

        jnum4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum4.setInheritsPopupMenu(false);

        jText4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText4.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay4Layout = new javax.swing.GroupLayout(lay4);
        lay4.setLayout(lay4Layout);
        lay4Layout.setHorizontalGroup(
            lay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay4Layout.createSequentialGroup()
                        .addComponent(jText4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay4Layout.setVerticalGroup(
            lay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay4Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jText4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay5MouseClicked(evt);
            }
        });

        jnum5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum5.setInheritsPopupMenu(false);

        jText5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText5.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay5Layout = new javax.swing.GroupLayout(lay5);
        lay5.setLayout(lay5Layout);
        lay5Layout.setHorizontalGroup(
            lay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lay5Layout.createSequentialGroup()
                        .addGroup(lay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jnum5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        lay5Layout.setVerticalGroup(
            lay5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jText5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lay6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay6MouseClicked(evt);
            }
        });

        jText6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText6.setInheritsPopupMenu(false);

        jnum6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum6.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay6Layout = new javax.swing.GroupLayout(lay6);
        lay6.setLayout(lay6Layout);
        lay6Layout.setHorizontalGroup(
            lay6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jText6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(lay6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay6Layout.setVerticalGroup(
            lay6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jText6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE)))
        );

        lay7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay7.setPreferredSize(new java.awt.Dimension(214, 193));
        lay7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay7MouseClicked(evt);
            }
        });

        jnum7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum7.setInheritsPopupMenu(false);

        jText7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText7.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay7Layout = new javax.swing.GroupLayout(lay7);
        lay7.setLayout(lay7Layout);
        lay7Layout.setHorizontalGroup(
            lay7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay7Layout.createSequentialGroup()
                .addGroup(lay7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lay7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lay7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lay7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jText7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        lay7Layout.setVerticalGroup(
            lay7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jText7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lay8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay8MouseClicked(evt);
            }
        });

        jnum8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum8.setInheritsPopupMenu(false);

        jText8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText8.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay8Layout = new javax.swing.GroupLayout(lay8);
        lay8.setLayout(lay8Layout);
        lay8Layout.setHorizontalGroup(
            lay8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay8Layout.createSequentialGroup()
                        .addGroup(lay8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lay8Layout.setVerticalGroup(
            lay8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lay9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay9MouseClicked(evt);
            }
        });

        jnum9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum9.setInheritsPopupMenu(false);

        jText9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText9.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay9Layout = new javax.swing.GroupLayout(lay9);
        lay9.setLayout(lay9Layout);
        lay9Layout.setHorizontalGroup(
            lay9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lay9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jText9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lay9Layout.setVerticalGroup(
            lay9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jText9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jnum9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lay10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay10.setPreferredSize(new java.awt.Dimension(214, 193));
        lay10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay10MouseClicked(evt);
            }
        });

        jnum10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum10.setInheritsPopupMenu(false);

        jText10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText10.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay10Layout = new javax.swing.GroupLayout(lay10);
        lay10.setLayout(lay10Layout);
        lay10Layout.setHorizontalGroup(
            lay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(lay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay10Layout.setVerticalGroup(
            lay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay10Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jText10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay10Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay11MouseClicked(evt);
            }
        });

        jnum11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum11.setInheritsPopupMenu(false);

        jText11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText11.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay11Layout = new javax.swing.GroupLayout(lay11);
        lay11.setLayout(lay11Layout);
        lay11Layout.setHorizontalGroup(
            lay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay11Layout.createSequentialGroup()
                        .addComponent(jText11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay11Layout.setVerticalGroup(
            lay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jText11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay11Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay12MouseClicked(evt);
            }
        });

        jnum12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum12.setInheritsPopupMenu(false);

        jText12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText12.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay12Layout = new javax.swing.GroupLayout(lay12);
        lay12.setLayout(lay12Layout);
        lay12Layout.setHorizontalGroup(
            lay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay12Layout.createSequentialGroup()
                        .addComponent(jText12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay12Layout.setVerticalGroup(
            lay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jText12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay13.setPreferredSize(new java.awt.Dimension(214, 193));
        lay13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay13MouseClicked(evt);
            }
        });

        jnum13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum13.setInheritsPopupMenu(false);

        jText13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText13.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay13Layout = new javax.swing.GroupLayout(lay13);
        lay13.setLayout(lay13Layout);
        lay13Layout.setHorizontalGroup(
            lay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay13Layout.createSequentialGroup()
                        .addComponent(jText13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay13Layout.setVerticalGroup(
            lay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay13Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jText13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay13Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay14MouseClicked(evt);
            }
        });

        jnum14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum14.setInheritsPopupMenu(false);

        jText14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText14.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay14Layout = new javax.swing.GroupLayout(lay14);
        lay14.setLayout(lay14Layout);
        lay14Layout.setHorizontalGroup(
            lay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay14Layout.createSequentialGroup()
                        .addComponent(jText14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay14Layout.setVerticalGroup(
            lay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jText14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay15MouseClicked(evt);
            }
        });

        jnum15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum15.setInheritsPopupMenu(false);

        jText15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText15.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay15Layout = new javax.swing.GroupLayout(lay15);
        lay15.setLayout(lay15Layout);
        lay15Layout.setHorizontalGroup(
            lay15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay15Layout.createSequentialGroup()
                        .addComponent(jText15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay15Layout.setVerticalGroup(
            lay15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jText15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay16.setPreferredSize(new java.awt.Dimension(214, 193));
        lay16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay16MouseClicked(evt);
            }
        });

        jnum16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum16.setInheritsPopupMenu(false);

        jText16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText16.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay16Layout = new javax.swing.GroupLayout(lay16);
        lay16.setLayout(lay16Layout);
        lay16Layout.setHorizontalGroup(
            lay16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay16Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(jText16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(lay16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay16Layout.setVerticalGroup(
            lay16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay16Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jText16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay17MouseClicked(evt);
            }
        });

        jnum17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum17.setInheritsPopupMenu(false);

        jText17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText17.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay17Layout = new javax.swing.GroupLayout(lay17);
        lay17.setLayout(lay17Layout);
        lay17Layout.setHorizontalGroup(
            lay17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(lay17Layout.createSequentialGroup()
                        .addComponent(jText17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(lay17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay17Layout.setVerticalGroup(
            lay17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jText17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay17Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        lay18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lay18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lay18MouseClicked(evt);
            }
        });

        jnum18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jnum18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jnum18.setInheritsPopupMenu(false);

        jText18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jText18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jText18.setInheritsPopupMenu(false);

        javax.swing.GroupLayout lay18Layout = new javax.swing.GroupLayout(lay18);
        lay18.setLayout(lay18Layout);
        lay18Layout.setHorizontalGroup(
            lay18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lay18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lay18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnum18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jText18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(lay18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lay18Layout.setVerticalGroup(
            lay18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lay18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jText18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jnum18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(lay18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(lay18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lay16, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(lay13, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(lay10, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(lay4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay7, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lay2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lay9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lay12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lay15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lay18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lay1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lay4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lay8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay7, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lay10, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(lay11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lay13, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(lay14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lay16, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(lay17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lay18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1024, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout laymenuLayout = new javax.swing.GroupLayout(laymenu);
        laymenu.setLayout(laymenuLayout);
        laymenuLayout.setHorizontalGroup(
            laymenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(padding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(laymenuLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(makananberat, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        laymenuLayout.setVerticalGroup(
            laymenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laymenuLayout.createSequentialGroup()
                .addComponent(padding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(laymenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makananberat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(laymenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dessert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minuman, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(all, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        Kasir.setText("Kasir");
        Kasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KasirActionPerformed(evt);
            }
        });

        myaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/user24px.png"))); // NOI18N
        myaccount.setText("My Account");
        myaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myaccountActionPerformed(evt);
            }
        });
        Kasir.add(myaccount);
        Kasir.add(jSeparator1);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/logout24px.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        Kasir.add(logout);

        jMenuBar1.add(Kasir);

        features.setText("Features");

        manageakun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/manage.png"))); // NOI18N
        manageakun.setText("Tambah Pesan");
        features.add(manageakun);
        features.add(jSeparator2);

        log.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/activity23px.png"))); // NOI18N
        log.setText("Log Aktivitas");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        features.add(log);
        features.add(jSeparator4);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/img/admin, manager, kasir/dollar.png"))); // NOI18N
        jMenuItem1.setText("Pemesanan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        features.add(jMenuItem1);

        jMenuBar1.add(features);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(laymenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laymenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void lay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay1MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText1.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        int harga = detail_menu.getHarga();
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = harga * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, String.valueOf(harga), sbttlhrg};

        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay1MouseClicked

    private void lay2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay2MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText2.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        int harga = detail_menu.getHarga();
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = harga * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, String.valueOf(harga), sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay2MouseClicked

    private void lay3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay3MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText3.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        int harga = detail_menu.getHarga();
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = harga * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, String.valueOf(harga), sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay3MouseClicked

    private void lay4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay4MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText4.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        int harga = detail_menu.getHarga();
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = harga * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, String.valueOf(harga), sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay4MouseClicked

    private void lay5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay5MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText5.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay5MouseClicked

    private void lay6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay6MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText6.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay6MouseClicked

    private void lay7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay7MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText7.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay7MouseClicked

    private void lay8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay8MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText8.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay8MouseClicked

    private void lay9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay9MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText9.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay9MouseClicked

    private void lay10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay10MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText10.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay10MouseClicked

    private void lay11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay11MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText11.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay11MouseClicked

    private void lay12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay12MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText12.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay12MouseClicked

    private void lay13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay13MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText13.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay13MouseClicked

    private void lay14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay14MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText14.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay14MouseClicked

    private void lay15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay15MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText15.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay15MouseClicked

    private void lay16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay16MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText16.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay16MouseClicked

    private void lay17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay17MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText17.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay17MouseClicked

    private void lay18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lay18MouseClicked
        DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
        menu detail_menu = data_menu.get(jText18.getText());

        String id_menu = String.valueOf(detail_menu.getId_menu());
        String nama_pesanan = String.valueOf(detail_menu.getNama_menu());
        String harga = String.valueOf(detail_menu.getHarga());
        String qty = JOptionPane.showInputDialog(this, "Masukan Jumlah Pesanan");

        if (qty.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Pesanan Tidak Boleh Kosong", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

        int totalhargax = Integer.parseInt(harga) * Integer.parseInt(qty);
        String sbttlhrg = String.valueOf(totalhargax);
        String data_selected[] = {id_menu, nama_pesanan, qty, harga, sbttlhrg};
        tblmodel.addRow(data_selected);
        tampiltotalharga(totalhargax);
    }//GEN-LAST:event_lay18MouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        int validate = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Menghapus Data Tersebut?");

        if (validate == 0) {
            DefaultTableModel tblmodel = (DefaultTableModel) table_pemesan.getModel();
            int indexrow = table_pemesan.getSelectedRow();
            int harga = Integer.parseInt(table_pemesan.getValueAt(indexrow, 4).toString());

            tblmodel.removeRow(indexrow);

            System.out.println(harga);
            deletetotalharga(harga);
            kembalian.setText(null);
            pembayaran.setText(null);
        }
    }//GEN-LAST:event_hapusMouseClicked

    private void mejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mejaActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        int validate = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Ingin Memesan Data tersebut?");

        if (validate == 1) {

        } else {

            String detail_pesan = tojson();
            String nama = nama_pemesan.getText();
            String no_meja = meja.getSelectedItem().toString();
            int intmeja = Integer.parseInt(no_meja);
            String total_pesanan = tot_harga.getText();

            if (detail_pesan.isEmpty() || nama.isEmpty() || no_meja == "PILIH NOMOR MEJA") {
                JOptionPane.showMessageDialog(null, "Salah Satu Data Kosong, Mohon Isi Semua Data Dengan Benar");
            } else {

                pesanan psn = new pesanan();
                psn.setId_pegawai(session.getUserlogin());
                psn.setNama_pemesan(nama);
                psn.setNo_meja(intmeja);
                psn.setTotal_harga(total_pesanan);
                psn.setDet_pesanan(detail_pesan);

                boolean inserted = psn.insert_data(psn);

                if (inserted) {
                    JOptionPane.showMessageDialog(this, "Berhasil Menambahkan Data!", "Success Insert", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(this, "Gagal Menambahkan Data, Coba Ulangi Kembali!", "Failed Insert", JOptionPane.ERROR_MESSAGE);
                }
                resetform();
            }

        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void allMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allMouseClicked
        allmenu();
    }//GEN-LAST:event_allMouseClicked

    private void makananberatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makananberatMouseClicked
        deleteform();
        makananberat();

    }//GEN-LAST:event_makananberatMouseClicked

    private void dessertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dessertMouseClicked
        deleteform();
        dessert();
    }//GEN-LAST:event_dessertMouseClicked

    private void minumanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minumanMouseClicked
        deleteform();
        minuman();
    }//GEN-LAST:event_minumanMouseClicked

    private void myaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myaccountActionPerformed
        this.setVisible(false);
        new forms.admin.account().setVisible(true);
    }//GEN-LAST:event_myaccountActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int validate = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?");
        if (validate == 0) {
            this.setVisible(false);
            new forms.validation.login().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void KasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KasirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KasirActionPerformed

    private void nama_pemesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_pemesanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_pemesanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);
        new strukpesan().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        this.setVisible(false);
        new logactivity().setVisible(true);
    }//GEN-LAST:event_logActionPerformed

    private void pembayaranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pembayaranKeyPressed
        
    }//GEN-LAST:event_pembayaranKeyPressed

    private void pembayaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pembayaranKeyReleased
        int pmbyrn = Integer.parseInt(pembayaran.getText());
        int total_harga = Integer.parseInt(tot_harga.getText());
        int hasil = pmbyrn - this.tot;
       
        kembalian.setText(String.valueOf(hasil));
    }//GEN-LAST:event_pembayaranKeyReleased

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Kasir;
    private javax.swing.JLabel all;
    private javax.swing.JLabel dessert;
    private javax.swing.JMenu features;
    private javax.swing.JLabel hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JLabel jText1;
    private javax.swing.JLabel jText10;
    private javax.swing.JLabel jText11;
    private javax.swing.JLabel jText12;
    private javax.swing.JLabel jText13;
    private javax.swing.JLabel jText14;
    private javax.swing.JLabel jText15;
    private javax.swing.JLabel jText16;
    private javax.swing.JLabel jText17;
    private javax.swing.JLabel jText18;
    private javax.swing.JLabel jText2;
    private javax.swing.JLabel jText3;
    private javax.swing.JLabel jText4;
    private javax.swing.JLabel jText5;
    private javax.swing.JLabel jText6;
    private javax.swing.JLabel jText7;
    private javax.swing.JLabel jText8;
    private javax.swing.JLabel jText9;
    private javax.swing.JLabel jnum1;
    private javax.swing.JLabel jnum10;
    private javax.swing.JLabel jnum11;
    private javax.swing.JLabel jnum12;
    private javax.swing.JLabel jnum13;
    private javax.swing.JLabel jnum14;
    private javax.swing.JLabel jnum15;
    private javax.swing.JLabel jnum16;
    private javax.swing.JLabel jnum17;
    private javax.swing.JLabel jnum18;
    private javax.swing.JLabel jnum2;
    private javax.swing.JLabel jnum3;
    private javax.swing.JLabel jnum4;
    private javax.swing.JLabel jnum5;
    private javax.swing.JLabel jnum6;
    private javax.swing.JLabel jnum7;
    private javax.swing.JLabel jnum8;
    private javax.swing.JLabel jnum9;
    private javax.swing.JLabel kembalian;
    private javax.swing.JPanel lay1;
    private javax.swing.JPanel lay10;
    private javax.swing.JPanel lay11;
    private javax.swing.JPanel lay12;
    private javax.swing.JPanel lay13;
    private javax.swing.JPanel lay14;
    private javax.swing.JPanel lay15;
    private javax.swing.JPanel lay16;
    private javax.swing.JPanel lay17;
    private javax.swing.JPanel lay18;
    private javax.swing.JPanel lay2;
    private javax.swing.JPanel lay3;
    private javax.swing.JPanel lay4;
    private javax.swing.JPanel lay5;
    private javax.swing.JPanel lay6;
    private javax.swing.JPanel lay7;
    private javax.swing.JPanel lay8;
    private javax.swing.JPanel lay9;
    private javax.swing.JPanel laymenu;
    private javax.swing.JMenuItem log;
    private javax.swing.JMenuItem logout;
    private javax.swing.JLabel makananberat;
    private javax.swing.JMenuItem manageakun;
    private javax.swing.JComboBox<String> meja;
    private javax.swing.JLabel minuman;
    private javax.swing.JMenuItem myaccount;
    private javax.swing.JTextField nama_pemesan;
    private javax.swing.JPanel padding;
    private javax.swing.JTextField pembayaran;
    private javax.swing.JTable table_pemesan;
    private javax.swing.JLabel tot_harga;
    private javax.swing.JLabel tot_text;
    private javax.swing.JLabel tot_text1;
    private javax.swing.JLabel tot_text2;
    // End of variables declaration//GEN-END:variables
}
