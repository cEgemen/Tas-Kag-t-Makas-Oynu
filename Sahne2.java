import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Sahne2 extends JFrame {

    protected static final int INFORMATION_MESSAGE = 0;
	private boolean oyun = false;
    private boolean secim = true;
    private boolean hamle=false;
    private boolean kartSecim = false;
    private String isim = null;
    private String ID = null;
    private Kullanici oyuncu1 = new Kullanici();
    private Bilgisayar oyuncu2 = new Bilgisayar("74521","Abra A5",0);
  private  JButton b6 = new JButton("NULL");
  private  JLabel l3 = new JLabel("------------------------");
  private  JButton b7 = new JButton("NULL");
  private  JLabel l4 = new JLabel("--------------------");
  private  JButton b8 = new JButton("Null");
  private  JLabel l5 = new JLabel("-----------------------");
  private  JButton b9 = new JButton("NUll");
  private  JLabel l6 = new JLabel("----------------------");
  private  JButton b10 = new JButton("NULL");
  private  JLabel l7 = new JLabel("-----------------------");
  private  JLabel l8 = new JLabel();
  private  JLabel l9 = new JLabel();
  private JLabel l10 = new JLabel();
  private JLabel l11 = new JLabel();
  private JPanel p1 = new JPanel();
  private int syc=0,syc2=0,syc3=0,syc4=0,syc5=5,syc6=0,syc7=5,syc8=5;
  private boolean durum1=true;
  private boolean durum2=true;
  private boolean durum3=true;
  private boolean durum4=true;
  private boolean durum5=true;
  private int  hamleSayısı=-1;
private ArrayList<Integer> temp =new ArrayList<Integer>();
    public Sahne2() throws HeadlessException {

        setSize(800, 800);
        setVisible(true);
        setLayout(new BorderLayout());
        p1.setBackground(Color.pink);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.LIGHT_GRAY);
        JLabel l1 = new JLabel("Nesne secme ---> ");
        JButton b1 = new JButton("Kagıt");
        Image img3 = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
        b1.setIcon(new ImageIcon(img3));
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kartSecim == true ) {
                    if (oyuncu1.nesneListesi.size() < 5) {
                        Kagıt k1 = new Kagıt();
                        oyuncu1.nesneListesi.add(k1);
                        int x=oyuncu1.nesneListesi.size();
                        ekle(x);
                        System.out.println("size" + oyuncu1.nesneListesi.size());
                    }  if (oyuncu1.nesneListesi.size() == 5) {
                        kartSecim = false;
                        secim = false;
                    }
                }

            }

        });
        JButton b2 = new JButton("Makas");
        Image img2 =new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
        b2.setIcon(new ImageIcon(img2));
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (kartSecim == true ) {
                    if (oyuncu1.nesneListesi.size() < 5) {
                        Makas m1 = new Makas();
                        oyuncu1.nesneListesi.add(m1);
                        int x=oyuncu1.nesneListesi.size();
                        ekle(x);
                        System.out.println("size" + oyuncu1.nesneListesi.size());
                    } 
                     if (oyuncu1.nesneListesi.size() == 5) {
                        kartSecim = false;
                        secim = false;
                    }
                }

            }

        });
        JButton b3 = new JButton("Tas");
        Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
        b3.setIcon(new ImageIcon(img));
        b3.addActionListener(new ActionListener() {
            @Override
     public void actionPerformed(ActionEvent e) {
     if (kartSecim == true ) {
     if (oyuncu1.nesneListesi.size() < 5) {
     Taş t1 = new Taş();
     oyuncu1.nesneListesi.add(t1);
     int x=oyuncu1.nesneListesi.size();
     ekle(x);      
     System.out.println("size" + oyuncu1.nesneListesi.size());
     } if (oyuncu1.nesneListesi.size() == 5) {
     kartSecim = false;
       secim = false;
                    }
                }
            }
        });
     JLabel l12 = new JLabel("Hamle sayısı: -----");
     JLabel l13 = new JLabel();
     Image q= new ImageIcon(this.getClass().getResource("/oyuncu.png")).getImage();
     l13.setIcon(new ImageIcon(q));
     JLabel l14 = new JLabel();
     l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
     JLabel l15 = new JLabel();
     Image q2 = new ImageIcon(this.getClass().getResource("/bilgisayar.png")).getImage();
     l15.setIcon(new ImageIcon(q2));
     JLabel l16 = new JLabel(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
     b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {   
                if(hamle == true){
                int i=1;
                int j=0;
                  if(syc%syc7==0 && syc3<hamleSayısı)
                {
                    durum1=true;
                    durum2=true;
                    durum3=true;
                    durum4=true;
                    durum5=true;
                    syc=0;
                }
                
                if(durum1 == true)
                {
                      
                  Nesne o = oyuncu1.nesneSec(i,oyuncu1.nesneListesi);
                   int s = secenek(o);
                   System.out.println("s="+s);
                   int s2 = random();
                   System.out.println("temp="+s2);
                   Nesne o2 = oyuncu2.nesneSec(s2,oyuncu2.nesneListesi);
                   int s3 = secenek(o2);
                   System.out.println("s3="+s3);
                   double etki1= oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s);
                   oyuncu1.nesneSec(i,oyuncu1.nesneListesi).durumGuncelle(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                   oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).durumGuncelle(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                   l3.setText(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).nesnePuaniGoter());
                  duzenle2(s);
                   l11.setText("Dayaniklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+" Karşı Hasar:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                   duzenle(s3);
                   l9.setText("Dayaniklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+" Karsı Hasar:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()>0 && oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0)
                {
                	oyuncu1.setSkor(oyuncu1.getSkor()+1);
                	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                	oyuncu1.nesneSec(i,oyuncu1.nesneListesi).setSeviyePuani(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()+20);
                	System.out.println("oyuncu1..dayanklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani());
                   	if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()>=30)
                   	{
                   		int x=secenek(oyuncu1.nesneSec(i,oyuncu1.nesneListesi));
                   		System.out.println("eski kartın secenegi="+x);
                   		if(x==2)
                   		{
                   			System.out.println("yükseldi");  			
                   			AğırTaş a =new AğırTaş(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);	
                   			oyuncu1.nesneListesi.set(i-1,a);
                   		 String x1=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                   		b6.setText("Agır Taş");
                   	 l3.setText(x1);
                   	 Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                   	 b6.setIcon(new ImageIcon(ix));
                   			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                   			System.out.println("yeni kartın secenegi="+b);
                   		}
                   		else if(x==4)
                   		{
                   			System.out.println("yükseldi");
                   			OzelKagıt a =new OzelKagıt(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                   			oyuncu1.nesneListesi.set(i-1,a);
                   			String x1=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                   		 b6.setText("Ozel Kagıt");
                  	   l3.setText(x1);
                  	   Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                  	   b6.setIcon(new ImageIcon(ix));
                   			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                   			System.out.println("yeni kartın secenegi="+b);
                   		}
                   		
                   		else if(x==6)
                   		{
                   			System.out.println("yükseldi");
                   			UstaMakas a =new UstaMakas(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                   			oyuncu1.nesneListesi.set(i-1,a);
                   			String x1=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                   		   b6.setText("Usta Makas");
                    	   l3.setText(x1);
                    	   Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                    	   b6.setIcon(new ImageIcon(ix));
                   			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                   			System.out.println("yeni kartın secenegi="+b);
                   		}
                   	}
                   	oyuncu2.nesneListesi.remove(s2);
                   	syc5--;
                   	syc8--;
                   	int  say =0,v=temp.size();
                 	 for(;say<v;say++)
                 	 {
                 		 System.out.println("temp"+temp.get(v-say-1));
                 		 temp.remove(v-say-1);
                 	 }
                 	 syc4=0;
                   
                }
                else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()>0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                {
                	oyuncu2.setSkor(oyuncu2.getSkor()+1);
                	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                	oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).setSeviyePuani(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()+20);
                	System.out.println("oyuncu2..dayanklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani());
                	if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()>=30)
                   	{
                   		int x=secenek(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi));
                   		System.out.println("eski kartın secenegi="+x);
                   		if(x==2)
                   		{
                   			AğırTaş a =new AğırTaş(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                   			oyuncu2.nesneListesi.set(s2,a);
                   			int b=secenek(oyuncu1.nesneListesi.get(s2));
                   			System.out.println("yeni kartın secenegi="+b);
                   		}
                   		else if(x==4)
                   		{
                   			OzelKagıt a =new OzelKagıt(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                   			oyuncu2.nesneListesi.set(s2,a);
                   			int b=secenek(oyuncu2.nesneListesi.get(s2));
                   			System.out.println("yeni kartın secenegi="+b);
                   		}
                   		else if(x==6)
                   		{
                   			UstaMakas a =new UstaMakas(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                   			oyuncu2.nesneListesi.set(s2,a);
                   			int b=secenek(oyuncu2.nesneListesi.get(s2));
                   			System.out.println("yeni kartın secenegi="+b);
                   		}
                   	}
                	syc6++;
           			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
           			b6.setIcon(new ImageIcon(img));
           			b6.setText(" ");
           		 l3.setText("Dayaniklilik bitti");
           		 syc--;
           		 syc7--;
                   	b6.setEnabled(false);
                }
              
                else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                {
                	System.out.println("ikiside bitti");
                	syc6++;
                	oyuncu1.setSkor(oyuncu1.getSkor()+1);
               	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
               	oyuncu2.setSkor(oyuncu2.getSkor()+1);
            	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
           			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
           			b6.setIcon(new ImageIcon(img));
           			b6.setText(" ");
           		 l3.setText("Dayaniklilik bitti");
                   	b6.setEnabled(false);
                   	syc--;
                   	syc7--;
                	oyuncu2.nesneListesi.remove(s2);
                	syc8--;	
                   	syc5--;
                   	int  say =0,v=temp.size();
                 	 for(;say<v;say++)
                 	 {
                 		 System.out.println("temp"+temp.get(v-say-1));
                 		 temp.remove(v-say-1);
                 	 }
                 	 syc4=0;
                }
                
                   if(syc6==5 || syc5==0)
                   {
                	   if(syc6==5)
                	   {
                	   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
           			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu2.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                	   }
                	   else if(syc5==0)
                	   {
                		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
               			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu1.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                	   }
                	   else
                	   {
                		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
               			JOptionPane.showMessageDialog(p1,"Berabere","Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                	   }
                   }
                     durum1 = false;
                   syc++;
                   syc3++;
                   l12.setText("Hamle sayısı: "+ syc3);
                }
                if (syc3>=hamleSayısı)
                {
                	durum1=false;
                    durum2=false;
                    durum3=false;
                    durum4=false;
                    durum5=false;
                    end(oyuncu1.nesneListesi,oyuncu2.nesneListesi);
                    
                }
                 
               
                }
                
            }
            
        });
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 if(hamle == true){
               int i=2;
                if(syc%syc7==0 && syc3<hamleSayısı)
                {
                	durum1=true;
                    durum2=true;
                    durum3=true;
                    durum4=true;
                    durum5=true;
                    syc=0;
                }
                if(durum2 == true)
                {
                     
                     Nesne o = oyuncu1.nesneSec(i,oyuncu1.nesneListesi);
                     int s = secenek(o);
                     System.out.println("s="+s);
                     int s2 = random();
                     System.out.println("temp="+s2);
                     Nesne o2 = oyuncu2.nesneSec(s2,oyuncu2.nesneListesi);
                     int s3 = secenek(o2);
                     System.out.println("s3="+s3);
                     double etki1= oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s);
                     oyuncu1.nesneSec(i,oyuncu1.nesneListesi).durumGuncelle(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).durumGuncelle(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                    System.out.println();
                     l4.setText(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).nesnePuaniGoter());
                     duzenle2(s);
                     l11.setText("Dayaniklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+" Karşı Hasar:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                     duzenle(s3);
                     l9.setText("Dayaniklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+" Karsı Hasar:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()>0 && oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu1.setSkor(oyuncu1.getSkor()+1);
                    	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                     	oyuncu1.nesneSec(i,oyuncu1.nesneListesi).setSeviyePuani(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu1..dayanklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani());
                        	if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu1.nesneSec(i,oyuncu1.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x2=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			 b7.setText("Agır Taş");
                        			    l4.setText(x2);
                        			    Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                        			    b7.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x2=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			b7.setText("Ozel Kagıt");
                        	       	   l4.setText(x2);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                        	       	   b7.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x2=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			b7.setText("Usta Makas");
                        	       	   l4.setText(x2);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                        	       	   b7.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                        	oyuncu2.nesneListesi.remove(s2);
                        	syc8--;
                           
                        	syc5--;
                        	int  say =0,v=temp.size();
                         	 for(;say<v;say++)
                         	 {
                         		 System.out.println("temp"+temp.get(v-say-1));
                         		 temp.remove(v-say-1);
                         	 }
                         	 syc4=0;
                     }
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()>0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu2.setSkor(oyuncu2.getSkor()+1);
                     	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                     	oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).setSeviyePuani(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu2..dayanklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani());
                     	if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu1.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                     	syc6++;
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b7.setIcon(new ImageIcon(img));
                			b7.setText(" ");
                		 l4.setText("Dayaniklilik bitti");
                		 syc--;
                		 syc7--;
                        	b7.setEnabled(false);
                     }
                   
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                     	System.out.println("ikiside bitti");

                     	syc6++;
                    	oyuncu1.setSkor(oyuncu1.getSkor()+1);
                      	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                      	oyuncu2.setSkor(oyuncu2.getSkor()+1);
                   	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b7.setIcon(new ImageIcon(img));
                			b7.setText(" ");
                		 l4.setText("Dayaniklilik bitti");
                        	b7.setEnabled(false);
                        	syc--;
                        	syc7--;
                     	oyuncu2.nesneListesi.remove(s2);
                     	syc8--;
                        syc5--;
                        int  say =0,v=temp.size();
                     	 for(;say<v;say++)
                     	 {
                     		 System.out.println("temp"+temp.get(v-say-1));
                     		 temp.remove(v-say-1);
                     	 }
                     	 syc4=0;
                     }
                     if(syc6==5 || syc5==0)
                     {
                  	   if(syc6==5)
                  	   {
                  	   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
             			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu2.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else if(syc5==0)
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu1.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Berabere","Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                     }
                     durum2 = false;
                    syc++;
                   syc3++;
                   l12.setText("Hamle sayısı: "+ syc3);
                }
                if (syc3>=hamleSayısı)
                {
                	durum1=false;
                    durum2=false;
                    durum3=false;
                    durum4=false;
                    durum5=false;
                    end(oyuncu1.nesneListesi,oyuncu2.nesneListesi);
                }
                    
                    
              
                }
                
            }
            
        });
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                  if(hamle == true){
             int i=3;
             if(syc%syc7==0 && syc3<hamleSayısı)
                {
            	 durum1=true;
                 durum2=true;
                 durum3=true;
                 durum4=true;
                 durum5=true;
                 syc=0;
                }
                if(durum3 == true)
                {
                      
                     Nesne o = oyuncu1.nesneSec(i,oyuncu1.nesneListesi);
                     int s = secenek(o);
                     System.out.println("s="+s);
                     int s2 = random();
                     System.out.println("temp="+s2);
                     Nesne o2 = oyuncu2.nesneSec(s2,oyuncu2.nesneListesi);
                     int s3 = secenek(o2);
                     System.out.println("s3="+s3);
                     double etki1= oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s);
                     oyuncu1.nesneSec(i,oyuncu1.nesneListesi).durumGuncelle(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).durumGuncelle(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                    System.out.println();
                     l5.setText(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).nesnePuaniGoter());
                     duzenle2(s);
                     l11.setText("Dayaniklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+" Karşı Hasar:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                     duzenle(s3);
                     l9.setText("Dayaniklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+" Karsı Hasar:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()>0 && oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu1.setSkor(oyuncu1.getSkor()+1);
                    	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                     	oyuncu1.nesneSec(i,oyuncu1.nesneListesi).setSeviyePuani(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu1..dayanklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani());
                        	if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu1.nesneSec(i,oyuncu1.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x3=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			 b8.setText("Agır Taş");
                        			    l5.setText(x3);
                        			    Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                        			    b8.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x3=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			 b8.setText("Ozel Kagıt");
                        	       	   l5.setText(x3);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                        	       	   b8.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x3=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			b8.setText("Usta Makas");
                        	       	   l5.setText(x3);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                        	       	   b8.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                        	oyuncu2.nesneListesi.remove(s2);
                        	syc8--;
                        	syc5--;
                        	int  say =0,v=temp.size();
                         	 for(;say<v;say++)
                         	 {
                         		 System.out.println("temp"+temp.get(v-say-1));
                         		 temp.remove(v-say-1);
                         	 }
                         	 syc4=0;
                     }
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()>0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu2.setSkor(oyuncu2.getSkor()+1);
                     	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                     	oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).setSeviyePuani(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu2..dayanklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani());
                     	if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu1.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                     	syc6++;
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b8.setIcon(new ImageIcon(img));
                			b8.setText(" ");
                		 l5.setText("Dayaniklilik bitti");
                		 syc--;
                		 syc7--;
                        	b8.setEnabled(false);
                     }
                   
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                     	System.out.println("ikiside bitti");

                     	syc6++;
                    	oyuncu1.setSkor(oyuncu1.getSkor()+1);
                      	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                      	oyuncu2.setSkor(oyuncu2.getSkor()+1);
                   	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b8.setIcon(new ImageIcon(img));
                			b8.setText(" ");
                		 l5.setText("Dayaniklilik bitti");
                        	b8.setEnabled(false);
                        	syc--;
                        	syc7--;
                     	oyuncu2.nesneListesi.remove(s2);
                     	syc8--;
                        syc5--;
                        int  say =0,v=temp.size();
                     	 for(;say<v;say++)
                     	 {
                     		 System.out.println("temp"+temp.get(v-say-1));
                     		 temp.remove(v-say-1);
                     	 }
                     	 syc4=0;
                     }
                     if(syc6==5 || syc5==0)
                     {
                  	   if(syc6==5)
                  	   {
                  	   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
             			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu2.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else if(syc5==0)
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu1.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Berabere","Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                     }
                     durum3 = false;
                     syc++;
                   syc3++;
                   l12.setText("Hamle sayısı: "+ syc3);
                }
                if (syc3>=hamleSayısı)
                {
                	durum1=false;
                    durum2=false;
                    durum3=false;
                    durum4=false;
                    durum5=false;
                    end(oyuncu1.nesneListesi,oyuncu2.nesneListesi);
                }
                    
                      
              
                
                }
                
            }
            
        });
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(hamle == true){
              int i=4;
               if(syc%syc7==0 && syc3<hamleSayısı)
                {
            	   durum1=true;
                   durum2=true;
                   durum3=true;
                   durum4=true;
                   durum5=true;
                   syc=0;
                }
                
                if(durum4 == true)
                {
                       
                     Nesne o = oyuncu1.nesneSec(i,oyuncu1.nesneListesi);
                     int s = secenek(o);
                     System.out.println("s="+s);
                     int s2 = random();
                     System.out.println("temp="+s2);
                     Nesne o2 = oyuncu2.nesneSec(s2,oyuncu2.nesneListesi);
                     int s3 = secenek(o2);
                     System.out.println("s3="+s3);
                     double etki1= oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s);
                     oyuncu1.nesneSec(i,oyuncu1.nesneListesi).durumGuncelle(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).durumGuncelle(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                    System.out.println();
                     l6.setText(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).nesnePuaniGoter());
                     duzenle2(s);
                     l11.setText("Dayaniklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+" Karşı Hasar:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                     duzenle(s3);
                     l9.setText("Dayaniklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+" Karsı Hasar:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()>0 && oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu1.setSkor(oyuncu1.getSkor()+1);
                    	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                     	oyuncu1.nesneSec(i,oyuncu1.nesneListesi).setSeviyePuani(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu1..dayanklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani());
                        	if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu1.nesneSec(i,oyuncu1.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			
                        			AğırTaş a =new AğırTaş(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x4=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			 b9.setText("Agır Taş");
                        			    l6.setText(x4);
                        			    Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                        			    b9.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x4=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			b9.setText("Ozel Kagıt");
                        	       	   l6.setText(x4);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                        	       	   b9.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x4=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			b9.setText("Usta Makas");
                        	       	   l6.setText(x4);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                        	       	   b9.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                        	oyuncu2.nesneListesi.remove(s2);
                        	syc8--;                       
                        	syc5--;
                        	int  say =0,v=temp.size();
                         	 for(;say<v;say++)
                         	 {
                         		 System.out.println("temp"+temp.get(v-say-1));
                         		 temp.remove(v-say-1);
                         	 }
                         	 syc4=0;
                     }
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()>0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu2.setSkor(oyuncu2.getSkor()+1);
                     	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                     	oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).setSeviyePuani(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu2..dayanklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani());
                     	if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu1.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                     	syc6++;
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b9.setIcon(new ImageIcon(img));
                			b9.setText(" ");
                		 l6.setText("Dayaniklilik bitti");
                		 syc--;
                		 syc7--;
                        	b9.setEnabled(false);
                     }
                   
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                     	System.out.println("ikiside bitti");

                     	syc6++;
                    	oyuncu1.setSkor(oyuncu1.getSkor()+1);
                      	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                      	oyuncu2.setSkor(oyuncu2.getSkor()+1);
                   	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b9.setIcon(new ImageIcon(img));
                			b9.setText(" ");
                		 l6.setText("Dayaniklilik bitti");
                        	b9.setEnabled(false);
                        	syc--;
                        	syc7--;
                     	oyuncu2.nesneListesi.remove(s2);
                     	syc8--;
                     
                        	syc5--;
                        	int  say =0,v=temp.size();
                         	 for(;say<v;say++)
                         	 {
                         		 System.out.println("temp"+temp.get(v-say-1));
                         		 temp.remove(v-say-1);
                         	 }
                         	 syc4=0;
                     }
                     if(syc6==5 || syc5==0)
                     {
                  	   if(syc6==5)
                  	   {
                  	   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
             			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu2.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else if(syc5==0)
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu1.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Berabere","Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                     }
                     durum4 = false;
                     syc3++;
                   syc++;
                   l12.setText("Hamle sayısı: "+ syc3);
                }
                if (syc3>=hamleSayısı)
                {
                	durum1=false;
                    durum2=false;
                    durum3=false;
                    durum4=false;
                    durum5=false;
                    end(oyuncu1.nesneListesi,oyuncu2.nesneListesi);
                }
                
                 
              
                }
                
            }
            
        });
        b10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 if(hamle == true){
              int i=5;
              if(syc%syc7==0 && syc3<hamleSayısı)
                {
            	  durum1=true;
                  durum2=true;
                  durum3=true;
                  durum4=true;
                  durum5=true;
                  syc=0;
                }
                
                if(durum5 == true)
                {
                    
                     Nesne o = oyuncu1.nesneSec(i,oyuncu1.nesneListesi);
                     int s = secenek(o);
                     System.out.println("s="+s);
                     int s2 =random();
                     System.out.println("temp="+s2);
                     Nesne o2 = oyuncu2.nesneSec(s2,oyuncu2.nesneListesi);
                     int s3 = secenek(o2);
                     System.out.println("s3="+s3);
                     double etki1= oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s);
                     oyuncu1.nesneSec(i,oyuncu1.nesneListesi).durumGuncelle(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).durumGuncelle(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                    System.out.println();
                     l7.setText(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).nesnePuaniGoter());
                     duzenle2(s);
                     l11.setText("Dayaniklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+" Karşı Hasar:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).etkiHesapla(s3));
                     duzenle(s3);
                     l9.setText("Dayaniklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+" Karsı Hasar:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).etkiHesapla(s));
                     if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()>0 && oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu1.setSkor(oyuncu1.getSkor()+1);
                    	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                     	oyuncu1.nesneSec(i,oyuncu1.nesneListesi).setSeviyePuani(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu1..dayanklilik:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani());
                        	if(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu1.nesneSec(i,oyuncu1.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x5=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			 b10.setText("Agır Taş");
                        			    l7.setText(x5);
                        			    Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                        			    b10.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x5=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			b10.setText("Ozel Kagıt");
                        	       	   l7.setText(x5);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                        	       	   b10.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik(),0);
                        			oyuncu1.nesneListesi.set(i-1,a);
                        			String x5=oyuncu1.nesneListesi.get(i-1).nesnePuaniGoter();
                        			 b10.setText("Usta Makas");
                        	       	   l7.setText(x5);
                        	       	   Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                        	       	   b10.setIcon(new ImageIcon(ix));
                        			int b=secenek(oyuncu1.nesneListesi.get(i-1));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                        	oyuncu2.nesneListesi.remove(s2);
                        	syc8--;           
                        	syc5--;
                        	int  say =0,v=temp.size();
                         	 for(;say<v;say++)
                         	 {
                         		 System.out.println("temp"+temp.get(v-say-1));
                         		 temp.remove(v-say-1);
                         	 }
                         	 syc4=0;
                     }
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()>0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                    	 oyuncu2.setSkor(oyuncu2.getSkor()+1);
                     	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                     	oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).setSeviyePuani(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()+20);
                     	System.out.println("oyuncu2..dayanklilik:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()+"seviyepuanı:"+oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani());
                     	if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getSeviyePuani()>=30)
                        	{
                        		int x=secenek(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi));
                        		System.out.println("eski kartın secenegi="+x);
                        		if(x==2)
                        		{
                        			AğırTaş a =new AğırTaş(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu1.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==4)
                        		{
                        			OzelKagıt a =new OzelKagıt(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        		else if(x==6)
                        		{
                        			UstaMakas a =new UstaMakas(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik(),0);
                        			oyuncu2.nesneListesi.set(s2,a);
                        			int b=secenek(oyuncu2.nesneListesi.get(s2));
                        			System.out.println("yeni kartın secenegi="+b);
                        		}
                        	}
                     	syc6++;
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b10.setIcon(new ImageIcon(img));
                			b10.setText(" ");
                		 l7.setText("Dayaniklilik bitti");
                		 syc--;
                		 syc7--;
                        	b10.setEnabled(false);
                     }
                   
                     else if(oyuncu2.nesneSec(s2,oyuncu2.nesneListesi).getDayaniklilik()<=0 && oyuncu1.nesneSec(i,oyuncu1.nesneListesi).getDayaniklilik()<=0)
                     {
                     	System.out.println("ikiside bitti");

                    	 oyuncu2.setSkor(oyuncu2.getSkor()+1);
                      	l16.setText(oyuncu2.getOyuncuADi()+"-->skor: "+oyuncu2.SkoruGoster());
                      	oyuncu1.setSkor(oyuncu1.getSkor()+1);
                   	 l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                     	syc6++;
                			Image img=new ImageIcon(this.getClass().getResource("/bitis.png")).getImage();
                			b10.setIcon(new ImageIcon(img));
                			b10.setText(" ");
                		 l7.setText("Dayaniklilik bitti");
                        	b10.setEnabled(false);
                        	syc--;
                        	syc7--;
                     	oyuncu2.nesneListesi.remove(s2);
                     	syc8--;
                      
                        	syc5--;
                        	int  say =0,v=temp.size();
                         	 for(;say<v;say++)
                         	 {
                         		 System.out.println("temp"+temp.get(v-say-1));
                         		 temp.remove(v-say-1);
                         	 }
                         	 syc4=0;
                     }
                     if(syc6==5 || syc5==0)
                     {
                  	   if(syc6==5)
                  	   {
                  	   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
             			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu2.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else if(syc5==0)
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+oyuncu1.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                  	   else
                  	   {
                  		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
                 			JOptionPane.showMessageDialog(p1,"Berabere","Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
                  	   }
                     }
                     durum5 = false;
                     syc3++;
                   syc++;
                   l12.setText("Hamle sayısı: "+ syc3);
                }
                if (syc3>=hamleSayısı)
                {
                	durum1=false;
                    durum2=false;
                    durum3=false;
                    durum4=false;
                    durum5=false;
                    end(oyuncu1.nesneListesi,oyuncu2.nesneListesi);
                }

                }
                
            }
            
        });
        oyuncu2.nesneSec();
        System.out.println("size=" + oyuncu2.nesneListesi.size());
        p3.add(l1);
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
        JPanel p6 = new JPanel();
        p6.setBackground(Color.WHITE);
      p6.setLayout(new BoxLayout(p6,BoxLayout.Y_AXIS));
        JPanel p7 = new JPanel();
         p7.setBackground(Color.WHITE);
       p7.setLayout(new BoxLayout(p7,BoxLayout.Y_AXIS));
       p7.add(l12);     
        JPanel p8 = new JPanel();
        p8.setBackground(Color.white);

        JLabel l2 = new JLabel("Hamle Yap");
       
        p8.setLayout(new BoxLayout(p8, BoxLayout.Y_AXIS));
        p8.add(l2);
        p8.add(b6);
        p8.add(l3);
        p8.add(b7);
        p8.add(l4);
        p8.add(b8);
        p8.add(l5);
        p8.add(b9);
        p8.add(l6);
        p8.add(b10);
        p8.add(l7);

        JPanel p9 = new JPanel();
        p9.setBackground(Color.white);
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        JPanel p10 = new JPanel();
        p10.setBackground(Color.PINK);
        p10.add(l8);p10.add(l9);
        JPanel p11 = new JPanel();
        p11.setBackground(Color.PINK);
        p11.add(l10);p11.add(l11);
        p1.add(p10);p1.add(p11);
        JButton b4 = new JButton("Oyuna   Basla");
        Image img4 = new ImageIcon(this.getClass().getResource("/oyun.png")).getImage();
        b4.setIcon(new ImageIcon(img4));
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (oyuncu1.nesneListesi.size() == 5) {
                      isim=JOptionPane.showInputDialog(p1,"Isminizi Giriniz");
                       ID=JOptionPane.showInputDialog(p1,"ID' nızı giriniz");
                      oyuncu1.setOyuncuADi(isim);
                      oyuncu1.setOyuncuID(ID);
                      l14.setText(oyuncu1.getOyuncuADi()+"-->skor: "+oyuncu1.SkoruGoster());
                     System.out.println("kullanıcı ad="+oyuncu1.getOyuncuADi());
                 hamle=true;
                 String s = JOptionPane.showInputDialog(p1,"Lütfen hamle sayısını giriniz:");
                 hamleSayısı=Integer.parseInt(s);
                 JOptionPane.showMessageDialog(p1, "Hamle butonları acıldı", "Uyarı", INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(p1, "Bu işlevi Kullanamazsınız", "Uyarı", INFORMATION_MESSAGE);
                }
            }

        });
        JButton b5 = new JButton("Nesne Secimi");
       Image img5 = new ImageIcon(this.getClass().getResource("/secim.png")).getImage();
        b5.setIcon(new ImageIcon(img5));
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (secim == true) {
                    kartSecim = true;
                    JOptionPane.showMessageDialog(p1, "Kart secmek için üç buton aktifleştrildi", "Bİlgi", INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(p1, "Bu işlevi Kullanamazsınız", "Uyarı", INFORMATION_MESSAGE);
                }
            }
        });
      p6.add(b4);
        p6.add(b5);
     p4.add(p7);
        p4.add(p6);
        JPanel p5 = new JPanel();
        p5.setBackground(Color.white);
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        p5.add(p9);
        p5.add(p8);
        p2.add(l13);p2.add(l14);p2.add(l15);p2.add(l16);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.NORTH);
        add(p3, BorderLayout.SOUTH);
        add(p4, BorderLayout.WEST);
        add(p5, BorderLayout.EAST);
        setDefaultCloseOperation(Sahne2.EXIT_ON_CLOSE);
    }
    public int random()
    {
    	 int j=(int)(Math.random()*syc5);
         System.out.println("üretilen"+j);
       if(temp.isEmpty())
       {
           temp.add(j);
           syc2++;
           syc4++;
           return j;
       }
       else if(! temp.isEmpty() ) 
       {
           boolean x=true;
           while (x)
           {
            int k=temp.size(),p=0,t=0;
               while(p<k)
               {
                   if(temp.get(p)!= j)
                   {
                    t++;
                     }
                   
                   p++;
               }
               if(t==k)
               {
                   temp.add(j);
                   syc2++;
                   syc4++;
                  return j;
               }
               else if(syc2<hamleSayısı && syc4%syc8==0 )
               {
              	 int  say =0;
              	 for(;say<syc8;say++)
              	 {
              		 temp.remove(syc8-say-1);
              	 }
                   temp.add(j);
                   syc2++;
                   syc4=1;
                  return j;
                  
               }
               else
               {
                  j=(int)(Math.random()*syc5); 
               }
               
           }
           
       }
	return 0;
    }
  public void end(ArrayList<Nesne> n1,ArrayList<Nesne> n2)
  {
	  if (oyuncu1.getSkor()<5 || oyuncu2.getSkor()<5)
	  {
		  double top1=0,top2=0;
		  for (int i=0;i<n1.size();i++)
		  {
			if(n1.get(i).getDayaniklilik()<=0)
			{
				top1+=0;
			}
			else
			{
				top1+=n1.get(i).getDayaniklilik();
			}
		  }
		  for (int j=0;j<n2.size();j++)
		  {
			 if(n2.get(j).getDayaniklilik()<=0)
			 {
				 top2+=0;
			 }
			 else
			 {
				 top2+=n2.get(j).getDayaniklilik();
			 }
			  
		  }
		  if ( top1>top2)
			 {
				 Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
				JOptionPane.showMessageDialog(p1,"Kullanıcı:"+top1+" Bilgisayar:"+top2+" Kazanan="+oyuncu1.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));

			 }
			 else if (top2 > top1)
			 {
				 Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
					JOptionPane.showMessageDialog(p1,"Kullanıcı:"+top1+" Bilgisayar:"+top2+" Kazanan="+oyuncu2.getOyuncuADi(),"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
			 }
			 else 
			 {
				 Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
					JOptionPane.showMessageDialog(p1,"Berabere"+"kullanıcı="+top1+" Bilgisayar:"+top2,"Sonuc", INFORMATION_MESSAGE,new ImageIcon(img));
			 }
	  }
  }
  
