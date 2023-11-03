
public class Makas extends Nesne{
 
    private int keskinlik=2;

    public int getKeskinlik() {
		return keskinlik;
	}

	public void setKeskinlik(int keskinlik) {
		this.keskinlik = keskinlik;
	}

	public Makas() {
    }

    public Makas(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }
    
    @Override
    public String nesnePuaniGoter() {
                return "Dayaniklilik= "+this.getDayaniklilik()+" Seviye Puani= "+getSeviyePuani();

    }

    @Override
    public  double etkiHesapla(int t) {
    	if(t == 1)
    	{
    		
    		return (this.keskinlik)/((0.8)*4);
    	}
    	else if(t==2)
    	{
    		
    		return (this.keskinlik)/((0.8)*2);
    	}
    	else if(t == 3)
    	{
    	return  (this.keskinlik)/((0.2)*4);	
            	
    	}
    	else if(t == 4)
    	{
    		return (this.keskinlik)/((0.2)*2);
    	}
    	else if( t == 5)
    	{
    		return 1.5;
    	}
    	else {
    		return 1.5;
    	}
    }

    @Override
    public void durumGuncelle(double d) {
    	this.setDayaiklilik(this.getDayaniklilik()-d);
    }
    public void durumGuncelle(int s)
    {
  	  this.setSeviyePuani(this.getSeviyePuani()+s);
    }
    
}
