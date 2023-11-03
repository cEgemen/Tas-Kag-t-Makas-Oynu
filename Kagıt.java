
public class Kagıt extends Nesne{
 private  int nufuz=2;
    public int getNufuz() {
	return nufuz;
}

public void setNufuz(int nufuz) {
	this.nufuz = nufuz;
}

	public Kagıt() {
        
    }

    public Kagıt(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }
     
    
    @Override
    public String nesnePuaniGoter() {
        
        return "Dayaniklilik= "+this.getDayaniklilik()+" Seviye Puani= "+getSeviyePuani();
    }

    @Override
    public double etkiHesapla(int t) {
  	
    	if(t == 1)
    	{
    		
    		return (this.nufuz)/((0.2)*4);
    	}
    	else if(t==2)
    	{
    		return (this.nufuz)/((0.2)*2);
    	}
    	else if(t == 3)
    	{
    		return 1.5;
    		 	
    	}
    	else if(t == 4)
    	{
    		return 1.5;
    	}
    	else if( t == 5)
    	{
    		return (this.nufuz)/((0.8)*4);
    	}
    	else {
    		return (this.nufuz)/((0.8)*2);
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