public void duzenle(int x)
{
	if (x == 1)
	{
	  Image img = new ImageIcon(this.getClass().getResource("/agırtas2.png")).getImage();
	  l8.setIcon(new ImageIcon(img));
	}
	else if (x == 2)
	{
		Image img = new ImageIcon(this.getClass().getResource("/tas2.png")).getImage();
		  l8.setIcon(new ImageIcon(img));
	}
	else if (x == 3)
	{
		Image img = new ImageIcon(this.getClass().getResource("/ozelkagıt2.png")).getImage();
		  l8.setIcon(new ImageIcon(img));
	}
	else if (x == 4)
	{
		Image img = new ImageIcon(this.getClass().getResource("/kagıt2.png")).getImage();
		  l8.setIcon(new ImageIcon(img));
	}
	else if (x == 5)
	{
		Image img = new ImageIcon(this.getClass().getResource("/ustamakas2.png")).getImage();
		  l8.setIcon(new ImageIcon(img));
	}
	else 
	{
		Image img = new ImageIcon(this.getClass().getResource("/makas2.png")).getImage();
		  l8.setIcon(new ImageIcon(img));
	}
}
public void duzenle2(int x)
{
	if (x == 1)
	{
	  Image img = new ImageIcon(this.getClass().getResource("/agırtas2.png")).getImage();
	  l10.setIcon(new ImageIcon(img));
	}
	else if (x == 2)
	{
		Image img = new ImageIcon(this.getClass().getResource("/tas2.png")).getImage();
		  l10.setIcon(new ImageIcon(img));
	}
	else if (x == 3)
	{
		Image img = new ImageIcon(this.getClass().getResource("/ozelkagıt2.png")).getImage();
		  l10.setIcon(new ImageIcon(img));
	}
	else if (x == 4)
	{
		Image img = new ImageIcon(this.getClass().getResource("/kagıt2.png")).getImage();
		  l10.setIcon(new ImageIcon(img));
	}
	else if (x == 5)
	{
		Image img = new ImageIcon(this.getClass().getResource("/ustamakas2.png")).getImage();
		  l10.setIcon(new ImageIcon(img));
	}
	else 
	{
		Image img = new ImageIcon(this.getClass().getResource("/makas2.png")).getImage();
		  l10.setIcon(new ImageIcon(img));
	}
}
    public String ad(Object o) {
        if (o instanceof Taş) {
            return "Tas";
        } else if (o instanceof Makas) {
            return "Makas";
        }
        return "Kagıt";
    }
    public int secenek(Nesne o)
    {
    	if(o instanceof AğırTaş)
    	{
    		return 1;
    	}
    	else if(o instanceof Taş)
    	{
    		return 2;
    	}
    	else if (o instanceof OzelKagıt)
    	{
    		return 3;
    	}
    	else if(o instanceof Kagıt)
    	{
    		return 4;
    	}
    	else if(o instanceof UstaMakas)
    	{
    		return 5;
    	}
    	else 
    	{
    		return 6;
    	}
    }
    public void ekle(int x) {
        
        switch (x) {
         case 1:
        String x1=oyuncu1.nesneListesi.get(0).nesnePuaniGoter();
       String a1=ad(oyuncu1.nesneListesi.get(0));
       b6.setText(a1);
       l3.setText(x1);
       
        if(a1.equals("Kagıt"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
    	   b6.setIcon(new ImageIcon(i));
       }
       else if(a1.equals("Makas"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
    	   b6.setIcon(new ImageIcon(i));
       }
       else
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
    	   b6.setIcon(new ImageIcon(i));
       }
                break;
            case 2:
 String x2=oyuncu1.nesneListesi.get(1).nesnePuaniGoter();
       String a2=ad(oyuncu1.nesneListesi.get(1));
       b7.setText(a2);
       l4.setText(x2);
       if(a2.equals("Kagıt"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
    	   b7.setIcon(new ImageIcon(i));
       }
       else if(a2.equals("Makas"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
    	   b7.setIcon(new ImageIcon(i));
       }
       else
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
    	   b7.setIcon(new ImageIcon(i));
       }
                break;

            case 3:
String x3=oyuncu1.nesneListesi.get(2).nesnePuaniGoter();
       String a3=ad(oyuncu1.nesneListesi.get(2));
       b8.setText(a3);
       l5.setText(x3);
       if(a3.equals("Kagıt"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
    	   b8.setIcon(new ImageIcon(i));
       }
       else if(a3.equals("Makas"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
    	   b8.setIcon(new ImageIcon(i));
       }
       else
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
    	   b8.setIcon(new ImageIcon(i));
       }
                break;

            case 4:
 String x4=oyuncu1.nesneListesi.get(3).nesnePuaniGoter();
       String a4=ad(oyuncu1.nesneListesi.get(3));
       b9.setText(a4);
       l6.setText(x4);
       if(a4.equals("Kagıt"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
    	   b9.setIcon(new ImageIcon(i));
       }
       else if(a4.equals("Makas"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
    	   b9.setIcon(new ImageIcon(i));
       }
       else
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
    	   b9.setIcon(new ImageIcon(i));
       }
                break;

            case 5:
String x5=oyuncu1.nesneListesi.get(4).nesnePuaniGoter();
       String a5=ad(oyuncu1.nesneListesi.get(4));
       b10.setText(a5);
       l7.setText(x5);
       if(a5.equals("Kagıt"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
    	   b10.setIcon(new ImageIcon(i));
       }
       else if(a5.equals("Makas"))
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
    	   b10.setIcon(new ImageIcon(i));
       }
       else
       {
    	   Image i = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
    	   b10.setIcon(new ImageIcon(i));
       }
                break;
        }
    }
}
