package modul.pkg3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
     
/**
 *
 * @author SMK_BIM
 */
public class Frame_apotek extends javax.swing.JFrame {

    /**
     * Creates new form Frame_apotek
     */
    public Frame_apotek() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbjudul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btmixadin = new javax.swing.JButton();
        bthapecin = new javax.swing.JButton();
        btparacetamol = new javax.swing.JButton();
        btantangin = new javax.swing.JButton();
        btlaserin = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btoskadon = new javax.swing.JButton();
        btmixagrip = new javax.swing.JButton();
        btpromag = new javax.swing.JButton();
        btfeminax = new javax.swing.JButton();
        btantimo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbdeskripsi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadeskripsi = new javax.swing.JTextArea();
        cbxcari = new javax.swing.JComboBox<>();
        btcari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(204, 0, 102));
        panel2.setLayout(new java.awt.BorderLayout(5, 10));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/farmasi-removebg-preview.png"))); // NOI18N
        panel2.add(jLabel2, java.awt.BorderLayout.LINE_START);

        lbjudul.setBackground(new java.awt.Color(204, 0, 102));
        lbjudul.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        lbjudul.setForeground(new java.awt.Color(255, 204, 204));
        lbjudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbjudul.setText("APOTEK MINI");
        lbjudul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.add(lbjudul, java.awt.BorderLayout.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/farmasi-removebg-preview.png"))); // NOI18N
        panel2.add(jLabel1, java.awt.BorderLayout.LINE_END);

        jPanel1.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 703, 91));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btmixadin.setBackground(new java.awt.Color(255, 204, 204));
        btmixadin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/5.jpeg"))); // NOI18N
        btmixadin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmixadinActionPerformed(evt);
            }
        });
        jPanel3.add(btmixadin);

        bthapecin.setBackground(new java.awt.Color(255, 204, 204));
        bthapecin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/1.png"))); // NOI18N
        bthapecin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapecinActionPerformed(evt);
            }
        });
        jPanel3.add(bthapecin);

        btparacetamol.setBackground(new java.awt.Color(255, 204, 204));
        btparacetamol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/2.png"))); // NOI18N
        btparacetamol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btparacetamolActionPerformed(evt);
            }
        });
        jPanel3.add(btparacetamol);

        btantangin.setBackground(new java.awt.Color(255, 204, 204));
        btantangin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/3.png"))); // NOI18N
        btantangin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btantanginActionPerformed(evt);
            }
        });
        jPanel3.add(btantangin);

        btlaserin.setBackground(new java.awt.Color(255, 204, 204));
        btlaserin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/4.png"))); // NOI18N
        btlaserin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlaserinActionPerformed(evt);
            }
        });
        jPanel3.add(btlaserin);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 703, 112));

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btoskadon.setBackground(new java.awt.Color(255, 204, 204));
        btoskadon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/6.jpeg"))); // NOI18N
        btoskadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoskadonActionPerformed(evt);
            }
        });
        jPanel4.add(btoskadon);

        btmixagrip.setBackground(new java.awt.Color(255, 204, 204));
        btmixagrip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/7.jpeg"))); // NOI18N
        btmixagrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmixagripActionPerformed(evt);
            }
        });
        jPanel4.add(btmixagrip);

        btpromag.setBackground(new java.awt.Color(255, 204, 204));
        btpromag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/8.jpeg"))); // NOI18N
        btpromag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpromagActionPerformed(evt);
            }
        });
        jPanel4.add(btpromag);

        btfeminax.setBackground(new java.awt.Color(255, 204, 204));
        btfeminax.setForeground(new java.awt.Color(204, 0, 102));
        btfeminax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/9.jpeg"))); // NOI18N
        btfeminax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfeminaxActionPerformed(evt);
            }
        });
        jPanel4.add(btfeminax);

        btantimo.setBackground(new java.awt.Color(255, 204, 204));
        btantimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/modul/pkg3/10.jpeg"))); // NOI18N
        btantimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btantimoActionPerformed(evt);
            }
        });
        jPanel4.add(btantimo);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 215, 703, 106));

        jPanel5.setBackground(new java.awt.Color(204, 0, 102));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        lbdeskripsi.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        lbdeskripsi.setForeground(new java.awt.Color(255, 204, 204));
        lbdeskripsi.setText("JENIS GEJALA :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        jPanel5.add(lbdeskripsi, gridBagConstraints);

        txtadeskripsi.setBackground(new java.awt.Color(255, 204, 204));
        txtadeskripsi.setColumns(20);
        txtadeskripsi.setRows(5);
        jScrollPane1.setViewportView(txtadeskripsi);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.gridheight = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 121;
        jPanel5.add(jScrollPane1, gridBagConstraints);

        cbxcari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Demam", "Batuk", "Flu", "Hidung Tersumbat", "Mabuk Perjalanan", "Mual", "Nyeri Haid", "Sakit Kepala", "Nyeri Otot", "Maag", "Infeksi Kulit" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 100;
        jPanel5.add(cbxcari, gridBagConstraints);

        btcari.setBackground(new java.awt.Color(0, 0, 0));
        btcari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btcari.setForeground(new java.awt.Color(255, 204, 204));
        btcari.setText("CARI OBAT");
        btcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcariActionPerformed(evt);
            }
        });
        jPanel5.add(btcari, new java.awt.GridBagConstraints());

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 327, 700, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btparacetamolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btparacetamolActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("Paracetamol: Obat yang digunakan untuk meredakan nyeri ringan hingga sedang dan "
                        + "\n menurunkan demam. Cocok digunakan untuk mengobati sakit kepala, sakit gigi, "
                        + "\n nyeri otot, atau demam yang disebabkan oleh infeksi seperti flu. Dosis yang "
                        + "\n dianjurkan harus sesuai dengan usia dan kondisi tubuh. Tidak dianjurkan " 
                        + "\n untuk penggunaan jangka panjang tanpa petunjuk dokter. Efek samping yang umum "
                        + "\n adalah gangguan pencernaan.");
    }//GEN-LAST:event_btparacetamolActionPerformed

    private void btmixadinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmixadinActionPerformed
        // TODO add your handling code here:
        txtadeskripsi.setText("Mixadin: Obat untuk meredakan gejala flu dan batuk. Mengandung bahan aktif seperti "+
                              "\n Paracetamol untuk menurunkan demam Pseudoephedrine sebagai dekongestan untuk "+
                              "\n mengatasi hidung tersumbat, dan Dextromethorphan untuk meredakan batuk. "+
                              "\n Digunakan sesuai dosis yang dianjurkan oleh dokter atau sesuai petunjuk pada "+
                              "\n kemasan. Hindari penggunaan berlebih dan konsultasikan dengan dokter jika gejala "+
                              "\n tidak membaik dalam 3 hari.Efek samping yang mungkin terjadi termasuk kantuk"+
                              "\n dan pusing.");
    }//GEN-LAST:event_btmixadinActionPerformed

    private void bthapecinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapecinActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("Bepacort: Krim yang digunakan untuk mengatasi iritasi kulit, ruam, atau gatal-gatal." +
                          "\n Mengandung bahan aktif betamethasone yang merupakan kortikosteroid kuat yang dapat " +
                          "\n mengurangi peradangan dan reaksi alergi pada kulit. Dapat digunakan sesuai dengan " +
                          "\n anjuran dokter untuk mengobati dermatitis atau eksim. Jangan digunakan pada luka " +
                          "\n terbuka atau infeksi kulit tanpa persetujuan dokter. Efek samping mungkin termasuk " +
                          "\n sensasi terbakar, kering, atau iritasi di area yang diobati.");
    }//GEN-LAST:event_bthapecinActionPerformed

    private void btantanginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btantanginActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("Antangin: Obat herbal yang mengandung bahan alami seperti jahe dan madu,"
                        + "\n digunakan untuk meredakan gejala masuk angin seperti perut kembung, mual,"
                        + "\n dan badan meriang. Antangin juga dipercaya dapat meningkatkan  daya tahan "
                        + "\n tubuh. Digunakan sesuai petunjuk pada kemasan atau anjuran dari tenaga medis. " 
                        + "\n Aman digunakan pada dosis yang sesuai, namun tidak dianjurkan untuk "
                        + "\n penggunaan berlebihan. Efek samping jarang terjadi namun bisa termasuk reaksi alergi.");
    }//GEN-LAST:event_btantanginActionPerformed

    private void btlaserinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlaserinActionPerformed
    txtadeskripsi.setText("Laserin: Sirup herbal yang digunakan untuk meredakan sakit tenggorokan, batuk, dan pilek." +
                          "\n Mengandung bahan alami seperti ekstrak daun saga dan jahe yang dikenal dapat meredakan "
                        + "\n iritasi pada tenggorokan. Dapat diminum oleh anak-anak maupun dewasa sesuai dosis yang"
                        + "\n dianjurkan pada kemasan.Jangan digunakan pada pasien yang alergi terhadap salah satu "
                        + "\n komponen produk. Efek samping yang mungkin terjadi termasuk reaksi alergi seperti ruam kulit.");
    }//GEN-LAST:event_btlaserinActionPerformed

    private void btoskadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoskadonActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("Oxadon: Obat yang digunakan untuk meredakan nyeri otot, nyeri sendi, sakit kepala, " +
                          "\n dan sakit gigi. Oxadon mengandung bahan aktif ibuprofen yang berfungsi sebagai " +
                          "\n anti-inflamasi non-steroid (AINS) untuk meredakan peradangan dan nyeri. Dapat "
                        + "\n digunakan sesuai anjuran dokter atau petunjuk pada kemasan. Efek samping yang mungkin "
                        + "\n terjadi termasuk gangguan pencernaan seperti mual atau sakit perut, dan pusing. "
                        + "\n Hindari penggunaan jangka panjang tanpa pengawasan dokter.");
    }//GEN-LAST:event_btoskadonActionPerformed

    private void btmixagripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmixagripActionPerformed
        // TODO add your handling code here:
        txtadeskripsi.setText("Mixagrip Flu dan Batuk: Obat yang digunakan untuk meredakan gejala flu seperti demam," +
                          "\n sakit kepala, hidung tersumbat, dan batuk. Mengandung Paracetamol sebagai penurun demam," +
                          "\n Phenylephrine sebagai dekongestan untuk hidung tersumbat, dan Dextromethorphan sebagai" +
                          "\n pereda batuk. Digunakan sesuai dosis yang dianjurkan pada kemasan. Efek samping mungkin" +
                          "\n termasuk kantuk, pusing, atau mual. Tidak dianjurkan untuk penggunaan jangka panjang tanpa "
                        + "\n anjuran dokter.");
    }//GEN-LAST:event_btmixagripActionPerformed

    private void btpromagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpromagActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("Promag: Obat yang digunakan untuk meredakan gejala maag seperti perut kembung, " +
                          "\n mual, nyeri ulu hati, dan asam lambung. Mengandung bahan aktif seperti" +
                          "\n magnesium hydroxide dan aluminium hydroxide yang bekerja dengan menetralkan" +
                          "\n asam lambung. Promag dapat diminum sebelum atau sesudah makan sesuai petunjuk" +
                          "\n pada kemasan atau anjuran dokter. Efek samping yang mungkin terjadi termasuk " +
                          "\n diare atau sembelit, tergantung pada respons individu terhadap obat.");
    }//GEN-LAST:event_btpromagActionPerformed

    private void btfeminaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfeminaxActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("FeminoX: Obat yang digunakan untuk meredakan gejala nyeri haid dan kram " +
                          "\n menstruasi. Kandungan utama dalam obat ini membantu meredakan kontraksi otot" +
                          "\n yang menyebabkan kram. Gunakan sesuai dosis yang dianjurkan pada kemasan atau" +
                          "\n sesuai anjuran dokter. Efek samping mungkin termasuk sakit kepala atau mual. " +
                          "\n Hindari penggunaan berlebihan dan konsultasikan dengan dokter jika ada kondisi medis khusus.");
    }//GEN-LAST:event_btfeminaxActionPerformed

    private void btantimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btantimoActionPerformed
        // TODO add your handling code here:
    txtadeskripsi.setText("Antimo: Obat yang digunakan untuk mencegah dan mengobati mabuk perjalanan dan mual." +
                          "\n Mengandung bahan aktif Dimenhydrinate yang bekerja sebagai antihistamin untuk " +
                          "\n mencegah mual, muntah, dan pusing akibat mabuk perjalanan. Antimo juga dapat" +
                          "\n digunakan untuk mengatasi mual karena penyebab lain. Diminum sesuai dengan " +
                          "\n petunjuk pada kemasan atau sesuai anjuran dokter. Efek samping yang mungkin " +
                          "\n terjadi termasuk kantuk, mulut kering, atau penglihatan kabur.");
    }//GEN-LAST:event_btantimoActionPerformed

    private void btcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcariActionPerformed
        // TODO add your handling code here:
