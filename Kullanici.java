import java.util.ArrayList;

public class Kullanici extends Oyuncu{

    public Kullanici() {
    }

    public Kullanici(String oyuncuID, String oyuncuADi, int skor) {
        super(oyuncuID, oyuncuADi, skor);
    }
     
    @Override
    public int SkoruGoster() {
         return this.getSkor();
    }

    @Override
    public Nesne nesneSec(int deger, ArrayList<Nesne> nesne) {
        
              if(deger==1)
              {
                  return nesne.get(0);
              }
              else if(deger == 2)
              {
                  return nesne.get(1);
              }
              else if(deger == 3)
              {
                  return nesne.get(2);
              }
              else if(deger == 4)
              {
                  return nesne.get(3);
              }
              else 
              {
                  return nesne.get(4);
              }
        }
        
    


}

