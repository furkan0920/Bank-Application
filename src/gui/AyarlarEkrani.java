/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlari;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author ayakdas
 */
public class AyarlarEkrani extends javax.swing.JFrame implements IDuzenleyici, IBilgiController {

    private TelNoYenileme telNoYenilemeObject = null;

    private String eskiTelNo = null;
    public AyarlarEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
         this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        ayarlarEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(telNoText);
        TextAyarlari.setMaxLimit(telNoText, 11);
        this.telNoText.setText(getHesapBilgileri().getTelNo());
        this.eskiTelNo = telNoText.getText();
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkraniPanel7 = new javax.swing.JPanel();
        geriIcon7 = new javax.swing.JLabel();
        kullaniciAdiSoyadiLabel7 = new javax.swing.JLabel();
        mesajTelNoLabel7 = new javax.swing.JLabel();
        telNoText7 = new javax.swing.JTextField();
        telNoDegistirIcon7 = new javax.swing.JLabel();
        mesajSifreLabel7 = new javax.swing.JLabel();
        sifreText7 = new javax.swing.JTextField();
        sifreDegistirIcon7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ayarlarEkraniPanel7.setBackground(new java.awt.Color(0, 153, 153));

        geriIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIcon7MouseClicked(evt);
            }
        });

        kullaniciAdiSoyadiLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel7.setForeground(new java.awt.Color(255, 0, 51));
        kullaniciAdiSoyadiLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel7.setText("Sayın [KULLANICI ADI SOYADI]");

        mesajTelNoLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelNoLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelNoLabel7.setText("Telefon Numaranız :");

        telNoText7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoText7.setEnabled(false);

        telNoDegistirIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        telNoDegistirIcon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telNoDegistirIcon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telNoDegistirIcon7MouseClicked(evt);
            }
        });

        mesajSifreLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSifreLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSifreLabel7.setText("Şifreniz :");

        sifreText7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreText7.setText("*************");
        sifreText7.setEnabled(false);

        sifreDegistirIcon7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updateTelIcon.png"))); // NOI18N
        sifreDegistirIcon7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreDegistirIcon7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreDegistirIcon7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ayarlarEkraniPanel7Layout = new javax.swing.GroupLayout(ayarlarEkraniPanel7);
        ayarlarEkraniPanel7.setLayout(ayarlarEkraniPanel7Layout);
        ayarlarEkraniPanel7Layout.setHorizontalGroup(
            ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon7)
                        .addGap(18, 18, 18)
                        .addComponent(kullaniciAdiSoyadiLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                        .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesajTelNoLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesajSifreLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                                .addComponent(sifreText7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sifreDegistirIcon7))
                            .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                                .addComponent(telNoText7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telNoDegistirIcon7)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        ayarlarEkraniPanel7Layout.setVerticalGroup(
            ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(kullaniciAdiSoyadiLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(geriIcon7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mesajTelNoLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telNoText7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(telNoDegistirIcon7))
                .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ayarlarEkraniPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sifreText7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesajSifreLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ayarlarEkraniPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sifreDegistirIcon7)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ayarlarEkraniPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriIcon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIcon7MouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_geriIcon7MouseClicked

    private void telNoDegistirIcon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telNoDegistirIcon7MouseClicked
        if (this.clickCounter == 0) { //daha önce tıklanmamışsa
            telNoText.setEnabled(true);
            IconAyarlari.changeIcon(telNoDegistirIcon, "updateTelIcon2");
            clickCounter++;
        } else { //daha önce tıklanmışsa
            telNoText.setEnabled(false);
            this.telNoYenile();
            IconAyarlari.setOriginalIcon(telNoDegistirIcon);
            clickCounter = 0;
        }
    }//GEN-LAST:event_telNoDegistirIcon7MouseClicked

    private void sifreDegistirIcon7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreDegistirIcon7MouseClicked

    }//GEN-LAST:event_sifreDegistirIcon7MouseClicked
