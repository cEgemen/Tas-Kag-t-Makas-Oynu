
public class Taş extends Nesne{
     private  int katılık=2;
    public Taş() {
        super();
    }

    public Taş(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }
    

    @Override
    public String nesnePuaniGoter() {
                return "Dayaniklilik= "+this.getDayaniklilik()+" Seviye Puani= "+getSeviyePuani();

      
    }

	public int getKatılık() {
		return katılık;
	}

	public void setKatılık(int katılık) {
		this.katılık = katılık;
	}

	@Override
    public double etkiHesapla(int t) {
    	if(t == 1)
    	{
    		return 1.5;
    	}
    	else if(t==2)
    	{
    		return 1.5;
    	}
    	else if(t == 3)
    	{
    	return  (this.katılık)/((0.8)*4);	
            	
    	}
    	else if(t == 4)
    	{
    		return (this.katılık)/((0.8)*2);
    	}
    	else if( t == 5)
    	{
    		return (this.katılık)/((0.2)*4);
    	}
    	else {
    		return (this.katılık)/((0.2)*2);
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

