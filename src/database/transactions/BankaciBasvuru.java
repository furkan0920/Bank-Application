/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlari;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayakdas
 */
public class BankaciBasvuru  extends DbConnection implements IBilgiController {
//başvuru bilgileri
    private String adSoyad = null, tcNo = null, telNo = null;
    private String departman = null, maas = null;

    //sistem tarafından verilecek bilgiler
    private String musteriNo = null;
    private String sifre = null;

    public boolean basvuruOnaylandiMi() {
        if(this.bilgilerGecerliMi()) {
            if(this.tcNoTablodaVarMi()) {
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
    }
    
    private boolean tcNoTablodaVarMi() {
        String query = "SELECT tc_no FROM bankacilar WHERE tc_no = '" + this.tcNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true; //eğer tabloda veri bulunmuşsa true dönecek
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankaciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    private void basvuruyuOnayla() {
        String query = "INSERT INTO bankacilar(bankacigiris_no,sifre,"
                + "ad_soyad,tc_no,tel_no,bankaci_departman,bankaci_maas)"
                + " VALUES("
                + "'" + this.musteriNo + "',"
                + "'" + this.sifre + "',"
                + "'" + this.adSoyad + "',"
                + "'" + this.tcNo + "',"
                + "'" + this.telNo + "',"
                + "'" + this.departman + "',"
                + "'" + this.maas + "'"
                + ")";
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(BankaciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public boolean musteriNoTablodaVarMi() {
        String query = "SELECT bankacigiris_no FROM bankacilar WHERE bankacigiris_no = '" + this.musteriNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BankaciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
          return !(this.adSoyad == null
                || this.tcNo == null
                || this.telNo == null
                || this.departman == null
                || this.maas == null
                || this.musteriNo == null
                || this.sifre == null
                || TextAyarlari.uzunlukSundanKucukMu(11, this.tcNo)
                || TextAyarlari.uzunlukSundanKucukMu(11, this.telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }



    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }



    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

  

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}