String gejala = (String) cbxcari.getSelectedItem();  // Mendapatkan gejala yang dipilih
    String deskripsi = "";  // Inisialisasi deskripsi

    if (gejala.equals("Demam")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Mixadin: Obat flu yang juga membantu menurunkan demam.\n" +
                    "2. Paracetamol: Untuk mengatasi demam dan sakit kepala ringan.";
    } else if (gejala.equals("Batuk")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Mixadin: Mengatasi batuk kering akibat flu.\n" +
                    "2. Laserin: Obat batuk berdahak dengan kandungan herbal.\n" +
                    "3. Mixagrip Flu dan Batuk: Mengurangi batuk dan gejala flu.";
    } else if (gejala.equals("Flu")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Mixadin: Untuk gejala flu seperti demam dan hidung tersumbat.\n" +
                    "2. Mixagrip Flu dan Batuk: Mengatasi flu, hidung tersumbat, dan batuk.";
    } else if (gejala.equals("Hidung Tersumbat")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Mixadin: Dekongestan yang membantu meredakan hidung tersumbat.\n" +
                    "2. Mixagrip Flu dan Batuk: Membantu melegakan hidung tersumbat dan batuk.";
    } else if (gejala.equals("Mabuk Perjalanan")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Antimo: Mengatasi mual, muntah, dan pusing akibat mabuk perjalanan.";
    } else if (gejala.equals("Mual")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Antimo: Untuk mengatasi mual dan muntah.\n" +
                    "2. Antangin: Mengatasi mual akibat masuk angin.\n" +
                    "3. Promag: Mengatasi mual akibat masalah lambung.";
    } else if (gejala.equals("Nyeri Haid")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Feminax: Untuk meredakan nyeri haid dan kram perut.";
    } else if (gejala.equals("Sakit Kepala")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Paracetamol: Untuk sakit kepala ringan.\n" +
                    "2. Oxadon: Untuk nyeri kepala yang lebih berat.";
    } else if (gejala.equals("Nyeri Otot")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Oxadon: Untuk meredakan nyeri otot.\n" +
                    "2. Paracetamol: Untuk nyeri otot ringan.";
    } else if (gejala.equals("Maag")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Promag: Untuk mengatasi maag, perut kembung, dan asam lambung.";
    } else if (gejala.equals("Infeksi Kulit")) {
        deskripsi = "Obat yang dapat digunakan: \n" +
                    "1. Pecin: Untuk infeksi kulit ringan seperti bisul atau luka kecil.";
    }
    txtadeskripsi.setText(deskripsi);
    }//GEN-LAST:event_btcariActionPerformed

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
            java.util.logging.Logger.getLogger(Frame_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_apotek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btantangin;
    private javax.swing.JButton btantimo;
    private javax.swing.JButton btcari;
    private javax.swing.JButton btfeminax;
    private javax.swing.JButton bthapecin;
    private javax.swing.JButton btlaserin;
    private javax.swing.JButton btmixadin;
    private javax.swing.JButton btmixagrip;
    private javax.swing.JButton btoskadon;
    private javax.swing.JButton btparacetamol;
    private javax.swing.JButton btpromag;
    private javax.swing.JComboBox<String> cbxcari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbdeskripsi;
    private javax.swing.JLabel lbjudul;
    private javax.swing.JPanel panel2;
    private javax.swing.JTextArea txtadeskripsi;
    // End of variables declaration//GEN-END:variables
}
