
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaYatirma;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;


public class BankaciParaYatirmaEkrani extends javax.swing.JFrame implements IDuzenleyici,IBilgiController {

    private ParaYatirma paraYatirmaObject = null;
    
    private int yatirilacakMiktar = 0;
    
    public BankaciParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        paraYatirmaEkraniPanel.setFocusable(true);
        TextAyarlari.setOnlyNumber(yatirilacakMiktarText);
        TextAyarlari.setMaxLimit(yatirilacakMiktarText, 5);
        this.kullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }

    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.yatirilacakMiktarText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaYatirma getParaYatirmaObject() {
        if(this.paraYatirmaObject == null) {
            paraYatirmaObject = new ParaYatirma();
        }
        return paraYatirmaObject;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paraYatirmaEkraniPanel = new javax.swing.JPanel();
        kullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        yatiracaginizMiktarLabel = new javax.swing.JLabel();
        yatirilacakMiktarText = new javax.swing.JTextField();
        paraYatirButton = new javax.swing.JButton();
        geriIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Para Yatırma Ekranı");

        paraYatirmaEkraniPanel.setBackground(new java.awt.Color(254, 245, 237));

        kullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        kullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(255, 0, 51));
        kullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kullaniciAdiSoyadiLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamBakiyenizLabel.setForeground(new java.awt.Color(82, 115, 77));
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz   :");

        bakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bakiyeLabel.setText("[BAKİYE]");

        yatiracaginizMiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yatiracaginizMiktarLabel.setForeground(new java.awt.Color(82, 115, 77));
        yatiracaginizMiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizMiktarLabel.setText("Yatıracağınız Miktar :");

        yatirilacakMiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatirilacakMiktarTextKeyReleased(evt);
            }
        });

        paraYatirButton.setBackground(new java.awt.Color(211, 228, 205));
        paraYatirButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paraYatirButton.setText("Para Yatır");
        paraYatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paraYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paraYatirButtonActionPerformed(evt);
            }
        });

        geriIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previousIcon.png"))); // NOI18N
        geriIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paraYatirmaEkraniPanelLayout = new javax.swing.GroupLayout(paraYatirmaEkraniPanel);
        paraYatirmaEkraniPanel.setLayout(paraYatirmaEkraniPanelLayout);
        paraYatirmaEkraniPanelLayout.setHorizontalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(geriIcon)
                        .addGap(18, 18, 18)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(yatirilacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        paraYatirmaEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {yatiracaginizMiktarLabel, yatirilacakMiktarText});

        paraYatirmaEkraniPanelLayout.setVerticalGroup(
            paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(kullaniciAdiSoyadiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paraYatirmaEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(geriIcon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamBakiyenizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bakiyeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paraYatirmaEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yatiracaginizMiktarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yatirilacakMiktarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(paraYatirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        paraYatirmaEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {yatiracaginizMiktarLabel, yatirilacakMiktarText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paraYatirmaEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatirilacakMiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatirilacakMiktarTextKeyReleased
        this.yatirilacakMiktar = TextAyarlari.checkTheTextKeyReleased(yatirilacakMiktarText, 400000000);
    }//GEN-LAST:event_yatirilacakMiktarTextKeyReleased

    private void paraYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paraYatirButtonActionPerformed
        if(this.bilgilerGecerliMi()) {
            this.paraYatir();
        } else {
            Dialogs.bosOlamazMesajiGoster(this);
        }
    }//GEN-LAST:event_paraYatirButtonActionPerformed

    private void paraYatir() {
        this.getParaYatirmaObject().setYatirilacakMiktar(this.yatirilacakMiktar);
        
        if(getParaYatirmaObject().paraYatirildiMi()) {
            Dialogs.ozelMesajGoster(this, "Para başarıyla hesabınıza tanımlanmıştır.\n"
                    + "Yatırılan miktar:" + this.yatirilacakMiktar + " TL");
            ActionAyarlari.setVisible(this, new BankaciKullaniciHesap());
        } else {
            Dialogs.ozelMesajGoster(this, "Bilgilerinizi kontrol edin!");
        }
    }
    
    private void geriIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriIconMouseClicked
        ActionAyarlari.setVisible(this, new BankaciKullaniciHesap());
    }//GEN-LAST:event_geriIconMouseClicked

 
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
            java.util.logging.Logger.getLogger(BankaciParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankaciParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankaciParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankaciParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankaciParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JLabel geriIcon;
    private javax.swing.JLabel kullaniciAdiSoyadiLabel;
    private javax.swing.JButton paraYatirButton;
    private javax.swing.JPanel paraYatirmaEkraniPanel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    private javax.swing.JLabel yatiracaginizMiktarLabel;
    private javax.swing.JTextField yatirilacakMiktarText;
    // End of variables declaration//GEN-END:variables
}
