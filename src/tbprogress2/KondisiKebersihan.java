/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Deny SQP
 */
public class KondisiKebersihan extends javax.swing.JFrame {

    /**
     * Creates new form KondisiLingkungan
     */
   
    RuangKelas kls = new RuangKelas();
    int s = 0, ts = 0, kondisi;
    DatabaseWork da = new DatabaseWork();
    private Integer baris;
    private Connect con = new Connect();
    private JTable Tabelku = new JTable();
    private DefaultTableModel DefaultTabelku;
    private TableColumn kolom;
    private String a, b,c,d,e,f,g,h,i,j;
    private String C,D,E,F,G,kode;
    public KondisiKebersihan() {
      initComponents();
        Save.setVisible(false);
        Next.setVisible(false);
        btnselesai.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false);
        setResizable(false);
        setTitle("Keamanan Ruang");
        con.koneksi();
        tampilDataKeTabel();
//        enableBtn(false);
//        enviBtnSave(true);
//        enviBtnSave2(false);
//        enviBtnNew(false);
        CODE.setVisible(false);
        Delete.setVisible(false);
        Edit.setVisible(false);
        LB.setEnabled(false);
        LBR.setEnabled(false);
        DB.setEnabled(false);
        DBR.setEnabled(false);
        AB.setEnabled(false);
        ABR.setEnabled(false);
        PB.setEnabled(false);
        PBR.setEnabled(false);
        JB.setEnabled(false);
        JBR.setEnabled(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = this.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    
    }
      
    
      

