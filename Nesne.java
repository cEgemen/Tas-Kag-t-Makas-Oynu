
public abstract class Nesne {
   private  double dayaniklilik;
    private int seviyePuani;

    public Nesne() {
        this.dayaniklilik=20;
        this.seviyePuani=0;
    }

    public Nesne(double dayaniklilik, int seviyePuani) {
        this.dayaniklilik = dayaniklilik;
        this.seviyePuani = seviyePuani;
    }
    public double getDayaniklilik()
    {
        return dayaniklilik;
    }
    public void setDayaiklilik(double dayaniklilik)
    {
        this.dayaniklilik=dayaniklilik;
    }
    public int getSeviyePuani()
    {
        return seviyePuani;
    }
    public void setSeviyePuani(int seviyePuani)
    {
        this.seviyePuani=seviyePuani;
    }
    public abstract String nesnePuaniGoter();
    public abstract double etkiHesapla(int t);
    public abstract void durumGuncelle(double d);
}

