import java.util.ArrayList;

public abstract class Oyuncu {
 private String oyuncuID;
 private String oyuncuADi;
 private int skor;
public ArrayList<Nesne> nesneListesi = new ArrayList<Nesne>();
    public Oyuncu() {
        oyuncuID=null;
        oyuncuADi=null;
        skor=0;
    }

   

    public Oyuncu(String oyuncuID, String oyuncuADi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuADi = oyuncuADi;
        this.skor = skor;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

  

    public String getOyuncuADi() {
        return oyuncuADi;
    }

    public void setOyuncuADi(String oyuncuADi) {
        this.oyuncuADi = oyuncuADi;
    }
public int getSkor()
{
	return this.skor;
}

    public void setSkor(int skor) {
        this.skor = skor;
    }
  public abstract int SkoruGoster();
  public abstract Nesne nesneSec(int deger,ArrayList<Nesne> nesne);  
}