     private boolean DiEdit() {
        boolean nilai = false;
        IO x = new IO(LB,LBR,DB,DBR,AB,ABR,PB,PBR,JB,JBR);
        Sistem n = new Sistem();
        kls = x.getRuangKelas();
        a = kls.getKondisiLantai();
        b = kls.getKondisiDinding();
        c = kls.getKondisiAtap();
        d = kls.getKondisiPintu();
        e = kls.getKondisiJendela();
        f = KL.getText();
        g = KD.getText();
        h = KA.getText();
        i = KP.getText();
        j = KJ.getText();
       try {
            if (a.equals("") || b.equals("") || c.equals("")|| d.equals("") || e.equals("")) {
                JOptionPane.showMessageDialog(null, "Data harus diisi semua!");
                nilai=true;
                clearTEXT();
             
            } else {
                Statement st = con.config.getConnection().createStatement();
                st.executeUpdate(
                        
                        "update keamanan set "
                        + "kokoh=" + "'" + a + "', "
                        + "kunci=" + "'" + b + "', "
                        + "bahaya=" + "'" + c + "' "
                        + "where id_kebersihan ='" + CODE.getText() 
//                        +" and " +"kokoh=" + "'" + d + "' "+"and "
//                                + "kunci=" + "'" + e + "' "+"and "
//                                + "bahaya=" + "'" + f 
                                +"'");

                tampilDataKeTabel();
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
                nilai=false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Data gagal diperbaharui! : " + ex);
        }
       return nilai;
    }
    private void klikTabel(JTable jTabel) {
        jTabel.setRowSelectionAllowed(true);
        baris = jTabel.getSelectedRow();
        String kolom1 = jTabel.getValueAt(baris, 0).toString();
        String kolom2 = jTabel.getValueAt(baris, 1).toString();
        String kolom3 = jTabel.getValueAt(baris, 2).toString();
        String kolom4 = jTabel.getValueAt(baris, 3).toString();
        String kolom5 = jTabel.getValueAt(baris, 4).toString();
        String kolom6 = jTabel.getValueAt(baris, 5).toString();
        String kolom7 = jTabel.getValueAt(baris, 6).toString();
      
        if("Bersih".equalsIgnoreCase(kolom2)){
            LB.setSelected(true);
            LBR.setSelected(false);
        }
        else if("Kotor".equalsIgnoreCase(kolom2)) {
            LB.setSelected(false);
            LBR.setSelected(true);
        }
            if("Bersih".equalsIgnoreCase(kolom3)){
                DB.setSelected(true);
                DBR.setSelected(false);
            }
            else {
                DB.setSelected(false);
                DBR.setSelected(true);
            }
                if("Bersih".equalsIgnoreCase(kolom4)){
                    AB.setSelected(false);
                    ABR.setSelected(true);
                }
                else{
                    AB.setSelected(false);
                    ABR.setSelected(true);
                }
                 if("Bersih".equalsIgnoreCase(kolom5)){
                    PB.setSelected(false);
                    PBR.setSelected(true);
                }
                else{
                    PB.setSelected(false);
                    PBR.setSelected(true);
                }
                  if("Bersih".equalsIgnoreCase(kolom6)){
                    JB.setSelected(false);
                    JBR.setSelected(true);
                }
                else{
                    JB.setSelected(false);
                    JBR.setSelected(true);
                }
        KL.setText(kolom2);
        KD.setText(kolom3);
        KA.setText(kolom4);
        KP.setText(kolom5);
        KJ.setText(kolom6);
        LB.setEnabled(false);
        LBR.setEnabled(false);
        DB.setEnabled(false);
        DBR.setEnabled(false);
        AB.setEnabled(false);
        ABR.setEnabled(false);
        PB.setEnabled(false);
        PBR.setEnabled(false);
        JB.setEnabled(false);
        JBR.setEnabled(false);
        CODE.setText(kolom7);
       // System.out.println(""+CODE.getText());
        Delete.setVisible(true);
        Edit.setVisible(true);
        Save.setVisible(false);
        
        
    }
    private void tableModel(JTable jTabel1) {
        try {
            Object[] field = {"No", "Lantai", "Dinding", "Atap", "Pintu", "Jendela", "ID"};
            DefaultTabelku = new DefaultTableModel(null, field){
                public boolean isCellEditable(int row, int column) {
                return false;
            }
    };
            
            jTabel1.setModel(DefaultTabelku);

            String sql = "Select * from kebersihan";
            Statement st = con.config.getConnection().createStatement();
            ResultSet set = st.executeQuery(sql);

            int no = 0;
            while (set.next()) {
                no++;
                String kolom1 = String.valueOf(no).toString();
                String kolom2 = set.getString("Lantai");
                String kolom3 = set.getString("Dinding");
                String kolom4 = set.getString("Atap");
                String kolom5 = set.getString("Pintu");
                String kolom6 = set.getString("Jendela");
                String kolom7 = set.getString("id_kebersihan");
                String[] data = {kolom1, kolom2, kolom3, kolom4, kolom5, kolom6, kolom7};
                DefaultTabelku.addRow(data);
            }

            jTabel1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
            
            kolom = jTabel1.getColumnModel().getColumn(0);
            kolom.setPreferredWidth(40);
            kolom = jTabel1.getColumnModel().getColumn(1);
            kolom.setPreferredWidth(145);
            kolom = jTabel1.getColumnModel().getColumn(2);
            kolom.setPreferredWidth(217);
            kolom = jTabel1.getColumnModel().getColumn(3);
            kolom.setPreferredWidth(220);
            kolom = jTabel1.getColumnModel().getColumn(4);
            kolom.setPreferredWidth(200);
            kolom = jTabel1.getColumnModel().getColumn(5);
            kolom.setPreferredWidth(220);
            kolom = jTabel1.getColumnModel().getColumn(6);
            kolom.setPreferredWidth(0);
            kolom.setMinWidth(0);
            kolom.setMaxWidth(0);
            kolom.setWidth(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Koneksi gagal: " + e);
        }
    }
    void clearTEXT() {
            LB.setSelected(false);
            LBR.setSelected(false);
            DB.setSelected(false);
            DBR.setSelected(false);
            AB.setSelected(false);
            ABR.setSelected(false);
            PB.setSelected(false);
            PBR.setSelected(false);
            JB.setSelected(false);
            JBR.setSelected(false);
    }
     private void tampilDataKeTabel() {
        Tabelku = jTable1;
        tableModel(Tabelku);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        LB = new javax.swing.JCheckBox();
        LBR = new javax.swing.JCheckBox();
        DB = new javax.swing.JCheckBox();
        DBR = new javax.swing.JCheckBox();
        AB = new javax.swing.JCheckBox();
        ABR = new javax.swing.JCheckBox();
        JB = new javax.swing.JCheckBox();
        JBR = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        PB = new javax.swing.JCheckBox();
        PBR = new javax.swing.JCheckBox();
        KL = new javax.swing.JTextField();
        KD = new javax.swing.JTextField();
        KA = new javax.swing.JTextField();
        KP = new javax.swing.JTextField();
        KJ = new javax.swing.JTextField();
        btnselesai = new javax.swing.JButton();
        CODE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Persentase Kebisingan Kelas                : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Presentase Bau di Kelas                       : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Persentase Keausan Permukaan Kelas  :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("KEBERSIHAN RUANG KELAS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Kondisi Lantai      :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Kondisi Dinding   :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Kondisi Atap       :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Kondisi Pintu      :");

        LB.setText("Bersih");
        LB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBActionPerformed(evt);
            }
        });

