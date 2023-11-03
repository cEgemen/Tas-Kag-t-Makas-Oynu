import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Sahne1 extends JFrame{
private JButton b1 = new JButton();	
private JButton b2 = new JButton();	
private JButton b3 = new JButton();	
private JButton b4 = new JButton();	
private JButton b5 = new JButton();	
private JButton b6 = new JButton();	
private JButton b7 = new JButton();	
private JButton b8 = new JButton();	
private JButton b9 = new JButton();
private JButton b10 = new JButton();
private JButton b11=new JButton();
private Bilgisayar o1= new Bilgisayar("41231","Pc1",0);
private Bilgisayar o2=new Bilgisayar("43412","Pc2",0);
private JLabel l5 = new JLabel();
private JLabel l6 = new JLabel();
private JLabel l7 = new JLabel();
private JLabel l8 = new JLabel();
private JLabel l9 = new JLabel();
private JLabel l10= new JLabel();
private JLabel l11= new JLabel();
private JLabel l12 = new JLabel();
private JLabel l13= new JLabel();
private JLabel l14= new JLabel();
private JLabel l15=new JLabel();
private JLabel l16=new JLabel();
private JPanel p1 = new JPanel();
private JPanel p2 = new JPanel();
private JPanel p3 = new JPanel();
private JPanel p4 = new JPanel();
private JPanel p5 = new JPanel();
private JPanel p6 = new JPanel();
private JPanel p7 = new JPanel();
private JPanel p8 = new JPanel();
private JPanel p9 = new JPanel();
private JPanel p10 = new JPanel();
private JPanel p11 = new JPanel();
private int hamleSayısı=0;
private int syc=0,syc2=0,syc3=5,syc6=5,syc4=0,syc5=5,syc8=5;
private ArrayList<Integer> tmp1=new ArrayList<Integer>();
private ArrayList<Integer> tmp2=new ArrayList<Integer>();
private boolean durum=true;
	Sahne1()
	{
		setSize(800,800);
	p1.setBackground(Color.PINK);
	p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
	p2.setBackground(Color.LIGHT_GRAY);
	p3.setBackground(Color.LIGHT_GRAY);
	p4.setLayout(new BoxLayout(p4,BoxLayout.Y_AXIS));
	p5.setLayout(new BoxLayout(p5,BoxLayout.Y_AXIS));
	p6.setLayout(new BoxLayout(p6,BoxLayout.Y_AXIS));
	p7.setLayout(new BoxLayout(p7,BoxLayout.Y_AXIS));
	p8.setLayout(new BoxLayout(p8,BoxLayout.Y_AXIS));
	p10.setBackground(Color.green);
	p10.add(l15);p10.add(l5);
	p11.setBackground(Color.orange);
	p11.add(l16);p11.add(l6);
	JLabel l1=new JLabel();
	Image img1 = new ImageIcon(this.getClass().getResource("/pc1.png")).getImage();
	l1.setIcon(new ImageIcon(img1));
	JLabel l2=new JLabel();
	Image img2 = new ImageIcon(this.getClass().getResource("/sag.png")).getImage();
	l2.setIcon(new ImageIcon(img2));
	JLabel l3=new JLabel();
	Image img3 = new ImageIcon(this.getClass().getResource("/pc2.png")).getImage();
	l3.setIcon(new ImageIcon(img3));
	JLabel l4=new JLabel();
	Image img4 = new ImageIcon(this.getClass().getResource("/sag.png")).getImage();
	l4.setIcon(new ImageIcon(img4));
	JLabel l17 =new JLabel();
	Image img5 =new ImageIcon(this.getClass().getResource("/pc1.2.png")).getImage();
	l17.setIcon(new ImageIcon(img5));
	JLabel l18 =new JLabel();
	Image img6=new ImageIcon(this.getClass().getResource("/pc2.2.png")).getImage();
	l18.setIcon(new ImageIcon(img6));
	JLabel l19=new JLabel(o1.getOyuncuADi()+"-->skor:"+o1.SkoruGoster());
	JLabel l20=new JLabel(o2.getOyuncuADi()+"-->skor:"+o2.SkoruGoster());
	JLabel l21 = new JLabel();
	Image img7=new ImageIcon(this.getClass().getResource("/sarı.png")).getImage();
	l21.setIcon(new ImageIcon(img7));
	JLabel l22 = new JLabel();
	Image img8=new ImageIcon(this.getClass().getResource("/mavi.png")).getImage();
	l22.setIcon(new ImageIcon(img8));
	Image img9=new ImageIcon(this.getClass().getResource("/buton.png")).getImage();
	b11.setIcon(new ImageIcon(img9));
	JLabel l23 =new JLabel("Hamle Sayısı= 0");
		p7.add(l17);p7.add(l19);
		p8.add(l18);p8.add(l20);
		p4.add(p7);p4.add(p6);p5.add(p8);p5.add(p9);
		p2.add(l1);p2.add(l2);p2.add(b1);p2.add(b2);p2.add(b3);p2.add(b4);p2.add(b5);
		p3.add(l3);p3.add(l4);p3.add(b6);p3.add(b7);p3.add(b8);p3.add(b9);p3.add(b10);p3.add(l23);p3.add(l21);p3.add(b11);p3.add(l22);
		p1.add(p10);p1.add(p11);
		add(p1,BorderLayout.CENTER);add(p2,BorderLayout.NORTH);add(p3,BorderLayout.SOUTH);add(p4,BorderLayout.WEST);add(p5,BorderLayout.EAST);	
		o1.nesneSec();
		o2.nesneSec();
		ekle1(o1.nesneListesi);
		ekle2(o2.nesneListesi);
		b11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(syc==0)
				{
					String c=JOptionPane.showInputDialog(p1,"Lütfen hamle sayisini giriniz:");
					hamleSayısı=Integer.parseInt(c);
				}
				if(durum)
				{
				int i=random1();
				int j=random2();
				System.out.println("syc="+syc);
				Nesne nesne1 = o1.nesneSec(i,o1.nesneListesi);
	            int s = secenek(nesne1);
	            System.out.println("s="+s);
	            Nesne nesne2 = o2.nesneSec(j,o2.nesneListesi);
	            int s3 = secenek(nesne2);
	            System.out.println("s3="+s3);
	            double etki1= o1.nesneSec(i,o1.nesneListesi).etkiHesapla(s);
	            o1.nesneSec(i,o1.nesneListesi).durumGuncelle(o2.nesneSec(j,o2.nesneListesi).etkiHesapla(s));
	            o2.nesneSec(j,o2.nesneListesi).durumGuncelle(o1.nesneSec(i,o1.nesneListesi).etkiHesapla(s3));
	           duzenle(s,nesne1,o1.nesneSec(i,o1.nesneListesi).etkiHesapla(s3));
	           duzenle2(s3,nesne2,o2.nesneSec(j,o2.nesneListesi).etkiHesapla(s));
	           if( o1.nesneSec(i,o1.nesneListesi).getDayaniklilik()>0 && o2.nesneSec(j,o2.nesneListesi).getDayaniklilik()<=0)
	           {
	        	   o1.setSkor(o1.getSkor()+1);
	        	   l19.setText(o1.getOyuncuADi()+"-->skor: "+o1.SkoruGoster());
	        	   o1.nesneSec(i,o1.nesneListesi).setSeviyePuani(o1.nesneSec(i,o1.nesneListesi).getSeviyePuani()+20);
               	System.out.println("oyuncu1..dayanklilik:"+o1.nesneSec(i,o1.nesneListesi).getDayaniklilik()+"seviyepuanı:"+o1.nesneSec(i,o1.nesneListesi).getSeviyePuani());
                  	if(o1.nesneSec(i,o1.nesneListesi).getSeviyePuani()>=30)
                  	{
                  		int x=secenek(o1.nesneSec(i,o1.nesneListesi));
                  		System.out.println("eski kartın secenegi="+x);
                  		if(x==2)
                  		{
                  			System.out.println("yükseldi");  			
                  			AğırTaş a =new AğırTaş(o1.nesneSec(i,o1.nesneListesi).getDayaniklilik(),0);	
                  			o1.nesneListesi.set(i,a);
                  			if(i==0)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                             	 b1.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==1)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	 b2.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==2)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	 b3.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==3)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	 b4.setIcon(new ImageIcon(ix));
                  			}
                  			else 
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	 b5.setIcon(new ImageIcon(ix));
                  			}
                  		              
                  			int b=secenek(o1.nesneListesi.get(i));
                  			System.out.println("yeni kartın secenegi="+b);
                  		}
                  		else if(x==4)
                  		{
                  			System.out.println("yükseldi");
                  			OzelKagıt a =new OzelKagıt(o1.nesneSec(i,o1.nesneListesi).getDayaniklilik(),0);
                  			o1.nesneListesi.set(i,a);
                  			if(i==0)
                  			{
                  				 Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                           	   b1.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==1)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	 b2.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==2)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	 b3.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==3)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	 b4.setIcon(new ImageIcon(ix));
                  			}
                  			else 
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	 b5.setIcon(new ImageIcon(ix));
                  			}
                  			int b=secenek(o1.nesneListesi.get(i));
                  			System.out.println("yeni kartın secenegi="+b);
                  		}
                  		
                  		else if(x==6)
                  		{
                  			System.out.println("yükseldi");
                  			UstaMakas a =new UstaMakas(o1.nesneSec(i,o1.nesneListesi).getDayaniklilik(),0);
                  			o1.nesneListesi.set(i,a);
                  			if(i==0)
                  			{
                  				 Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                           	   b1.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==1)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	 b2.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==2)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	 b3.setIcon(new ImageIcon(ix));
                  			}
                  			else if(i==3)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	 b4.setIcon(new ImageIcon(ix));
                  			}
                  			else 
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	 b5.setIcon(new ImageIcon(ix));
                  			}
                   	  
                  			int b=secenek(o1.nesneListesi.get(i));
                  			System.out.println("yeni kartın secenegi="+b);
                  		}
                  	}
                  	o2.nesneListesi.remove(j);
                  	syc6--;
                  	syc3--;
                  	int  say =0,v=tmp2.size();
                	 for(;say<v;say++)
                	 {
                		 System.out.println("temp"+tmp2.get(v-say-1));
                		 tmp2.remove(v-say-1);
                	 }
                	 syc2=0;
	           }
	           else if(o2.nesneSec(j,o2.nesneListesi).getDayaniklilik()>0 && o1.nesneSec(i,o1.nesneListesi).getDayaniklilik()<=0)
               {
               	o2.setSkor(o2.getSkor()+1);
               	l20.setText(o2.getOyuncuADi()+"-->skor: "+o2.SkoruGoster());
               	o2.nesneSec(j,o2.nesneListesi).setSeviyePuani(o2.nesneSec(j,o2.nesneListesi).getSeviyePuani()+20);
               	System.out.println("oyuncu2..dayanklilik:"+o2.nesneSec(j,o2.nesneListesi).getDayaniklilik()+"seviyepuanı:"+o2.nesneSec(j,o2.nesneListesi).getSeviyePuani());
               	if(o2.nesneSec(j,o2.nesneListesi).getSeviyePuani()>=30)
                  	{
                  		int x=secenek(o2.nesneSec(j,o2.nesneListesi));
                  		System.out.println("eski kartın secenegi="+x);
                  		if(x==2)
                  		{
                  			AğırTaş a =new AğırTaş(o2.nesneSec(j,o2.nesneListesi).getDayaniklilik(),0);
                  			o2.nesneListesi.set(j,a);
                  			if(j==0)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	   b6.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==1)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	   b7.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==2)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	   b8.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==3)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	   b9.setIcon(new ImageIcon(ix));
                  			}
                  			else
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/agırtas.png")).getImage();
                            	   b10.setIcon(new ImageIcon(ix));
                  			}
                  			int b=secenek(o1.nesneListesi.get(j));
                  			System.out.println("yeni kartın secenegi="+b);
                  		}
                  		else if(x==4)
                  		{
                  			OzelKagıt a =new OzelKagıt(o2.nesneSec(j,o2.nesneListesi).getDayaniklilik(),0);
                  			o2.nesneListesi.set(j,a);
                  			if(j==0)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	   b6.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==1)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	   b7.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==2)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	   b8.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==3)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	   b9.setIcon(new ImageIcon(ix));
                  			}
                  			else
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ozelkagıt.png")).getImage();
                            	   b10.setIcon(new ImageIcon(ix));
                  			}
                  			int b=secenek(o2.nesneListesi.get(j));
                  			System.out.println("yeni kartın secenegi="+b);
                  		}
                  		else if(x==6)
                  		{
                  			UstaMakas a =new UstaMakas(o2.nesneSec(j,o2.nesneListesi).getDayaniklilik(),0);
                  			o2.nesneListesi.set(j,a);
                  			if(j==0)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	   b6.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==1)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	   b7.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==2)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	   b8.setIcon(new ImageIcon(ix));
                  			}
                  			else if(j==3)
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	   b9.setIcon(new ImageIcon(ix));
                  			}
                  			else
                  			{
                  				Image ix = new ImageIcon(this.getClass().getResource("/ustamakas.png")).getImage();
                            	   b10.setIcon(new ImageIcon(ix));
                  			}
                  			int b=secenek(o2.nesneListesi.get(j));
                  			System.out.println("yeni kartın secenegi="+b);
                  		}
                  	}
            	o1.nesneListesi.remove(i);
              	syc5--;
              	syc8--;
              	int  say =0,v=tmp1.size();
            	 for(;say<v;say++)
            	 {
            		 System.out.println("temp"+tmp1.get(v-say-1));
            		 tmp1.remove(v-say-1);
            	 }
            	 syc4=0;
               }
	           else if(o2.nesneSec(j,o2.nesneListesi).getDayaniklilik()<=0 && o1.nesneSec(i,o1.nesneListesi).getDayaniklilik()<=0)
               {
               	System.out.println("ikiside bitti");
               	o1.setSkor(o1.getSkor()+1);
              	 l19.setText(o1.getOyuncuADi()+"-->skor: "+o1.SkoruGoster());
              	o2.setSkor(o2.getSkor()+1);
           	l20.setText(o2.getOyuncuADi()+"-->skor: "+o2.SkoruGoster());
           	o1.nesneListesi.remove(i);
          	syc5--;
          	syc8--;
          	int  say =0,v=tmp1.size();
        	 for(;say<v;say++)
        	 {
        		 System.out.println("temp"+tmp1.get(v-say-1));
        		 tmp1.remove(v-say-1);
        	 }
        	 syc4=0;
        	 o2.nesneListesi.remove(j);
           	syc6--;
           	syc3--;
           	int  say2 =0,v2=tmp2.size();
         	 for(;say2<v2;say2++)
         	 {
         		 System.out.println("temp"+tmp2.get(v2-say2-1));
         		 tmp2.remove(v2-say2-1);
         	 }
         	 syc2=0;
               }
	           if(o1.nesneListesi.size()==0 || o2.nesneListesi.size()==0)
               {
            	   if(o1.nesneListesi.size()==0)
            	   {
            	   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
       			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+o2.getOyuncuADi()+" skoru="+o2.SkoruGoster()+" rakip skor: "+o1.SkoruGoster(),"Sonuc",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(img));
            	   }
            	   else if(o2.nesneListesi.size()==0)
            	   {
            		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
           			JOptionPane.showMessageDialog(p1,"Kazanan oyuncu= "+o1.getOyuncuADi()+" skoru="+o1.SkoruGoster()+" rakip skor: "+o2.SkoruGoster(),"Sonuc",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(img));
            	   }
            	   else
            	   {
            		   Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
           			JOptionPane.showMessageDialog(p1,"Berabere"+"oyuncu1 skoru="+o1.SkoruGoster()+" oyuncu2 skor: "+o2.SkoruGoster(),"Sonuc",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(img));
            	   }
               }    

				syc++;
				System.out.println("syc="+syc);
				l23.setText("Hamle sayısı= "+syc);
				}
		if(syc==hamleSayısı)
		{
			durum=false;
			end(o1.nesneListesi,o2.nesneListesi);
		}
		
			}
		});
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void end(ArrayList<Nesne> n1,ArrayList<Nesne> n2)
	  {
		  if (o1.getSkor()<5 || o1.getSkor()<5)
		  {
			  double top1=0,top2=0;
			  for (int i=0;i<n1.size();i++)
			  {
				top1+=n1.get(i).getDayaniklilik();
			  }
			  for (int j=0;j<n2.size();j++)
			  {
				  top2+=n2.get(j).getDayaniklilik();
			  }
			  if ( top1>top2)
				 {
					 Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
					JOptionPane.showMessageDialog(p10,"Bilgisayar1:"+top1+" Bilgisayar2:"+top2+" Kazanan="+o1.getOyuncuADi(),"Sonuc",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(img));
				 }
				 else if (top2 > top1)
				 {
					 Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
						JOptionPane.showMessageDialog(p10,"Kullanıcı1:"+top1+" Bilgisayar2:"+top2+" Kazanan="+o2.getOyuncuADi(),"Sonuc",JOptionPane.INFORMATION_MESSAGE,new ImageIcon(img));
				 }
				 else 
				 {
					 Image img =new ImageIcon(this.getClass().getResource("/end.png")).getImage();
						JOptionPane.showMessageDialog(p10,"Berabere"+" Bilgisayr1="+top1+" Bilgisayar2:"+top2,"Sonuc", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(img));
				 }
		  }
	  }
	public int random1()
	{
		 int j=(int)(Math.random()*syc5);
         System.out.println("üretilen"+j);
       if(tmp1.isEmpty())
       {
           tmp1.add(j); 
           syc4++;
           System.out.println("j1"+j);
           return j;
       }
       else if(! tmp1.isEmpty() ) 
       {
           boolean x=true;
           while (x)
           {
            int k=tmp1.size(),p=0,t=0;
               while(p<k)
               {
                   if(tmp1.get(p)!= j)
                   {
                    t++;
                     }
                   
                   p++;
               }
               if(t==k)
               {
                   tmp1.add(j);
                   syc4++;
                   System.out.println("j1"+j);
                  return j;
               }
               else if(syc4%syc8==0 )
               {
              	 int  say =0;
              	 for(;say<syc8;say++)
              	 {
              		 tmp1.remove(syc8-say-1);
              	 }
                   tmp1.add(j);
                   syc4=1;
                   System.out.println("j1"+j);
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
	public int random2()
	{
		 int j=(int)(Math.random()*syc6);
         System.out.println("üretilen"+j);
       if(tmp2.isEmpty())
       {
           tmp2.add(j); 
           syc2++;
           System.out.println("j2"+j);
           return j;
       }
       else if(! tmp2.isEmpty() ) 
       {
           boolean x=true;
           while (x)
           {
            int k=tmp2.size(),p=0,t=0;
               while(p<k)
               {
                   if(tmp2.get(p)!= j)
                   {
                    t++;
                     }
                   
                   p++;
               }
               if(t==k)
               {
                   tmp2.add(j);
                   syc2++;
                   System.out.println("j2"+j);
                  return j;
               }
               else if(syc2%syc3==0 )
               {
              	 int  say =0;
              	 for(;say<syc3;say++)
              	 {
              		 tmp2.remove(syc3-say-1);
              	 }
                   tmp2.add(j);
                   syc2=1;
                   System.out.println("j2"+j);
                    return j;
                  
               }
               else
               {
                  j=(int)(Math.random()*syc6); 
               }
               
           }
           
       }
	return 0;
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
	 public void ekle1(ArrayList<Nesne> n)
	 {
		 int a1=secenek(n.get(0));
		 if(a1==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b1.setIcon(new ImageIcon(img));
		
		 }
		 else if(a1==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b1.setIcon(new ImageIcon(img));
		
		 }
		 else if(a1==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b1.setIcon(new ImageIcon(img));
			 
		 }
		 int a2=secenek(n.get(1));
		 if(a2==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b2.setIcon(new ImageIcon(img));
	
		 }
		 else if(a2==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b2.setIcon(new ImageIcon(img));
			
		 }
		 else if(a2==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b2.setIcon(new ImageIcon(img));
			 
		 } 
		 int a3=secenek(n.get(2));
		 if(a3==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b3.setIcon(new ImageIcon(img));
		
		 }
		 else if(a3==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b3.setIcon(new ImageIcon(img));
		
		 }
		 else if(a3==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b3.setIcon(new ImageIcon(img));
			
		 } 
		 int a4=secenek(n.get(3));
		 if(a4==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b4.setIcon(new ImageIcon(img));
		
		 }
		 else if(a4==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b4.setIcon(new ImageIcon(img));
	
		 }
		 else if(a4==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b4.setIcon(new ImageIcon(img));
			
		 } 
		 int a5=secenek(n.get(4));
		 if(a5==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b5.setIcon(new ImageIcon(img));
	
		 }
		 else if(a5==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b5.setIcon(new ImageIcon(img));
		
		 }
		 else if(a5==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b5.setIcon(new ImageIcon(img));
			
		 } 
		}
	 public void duzenle(int x,Nesne n,double hasar)
	 {
	 	if (x == 1)
	 	{
	 	  Image img = new ImageIcon(this.getClass().getResource("/agırtas2.png")).getImage();
	 	  l15.setIcon(new ImageIcon(img));
	 	  l5.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 2)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/tas2.png")).getImage();
	 		  l15.setIcon(new ImageIcon(img));
	 		 l5.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 3)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/ozelkagıt2.png")).getImage();
	 		  l15.setIcon(new ImageIcon(img));
	 		 l5.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 4)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/kagıt2.png")).getImage();
	 		  l15.setIcon(new ImageIcon(img));
	 		 l5.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 5)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/ustamakas2.png")).getImage();
	 		  l15.setIcon(new ImageIcon(img));
	 		 l5.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else 
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/makas2.png")).getImage();
	 		  l15.setIcon(new ImageIcon(img));
	 		 l5.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 }
	 public void duzenle2(int x,Nesne n,double hasar)
	 {
	 	if (x == 1)
	 	{
	 	  Image img = new ImageIcon(this.getClass().getResource("/agırtas2.png")).getImage();
	 	  l16.setIcon(new ImageIcon(img));
	 	  l6.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 2)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/tas2.png")).getImage();
	 		  l16.setIcon(new ImageIcon(img));
	 		 l6.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 3)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/ozelkagıt2.png")).getImage();
	 		  l16.setIcon(new ImageIcon(img));
	 		 l6.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 4)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/kagıt2.png")).getImage();
	 		  l16.setIcon(new ImageIcon(img));
	 		 l6.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else if (x == 5)
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/ustamakas2.png")).getImage();
	 		  l16.setIcon(new ImageIcon(img));
	 		 l6.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 	else 
	 	{
	 		Image img = new ImageIcon(this.getClass().getResource("/makas2.png")).getImage();
	 		  l16.setIcon(new ImageIcon(img));
	 		 l6.setText(n.nesnePuaniGoter()+" hasar:"+hasar);
	 	}
	 }
	
	 public void ekle2(ArrayList<Nesne> n)
	 {
		 int a1=secenek(n.get(0));
		 if(a1==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b6.setIcon(new ImageIcon(img));
		l10.setText("Tas:"+n.get(0).nesnePuaniGoter());
		 }
		 else if(a1==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b6.setIcon(new ImageIcon(img));
		l10.setText("Kagıt:"+n.get(0).nesnePuaniGoter());
		 }
		 else if(a1==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b6.setIcon(new ImageIcon(img));
			l10.setText("Makas:"+n.get(0).nesnePuaniGoter());
		 }
		 int a2=secenek(n.get(1));
		 if(a2==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b7.setIcon(new ImageIcon(img));
	l11.setText("Tas:"+n.get(1).nesnePuaniGoter());
		 }
		 else if(a2==4)
		 {
		
		Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b7.setIcon(new ImageIcon(img));
		l11.setText("Kagıt:"+n.get(1).nesnePuaniGoter());
		 }
		 else if(a2==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b7.setIcon(new ImageIcon(img));
			l11.setText("Makas:"+n.get(1).nesnePuaniGoter());
		 } 
		 int a3=secenek(n.get(2));
		 if(a3==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b8.setIcon(new ImageIcon(img));
		l12.setText("Tas:"+n.get(2).nesnePuaniGoter());
		 }
		 else if(a3==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b8.setIcon(new ImageIcon(img));
			l12.setText("Kagıt:"+n.get(2).nesnePuaniGoter());
		 }
		 else if(a3==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b8.setIcon(new ImageIcon(img));
			l12.setText("Makas:"+n.get(2).nesnePuaniGoter());
		 } 
		 int a4=secenek(n.get(3));
		 if(a4==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b9.setIcon(new ImageIcon(img));
		 l13.setText("Tas:"+n.get(3).nesnePuaniGoter());
		 }
		 else if(a4==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b9.setIcon(new ImageIcon(img));
			 l13.setText("Kagıt:"+n.get(3).nesnePuaniGoter());
		 }
		 else if(a4==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b9.setIcon(new ImageIcon(img));
			 l13.setText("Makas:"+n.get(3).nesnePuaniGoter());
		 } 
		 int a5=secenek(n.get(4));
		 if(a5==2)
		 {
		 Image img = new ImageIcon(this.getClass().getResource("/tas.png")).getImage();
		 b10.setIcon(new ImageIcon(img));
		 l14.setText("Tas:"+n.get(4).nesnePuaniGoter());
		 }
		 else if(a5==4)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/kagıt.png")).getImage();
			 b10.setIcon(new ImageIcon(img));
			 l14.setText("Kagıt:"+n.get(4).nesnePuaniGoter());
		 }
		 else if(a5==6)
		 {
			 Image img = new ImageIcon(this.getClass().getResource("/makas.png")).getImage();
			 b10.setIcon(new ImageIcon(img));
			 l14.setText("Makas:"+n.get(4).nesnePuaniGoter());
		 } 
		}
	 }