private int clickCounter = 0;private void telNoYenile() {
        if (this.bilgilerGecerliMi()) {
            String yeniTelNo = this.telNoText.getText().trim();
            getTelNoYenilemeObject().setTelNo(yeniTelNo);
            if (getTelNoYenilemeObject().telNoYenilendiMi()) {
                Dialogs.ozelMesajGoster(this, "Telefon numarası " + yeniTelNo + " olarak güncellenmiştir.");
            } else {
                Dialogs.ozelMesajGoster(this, "Başarısız.Bilgileri kontrol edin!");
                this.telNoText.setText(this.eskiTelNo);
            }
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
            this.telNoText.setText(this.eskiTelNo);
        }
    }
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
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AyarlarEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AyarlarEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ayarlarEkraniPanel;
    private javax.swing.JPanel ayarlarEkraniPanel1;
    private javax.swing.JPanel ayarlarEkraniPanel2;
    private javax.swing.JPanel ayarlarEkraniPanel3;
    private javax.swing.JPanel ayarlarEkraniPanel4;
    private javax.swing.JPanel ayarlarEkraniPanel5;
    private javax.swing.JPanel ayarlarEkraniPanel6;
    private javax.swing.JPanel ayarlarEkraniPanel7;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel geriIcon1;
    private javax.swing.JLabel geriIcon2;
    private javax.swing.JLabel geriIcon3;
    private javax.swing.JLabel geriIcon4;
    private javax.swing.JLabel geriIcon5;
    private javax.swing.JLabel geriIcon6;
    private javax.swing.JLabel geriIcon7;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel1;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel2;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel3;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel4;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel5;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel6;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel7;
    private javax.swing.JLabel mesajSifreLabel;
    private javax.swing.JLabel mesajSifreLabel1;
    private javax.swing.JLabel mesajSifreLabel2;
    private javax.swing.JLabel mesajSifreLabel3;
    private javax.swing.JLabel mesajSifreLabel4;
    private javax.swing.JLabel mesajSifreLabel5;
    private javax.swing.JLabel mesajSifreLabel6;
    private javax.swing.JLabel mesajSifreLabel7;
    private javax.swing.JLabel mesajTelNoLabel;
    private javax.swing.JLabel mesajTelNoLabel1;
    private javax.swing.JLabel mesajTelNoLabel2;
    private javax.swing.JLabel mesajTelNoLabel3;
    private javax.swing.JLabel mesajTelNoLabel4;
    private javax.swing.JLabel mesajTelNoLabel5;
    private javax.swing.JLabel mesajTelNoLabel6;
    private javax.swing.JLabel mesajTelNoLabel7;
    private javax.swing.JLabel sifreDegistirIcon;
    private javax.swing.JLabel sifreDegistirIcon1;
    private javax.swing.JLabel sifreDegistirIcon2;
    private javax.swing.JLabel sifreDegistirIcon3;
    private javax.swing.JLabel sifreDegistirIcon4;
    private javax.swing.JLabel sifreDegistirIcon5;
    private javax.swing.JLabel sifreDegistirIcon6;
    private javax.swing.JLabel sifreDegistirIcon7;
    private javax.swing.JTextField sifreText;
    private javax.swing.JTextField sifreText1;
    private javax.swing.JTextField sifreText2;
    private javax.swing.JTextField sifreText3;
    private javax.swing.JTextField sifreText4;
    private javax.swing.JTextField sifreText5;
    private javax.swing.JTextField sifreText6;
    private javax.swing.JTextField sifreText7;
    private javax.swing.JLabel telNoDegistirIcon;
    private javax.swing.JLabel telNoDegistirIcon1;
    private javax.swing.JLabel telNoDegistirIcon2;
    private javax.swing.JLabel telNoDegistirIcon3;
    private javax.swing.JLabel telNoDegistirIcon4;
    private javax.swing.JLabel telNoDegistirIcon5;
    private javax.swing.JLabel telNoDegistirIcon6;
    private javax.swing.JLabel telNoDegistirIcon7;
    private javax.swing.JTextField telNoText;
    private javax.swing.JTextField telNoText1;
    private javax.swing.JTextField telNoText2;
    private javax.swing.JTextField telNoText3;
    private javax.swing.JTextField telNoText4;
    private javax.swing.JTextField telNoText5;
    private javax.swing.JTextField telNoText6;
    private javax.swing.JTextField telNoText7;
    // End of variables declaration//GEN-END:variables

    

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.telNoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
       return HesapBilgileri.getInstance();
    }
      public TelNoYenileme getTelNoYenilemeObject() {
        if (this.telNoYenilemeObject == null) {
            telNoYenilemeObject = new TelNoYenileme();
        }
        return telNoYenilemeObject;
    }

}
