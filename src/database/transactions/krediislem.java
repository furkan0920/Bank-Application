
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class krediislem extends DbConnection implements IBilgiController{

    private String krediDurum=null;
    private int krediFiyat=0;

  
    public boolean paraYatirildiMi() {
        if(bilgilerGecerliMi()) {
            String query = "UPDATE kullanici_bakiye "
                    + "SET krediucret = '" + this.krediFiyat + "'"
                    
                  
                    + " WHERE kullanici_id = '" + getHesapBilgileri().getKullaniciId() + "'";
            try {
                super.statement = super.connection.createStatement();
                statement.executeUpdate(query);
            } catch (SQLException ex) {
                Logger.getLogger(krediislem.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            return false;
        }
    }

    public String getKrediDurum() {
        return krediDurum;
    }

    public void setKrediDurum(String krediDurum) {
        this.krediDurum = krediDurum;
    }
    
    @Override
    public boolean bilgilerGecerliMi() {
        return !(this.krediFiyat == 0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

      public int getKrediFiyat() {
        return krediFiyat;
    }

    public void setKrediFiyat(int krediFiyat) {
        this.krediFiyat = krediFiyat;
    }
    
    
}
