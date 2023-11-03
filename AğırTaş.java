
public class AğırTaş extends Taş{
   private  int sıcaklık=2;

    public AğırTaş() {
        super();
    }

    public AğırTaş( double dayaniklilik, int seviyePuani) {
        super( dayaniklilik, seviyePuani);
    }
    public double etkiHesapla(int t) {
    	if(t == 1)
    	{
    		return 1.5;
    	}
    	else if(t==2)
    	{
    		return 2.5;
    	}
    	else if(t == 3)
    	{
    	return  (this.getKatılık()*this.sıcaklık)/((0.8)*4);	
            	
    	}
    	else if(t == 4)
    	{
    		return (this.getKatılık()*this.sıcaklık)/((0.8)*2);
    	}
    	else if( t == 5)
    	{
    		return (this.getKatılık()*this.sıcaklık)/((0.2)*4);
    	}
    	else {
    		return (this.getKatılık()*this.sıcaklık)/((0.2)*2);
    	}
	
    }
  
    
}

