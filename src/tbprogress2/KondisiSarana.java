/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tbprogress2;

/**
 *
 * @author eko
 */
public class KondisiSarana extends javax.swing.JFrame {

    int s = 0, ts = 0, kondisi;
    RuangKelas kls = new RuangKelas();

    public KondisiSarana() {
        initComponents();
//        kontak.setText("1");
//                jlcd.setText("1");
//                jlampu.setText("1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LANJUT = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        kklr = new javax.swing.JCheckBox();
        kkl = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        klr = new javax.swing.JCheckBox();
        klb = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        plr = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jlcd = new javax.swing.JTextField();
        pskr = new javax.swing.JCheckBox();
        psk = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        bsk = new javax.swing.JCheckBox();
        skr = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kontak = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pkl = new javax.swing.JCheckBox();
        pklr = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        jlampu = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        plb = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        lampurusak = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        lampubaik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sbaik = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        srusak = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        lcdbaik = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        lcdrusak = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LANJUT.setText("Selanjutnya");
        LANJUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LANJUTActionPerformed(evt);
            }
        });

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        kklr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kklr.setText("Rusak");
        kklr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kklrActionPerformed(evt);
            }
        });

        kkl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kkl.setText("Baik/Berfungsi");
        kkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kklActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Kondisi Kabel Lcd ?");

        klr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        klr.setText("Rusak");
        klr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klrActionPerformed(evt);
            }
        });

        klb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        klb.setText("Baik/Berfungsi");
        klb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klbActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Kondisi Lampu ?");

        plr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plr.setText("Lain-Lain");
        plr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plrActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Jumlah Kabel Lcd ?");

        jlcd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlcdActionPerformed(evt);
            }
        });

        pskr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pskr.setText("Samping kelas");
        pskr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pskrActionPerformed(evt);
            }
        });

        psk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        psk.setText("Dekat Dosen/Pojok Kelas");
        psk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pskActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Posisi Stop Kontak ?");

        bsk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bsk.setText("Baik");
        bsk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bskActionPerformed(evt);
            }
        });

        skr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        skr.setText("Rusak");
        skr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skrActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Kondisi Stop Kontak ?");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("KONDISI SARANA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Jumlah Stop Kontak ?");

        kontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontakActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Posisi Kabel Lcd ?");

        pkl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pkl.setText("Dekat Dosen/Pojok Kelas");
        pkl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pklActionPerformed(evt);
            }
        });

        pklr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pklr.setText("Samping kelas");
        pklr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pklrActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Jumlah Lampu ?");

        jlampu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlampuActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Posisi Lampu ? ");

        plb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plb.setText("Atap Ruangan");
        plb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plbActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Rusak");

        lampurusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lampurusakActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Baik");

        lampubaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lampubaikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pkl)
                    .addComponent(pklr)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jlampu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addComponent(plb)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lampubaik, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lampurusak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pkl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pklr)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jlampu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lampubaik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(lampurusak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(plb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Baik");

        sbaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbaikActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Rusak");

        srusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srusakActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Baik");

        lcdbaik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcdbaikActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Rusak");

        lcdrusak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcdrusakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kklr)))
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bsk)
                                        .addGap(18, 18, 18)
                                        .addComponent(skr))
                                    .addComponent(psk)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlcd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pskr)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kontak, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(kkl)
                                    .addComponent(jLabel8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sbaik, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(srusak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcdbaik, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lcdrusak, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(klr)
                                    .addComponent(plr, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(klb))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(LANJUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(kontak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sbaik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(srusak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsk)
                            .addComponent(skr))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(psk)
                        .addGap(18, 18, 18)
                        .addComponent(pskr)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jlcd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lcdbaik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(lcdrusak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(kkl)
                        .addGap(18, 18, 18)
                        .addComponent(kklr))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plr)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(klb)
                        .addGap(18, 18, 18)
                        .addComponent(klr)
                        .addGap(66, 66, 66)))
                .addComponent(LANJUT)
                .addGap(38, 38, 38)
                .addComponent(hapus)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontakActionPerformed
        kontak.setText("2");
    }//GEN-LAST:event_kontakActionPerformed

    private void pklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pklActionPerformed
        pklr.setSelected(false);
    }//GEN-LAST:event_pklActionPerformed

    private void pklrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pklrActionPerformed
        pkl.setSelected(false);
    }//GEN-LAST:event_pklrActionPerformed

    private void skrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skrActionPerformed
        bsk.setSelected(false);
    }//GEN-LAST:event_skrActionPerformed

    private void bskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bskActionPerformed
        skr.setSelected(false);
    }//GEN-LAST:event_bskActionPerformed

    private void pskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pskActionPerformed
        pskr.setSelected(false);
    }//GEN-LAST:event_pskActionPerformed

    private void pskrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pskrActionPerformed
        psk.setSelected(false);
    }//GEN-LAST:event_pskrActionPerformed

    private void jlcdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlcdActionPerformed
        jlcd.setText("2");
    }//GEN-LAST:event_jlcdActionPerformed

    private void jlampuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlampuActionPerformed
        jlampu.setText("2");
    }//GEN-LAST:event_jlampuActionPerformed

    private void plbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plbActionPerformed
        plr.setSelected(false);
    }//GEN-LAST:event_plbActionPerformed

    private void plrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plrActionPerformed
        plb.setSelected(false);
    }//GEN-LAST:event_plrActionPerformed

    private void klbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klbActionPerformed
        klr.setSelected(false);
    }//GEN-LAST:event_klbActionPerformed

    private void klrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klrActionPerformed
        klb.setSelected(false);
    }//GEN-LAST:event_klrActionPerformed

    private void kklActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kklActionPerformed
        kklr.setSelected(false);
    }//GEN-LAST:event_kklActionPerformed

    private void kklrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kklrActionPerformed
        kkl.setSelected(false);
    }//GEN-LAST:event_kklrActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        kontak.setText(null);
        bsk.setText(null);
        skr.setText(null);
        psk.setText(null);
        pskr.setText(null);
        jlcd.setText(null);
        kkl.setText(null);
        kklr.setText(null);
        pkl.setText(null);
        pklr.setText(null);
        jlampu.setText(null);
        klb.setText(null);
        klr.setText(null);
        plb.setText(null);
        plr.setText(null);
    }//GEN-LAST:event_hapusActionPerformed

    private void LANJUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LANJUTActionPerformed
        IO x = new IO();
        Sistem n = new Sistem();
        kls = x.getRuangKelas();
        x.output(kls.getJumlahStopKontak(),kls.getKondisiStopKontak(),kls.getPosisiStopKontak(),kls.getJumlahKabelLCD(),kls.getKondisiKabelLCD(),
            kls.getPosisiKabelLCD(),kls.getJumlahLampu(),kls.getKondisiLampu(),kls.getPosisiLampu());
        System.out.println("==============Analisis==================");
        if (kls.getJumlahStopKontak() >= 4) {
            System.out.println("Jumlah Stop Kontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesusai");
            ts++;
        }
        if (kls.getKondisiStopKontak().equalsIgnoreCase("baik")){
            System.out.println("KondisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak Sesuai");
        }
        if (kls.getPosisiStopKontak().equalsIgnoreCase("DekatDosen") || kls.getPosisiStopKontak().equalsIgnoreCase("PojokKelas")) {
            System.out.println("PosisiStopKontak : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahKabelLCD()>=1){
            System.out.println("JumlahKabelLCD : s");
            s++;

        } else {
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiKabelLCD().equalsIgnoreCase("baik")|| kls.getKondisiKabelLCD().equalsIgnoreCase("berfungsi")){
            System.out.println("KondisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiKabelLCD().equalsIgnoreCase("dekatdosen")){
            System.out.println("PosisiKabelLCD : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getJumlahLampu()>=18){
            System.out.println("JumlahLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getKondisiLampu().equalsIgnoreCase("baik")){
            System.out.println("KondisiLampu : s");
            s++;
        }else{
            System.out.println("Tidak s");
            ts++;
        }
        if(kls.getPosisiLampu().equalsIgnoreCase("atapruangan")){
            System.out.println("PosisiLampu : s");
            s++;
        } else {
            System.out.println("Tidak s");
            ts++;
        }
        n.persentaseKondisiSarana();
        dispose();
    }//GEN-LAST:event_LANJUTActionPerformed

    private void sbaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbaikActionPerformed
        sbaik.setText("");
    }//GEN-LAST:event_sbaikActionPerformed

    private void srusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srusakActionPerformed
        srusak.setText("");
    }//GEN-LAST:event_srusakActionPerformed

    private void lcdbaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcdbaikActionPerformed
        lcdbaik.setText("");
    }//GEN-LAST:event_lcdbaikActionPerformed

    private void lcdrusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcdrusakActionPerformed
        lcdrusak.setText("");
    }//GEN-LAST:event_lcdrusakActionPerformed

    private void lampubaikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lampubaikActionPerformed
        lampubaik.setText("");
    }//GEN-LAST:event_lampubaikActionPerformed

    private void lampurusakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lampurusakActionPerformed
        lampurusak.setText("");
    }//GEN-LAST:event_lampurusakActionPerformed

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
            java.util.logging.Logger.getLogger(KondisiSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KondisiSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KondisiSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KondisiSarana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KondisiSarana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LANJUT;
    private javax.swing.JCheckBox bsk;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField jlampu;
    private javax.swing.JTextField jlcd;
    private javax.swing.JCheckBox kkl;
    private javax.swing.JCheckBox kklr;
    private javax.swing.JCheckBox klb;
    private javax.swing.JCheckBox klr;
    private javax.swing.JTextField kontak;
    private javax.swing.JTextField lampubaik;
    private javax.swing.JTextField lampurusak;
    private javax.swing.JTextField lcdbaik;
    private javax.swing.JTextField lcdrusak;
    private javax.swing.JCheckBox pkl;
    private javax.swing.JCheckBox pklr;
    private javax.swing.JCheckBox plb;
    private javax.swing.JCheckBox plr;
    private javax.swing.JCheckBox psk;
    private javax.swing.JCheckBox pskr;
    private javax.swing.JTextField sbaik;
    private javax.swing.JCheckBox skr;
    private javax.swing.JTextField srusak;
    // End of variables declaration//GEN-END:variables
}
