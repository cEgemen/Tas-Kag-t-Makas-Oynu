
public class OzelKagıt extends Kagıt{
    private final int kalınlık=2;

    public OzelKagıt() {
    }

    public OzelKagıt(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }
    public double etkiHesapla(int t) {
      	
    	if(t == 1)
    	{
    		
    		return (this.getNufuz()*this.kalınlık)/((0.2)*4);
    	}
    	else if(t==2)
    	{
    		return (this.getNufuz()*this.kalınlık)/((0.2)*2);
    	}
    	else if(t == 3)
    	{
    		return 1.5;
    		 	
    	}
    	else if(t == 4)
    	{
    		return 2.5;
    	}
    	else if( t == 5)
    	{
    		return (this.getNufuz()*this.kalınlık)/((0.8)*4);
    	}
    	else {
    		return (this.getNufuz()*this.kalınlık)/((0.8)*2);
    	}
    }
}