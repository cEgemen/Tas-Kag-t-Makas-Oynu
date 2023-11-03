
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Oyun extends JFrame{
	private JPanel p1 = new JPanel();
    private  JPanel p2 = new JPanel();  
    private  JPanel p3 = new JPanel();
    private JPanel p4 =new JPanel();
    private JLabel l1 = new JLabel("TAS-KAGIT-MAKAS OYUNA HOSGELDİINIZ");
    private JLabel l2 = new JLabel();
    private JLabel l3=new JLabel();
    private JLabel l4=new JLabel();
    private JLabel l5=new JLabel();
    private JLabel l6=new JLabel();
    private JLabel l7=new JLabel();
    private JLabel l8=new JLabel();
    private JButton b1 =new JButton("Bilgisayar-Kullanıcı Oyna");
    private JButton b2=new JButton("Bilgisayar-Bilgisayar Oyna");
    public Oyun() throws HeadlessException {
        setSize(800, 800);
        setLayout(null);
        p1.setBounds(0, 0, 800, 400);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS)); 
        p2.setBounds(0, 400, 800, 400);
        p2.setBackground(Color.WHITE);
       p3.setBackground(Color.PINK);
       p4.setBackground(Color.PINK);
        l1.setBounds(0, 0, 200, 100);
        l1.setFont(new Font("Pristina", Font.PLAIN, 18));
        l1.setForeground(Color.BLACK);
        Image img = new ImageIcon(this.getClass().getResource("/ston.png")).getImage();
        l2.setIcon(new ImageIcon(img));
        Image img2 =new ImageIcon(this.getClass().getResource("/bilgisayar.png")).getImage();
        l3.setIcon(new ImageIcon(img2));
        Image img3 =new ImageIcon(this.getClass().getResource("/oyuncu.png")).getImage();
        l4.setIcon(new ImageIcon(img3));
        Image img4 =new ImageIcon(this.getClass().getResource("/pc11.png")).getImage();
        l5.setIcon(new ImageIcon(img4));
        Image img5 =new ImageIcon(this.getClass().getResource("/pc22.png")).getImage();
        l6.setIcon(new ImageIcon(img5));
        Image img6 =new ImageIcon(this.getClass().getResource("/scissor.png")).getImage();
        l7.setIcon(new ImageIcon(img6));
        Image img7=new ImageIcon(this.getClass().getResource("/fist.png")).getImage();
        l8.setIcon(new ImageIcon(img7));
        p3.add(l1);
        p4.add(l2);p4.add(l7);p4.add(l8);
        p1.add(p3);p1.add(p4);    
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                yap1();
              
            }
            
        });
        b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				yap2();
				
			}
        	
        });
         p2.add(l3);p2.add(b1);p2.add(l4);p2.add(l5);p2.add(b2);p2.add(l6);
        this.add(p1);
        this.add(p2);
        setVisible(true);
        setDefaultCloseOperation(Oyun.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Oyun oyun = new Oyun();

    }
public void yap1()
{
    
    this.setVisible(false);
    Sahne2 s2=new Sahne2();
    
}
    public void yap2()
    {
    	this.setVisible(false);
    	Sahne1 s1 = new Sahne1();
    }
    
    
}