        LBR.setText("Kotor");
        LBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBRActionPerformed(evt);
            }
        });

        DB.setText("Bersih");
        DB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBActionPerformed(evt);
            }
        });

        DBR.setText("Kotor");
        DBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DBRActionPerformed(evt);
            }
        });

        AB.setText("Bersih");
        AB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABActionPerformed(evt);
            }
        });

        ABR.setText("Kotor");
        ABR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABRActionPerformed(evt);
            }
        });

        JB.setText("Bersih");
        JB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBActionPerformed(evt);
            }
        });

        JBR.setText("Kotor");
        JBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Kondisi Jendela   :");

        PB.setText("Bersih");
        PB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBActionPerformed(evt);
            }
        });

        PBR.setText("Kotor");
        PBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBRActionPerformed(evt);
            }
        });

        KL.setText("jTextField1");

        KD.setText("jTextField2");

        KA.setText("jTextField3");

        KP.setText("jTextField4");

        KJ.setText("jTextField5");

        btnselesai.setText("Selesai");
        btnselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselesaiActionPerformed(evt);
            }
        });

        CODE.setText("jTextField6");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jButton1.setText("Baik Semua");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Next.setText("Selanjutnya");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Delete.setText("Hapus");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Edit.setText("Edit");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Next)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Edit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(jButton1)
                    .addComponent(Next)
                    .addComponent(Delete)
                    .addComponent(Edit)
                    .addComponent(Add))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(53, 53, 53)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(LB)
                                                .addComponent(DB)
                                                .addComponent(AB))
                                            .addComponent(PB))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LBR)
                                            .addComponent(DBR)
                                            .addComponent(ABR)
                                            .addComponent(PBR)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JBR)))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnselesai)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(KL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(KD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(KA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(KP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(KJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CODE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB)
                    .addComponent(LBR)
                    .addComponent(jLabel13)
                    .addComponent(KL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DB)
                    .addComponent(DBR)
                    .addComponent(jLabel14)
                    .addComponent(KD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AB)
                    .addComponent(ABR)
                    .addComponent(jLabel16)
                    .addComponent(KA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(PB)
                    .addComponent(PBR)
                    .addComponent(KP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(JB)
                    .addComponent(JBR)
                    .addComponent(KJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(btnselesai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBActionPerformed
        LBR.setSelected(false);
    }//GEN-LAST:event_LBActionPerformed

    private void LBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBRActionPerformed
        LB.setSelected(false);
    }//GEN-LAST:event_LBRActionPerformed

    private void DBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBActionPerformed
        DBR.setSelected(false);
    }//GEN-LAST:event_DBActionPerformed

    private void DBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DBRActionPerformed
        DB.setSelected(false);
    }//GEN-LAST:event_DBRActionPerformed

    private void ABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABActionPerformed
        ABR.setSelected(false);
    }//GEN-LAST:event_ABActionPerformed

    private void ABRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABRActionPerformed
        AB.setSelected(false);
    }//GEN-LAST:event_ABRActionPerformed

    private void JBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBActionPerformed
        JBR.setSelected(false);
    }//GEN-LAST:event_JBActionPerformed

    private void JBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRActionPerformed
        JB.setSelected(false);
    }//GEN-LAST:event_JBRActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        IO x = new IO(LB,LBR,DB,DBR,AB,ABR,PB,PBR,JB,JBR);
        kls = x.getRuangKelas();
        Sistem n = new Sistem();
        int kon;
        x.output(kls.getKondisiLantai(), kls.getKondisiDinding(), kls.getKondisiAtap(), kls.getKondisiPintu(), kls.getKondisiJendela());
        System.out.println("==============Analisis=================="); 
        if (kls.getKondisiLantai().equalsIgnoreCase("Lantai Bersih")) {
            System.out.println("Kondisi Lantai : Sesuai");
            s++;
        } else {
            System.out.println("Kondisi Lantai : Tidak Sesuai");
            ts++;
        }
        if (kls.getKondisiDinding().equalsIgnoreCase("Dinding Bersih/Baik")){
            System.out.println("Kondisi Dinding : Sesuai");
            s++;
        }else {
            ts++;
            System.out.println("Kondisi Dinding : Tidak Sesuai");
        }
        if (kls.getKondisiAtap().equalsIgnoreCase("Atap Bersih")){
            System.out.println("Kondisi Atap : Sesuai");
            s++;
        }else{
            System.out.println("Kondisi Atap : Tidak Sesuai");
            ts++;
        }
        if (kls.getKondisiPintu().equalsIgnoreCase("Pintu Bersih/Baik")){
            System.out.println("Kondisi Pintu : Sesuai");
            s++;
        }else {
            System.out.println("Kondisi Pintu : Tidak Sesuai");
            ts++;
        }
        if (kls.getKondisiJendela().equalsIgnoreCase("Jendela Bersih/Baik")){
            System.out.println("Kondisi Jendela : Sesuai");
            s++;
        } else {
            System.out.println("Kondisi Jendela : Tidak Sesuai");
            ts++;
        }
        n.persentaseKondisiLingkungan(s);
        dispose();
        x.inputKondisiKenyamanan();
    }//GEN-LAST:event_NextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JB.setSelected(true);
        LB.setSelected(true);
        DB.setSelected(true);
        AB.setSelected(true);
        PB.setSelected(true);
        JBR.setSelected(false);
        LBR.setSelected(false);
        DBR.setSelected(false);
        ABR.setSelected(false);
        PBR.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBActionPerformed
       PBR.setSelected(false);
    }//GEN-LAST:event_PBActionPerformed

    private void PBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBRActionPerformed
        PB.setSelected(false);
    }//GEN-LAST:event_PBRActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
          IO x = new IO(LB,LBR,DB,DBR,AB,ABR,PB,PBR,JB,JBR);
        kls = x.getRuangKelas();
        da.Save(kls.getKondisiLantai(),kls.getKondisiDinding(),kls.getKondisiAtap(),kls.getKondisiPintu(),kls.getKondisiJendela());
        tampilDataKeTabel();
        Save.setVisible(false);
        Add.setVisible(true);
        clearTEXT();
        Next.setVisible(true);
    }//GEN-LAST:event_SaveActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
     LB.setEnabled(true);
        LBR.setEnabled(true);
        DB.setEnabled(true);
        DBR.setEnabled(true);
        AB.setEnabled(true);
        ABR.setEnabled(true);
        PB.setEnabled(true);
        PBR.setEnabled(true);
        JB.setEnabled(true);
        JBR.setEnabled(true);
        clearTEXT();
        Save.setVisible(true);
        Edit.setVisible(false);
        Delete.setVisible(false);
        Add.setVisible(false);
        Next.setVisible(false);
    }//GEN-LAST:event_AddActionPerformed

    private void btnselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnselesaiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        klikTabel(Tabelku);
        LB.setEnabled(false);
        LBR.setEnabled(false);
        DB.setEnabled(false);
        DBR.setEnabled(false);
        AB.setEnabled(false);
        ABR.setEnabled(false);
        PB.setEnabled(false);
        PBR.setEnabled(false);
        JB.setEnabled(false);
        JBR.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      da.kondisiHapus("kebersihan","id_kebersihan",CODE.getText());
        clearTEXT();
        tampilDataKeTabel();        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KondisiLingkungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KondisiKebersihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox AB;
    private javax.swing.JCheckBox ABR;
    private javax.swing.JButton Add;
    private javax.swing.JTextField CODE;
    private javax.swing.JCheckBox DB;
    private javax.swing.JCheckBox DBR;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JCheckBox JB;
    private javax.swing.JCheckBox JBR;
    private javax.swing.JTextField KA;
    private javax.swing.JTextField KD;
    private javax.swing.JTextField KJ;
    private javax.swing.JTextField KL;
    private javax.swing.JTextField KP;
    private javax.swing.JCheckBox LB;
    private javax.swing.JCheckBox LBR;
    private javax.swing.JButton Next;
    private javax.swing.JCheckBox PB;
    private javax.swing.JCheckBox PBR;
    private javax.swing.JButton Save;
    private javax.swing.JButton btnselesai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
