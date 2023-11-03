
public class UstaMakas extends Makas{
    private int hız=2;

    public UstaMakas() {
    }

    public UstaMakas(double dayaniklilik, int seviyePuani) {
        super(dayaniklilik, seviyePuani);
    }
    public  double etkiHesapla(int t) {
    	if(t == 1)
    	{
    		
    		return (this.getKeskinlik()*this.hız)/((0.8)*4);
    	}
    	else if(t==2)
    	{
    		
    		return (this.getKeskinlik()*this.hız)/((0.8)*2);
    	}
    	else if(t == 3)
    	{
    	return  (this.getKeskinlik()*this.hız)/((0.2)*4);	
            	
    	}
    	else if(t == 4)
    	{
    		return (this.getKeskinlik()*this.hız)/((0.2)*2);
    	}
    	else if( t == 5)
    	{
    		return 1.5;
    	}
    	else {
    		return 2.5;
    	}
    }
}
