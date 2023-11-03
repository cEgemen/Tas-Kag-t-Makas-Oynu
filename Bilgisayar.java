import java.util.ArrayList;

public class Bilgisayar extends Oyuncu{

    public Bilgisayar() {
    }

    public Bilgisayar(String oyuncuID, String oyuncuADi, int skor) {
        super(oyuncuID, oyuncuADi, skor);
    }
    
    @Override
    public  int SkoruGoster() {
    	return this.getSkor();
    }

    @Override
    public Nesne nesneSec(int deger, ArrayList<Nesne> nesne) {
        if(deger == 0 )
        {
            return nesne.get(deger);
        }
        else if(deger == 1)
        {
            return nesne.get(deger);
        }
        else if (deger == 2)
        {
            return nesne.get(deger);
        }
        else if(deger == 3)
        {
            return nesne.get(deger);
        }
        else 
        {
            return nesne.get(deger);
        }        
    }
    public void nesneSec()
    {
    	 int syc = 0, deger = 0;
         while (syc < 5) {
             deger = (int) (Math.random() * 3) + 1;
             if (deger == 1) {
                 Taş t1 = new Taş();
                 nesneListesi.add(t1);
             } else if (deger == 2) {
                 Kagıt k1 = new Kagıt();
                 nesneListesi.add(k1);
             } else {
                 Makas m1 = new Makas();
                 nesneListesi.add(m1);
             }
             System.out.println("random"+deger);
             syc++;
         }
        
    }
  
    }
