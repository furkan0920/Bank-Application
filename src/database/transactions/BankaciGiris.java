/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayakdas
 */
public class BankaciGiris extends DbConnection implements IBilgiController {

    private String musteriKimlik = null;
    private String sifre = null;

    public boolean girisBilgileriDogruMu() {
        if (bilgilerGecerliMi()) {
            if (girisBasariliMi()) {
                this.getHesapBilgileri().girisYap(musteriKimlik);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

   
   
  @Override
    public boolean bilgilerGecerliMi() {
          return !(this.musteriKimlik == null
                || this.sifre == null);
    }
    private boolean girisBasariliMi() {
        String query = "SELECT tc_no,bankacigiris_no ,sifre FROM bankacilar"
                + " WHERE "
                + "(tc_no = '" + this.musteriKimlik + "'"
                + " OR "
                + "bankacigiris_no = '" + this.musteriKimlik + "')"
                + " AND "
                + "sifre = '" + this.sifre + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    } 
  

    @Override
    public HesapBilgileri getHesapBilgileri() {
       return HesapBilgileri.getInstance();
    }
    
     public String getMusteriKimlik() {
        return musteriKimlik;
    }

    public void setMusteriKimlik(String musteriKimlik) {
        this.musteriKimlik = musteriKimlik;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
