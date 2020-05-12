package ytuYSOFT;
import javax.swing.*;
import java.awt.*;
public class Gui extends JFrame{
	public static void main(String args[]) {
		
		JFrame ekran = new JFrame("Yazilim Projesi");
		ekran.setSize(1000,600);
		
		JPanel GUI = new JPanel();
		GUI.setLayout(null);
		
		
		JPanel iseAl = new JPanel();
		iseAl.setLayout(null);
		iseAl.setLocation(10, 0);
		iseAl.setSize(1000,600);
		GUI.add(iseAl);
		
		JLabel IseAlKismi = new JLabel("ÝÞE ALMA");
		IseAlKismi.setLocation(0, 0);
		IseAlKismi.setSize(100,30);
		IseAlKismi.setHorizontalAlignment(0);
		iseAl.add(IseAlKismi);
		
		JLabel IseAtmaKismi = new JLabel("ÝÞTEN ATMA");
		IseAtmaKismi.setLocation(500, 0);
		IseAtmaKismi.setSize(100,30);
		IseAtmaKismi.setHorizontalAlignment(0);
		iseAl.add(IseAtmaKismi);
		
		JLabel IDt = new JLabel("ID");
		IDt.setLocation(500, 25);
		IDt.setSize(50,50);
		IDt.setHorizontalAlignment(2);
		iseAl.add(IDt);
		
		JTextField ID2t = new JTextField("ID");
		ID2t.setLocation(550, 40);
		ID2t.setSize(150,25);
		ID2t.setHorizontalAlignment(2);
		iseAl.add(ID2t);
		
		JButton jb8 = new JButton ("Ýþten At");
		jb8.setSize(100, 50);
		jb8.setLocation(500,100);
		jb8.setHorizontalAlignment(0);
		iseAl.add(jb8);
		
		JTextField output = new JTextField("Output");
		output.setLocation(500, 230);
		output.setSize(400,300);
		output.setHorizontalAlignment(2);
		iseAl.add(output);
		
		JLabel isim = new JLabel("Ýsim");
		isim.setLocation(0, 25);
		isim.setSize(50,50);
		isim.setHorizontalAlignment(2);
		iseAl.add(isim);
		
		JTextField isim2 = new JTextField("Ýsim");
		isim2.setLocation(50, 40);
		isim2.setSize(150,25);
		isim2.setHorizontalAlignment(2);
		iseAl.add(isim2);
		
		JLabel soyisim = new JLabel("Soyisim");
		soyisim.setLocation(0, 75);
		soyisim.setSize(50,50);
		soyisim.setHorizontalAlignment(2);
		iseAl.add(soyisim);
		
		JTextField soyisim2 = new JTextField("Soyisim");
		soyisim2.setLocation(50, 90);
		soyisim2.setSize(150,25);
		soyisim2.setHorizontalAlignment(2);
		iseAl.add(soyisim2);
		
		JLabel ID = new JLabel("ID");
		ID.setLocation(0, 125);
		ID.setSize(50,50);
		ID.setHorizontalAlignment(2);
		iseAl.add(ID);
		
		JTextField ID2 = new JTextField("ID");
		ID2.setLocation(50, 140);
		ID2.setSize(150,25);
		ID2.setHorizontalAlignment(2);
		iseAl.add(ID2);
		
		JButton jb1 = new JButton ("Yönetici");
		jb1.setSize(100, 25);
		jb1.setLocation(0,230);
		jb1.setHorizontalAlignment(0);
		iseAl.add(jb1);
		
		JButton jb2 = new JButton ("Programcý");
		jb2.setSize(100, 25);
		jb2.setLocation(110,230);
		jb2.setHorizontalAlignment(0);
		iseAl.add(jb2);
		
		JButton jb3 = new JButton ("Tasarýmcý");
		jb3.setSize(100, 25);
		jb3.setLocation(220,230);
		jb3.setHorizontalAlignment(0);
		iseAl.add(jb3);
		
		JButton jb4 = new JButton ("Analist");
		jb4.setSize(100, 25);
		jb4.setLocation(330,230);
		jb4.setHorizontalAlignment(0);
		iseAl.add(jb4);
		
		JButton jb5 = new JButton ("Boþ Eleman Düzenle");
		jb5.setSize(200, 50);
		jb5.setLocation(10,300);
		jb5.setHorizontalAlignment(0);
		iseAl.add(jb5);
		
		JButton jb9 = new JButton ("Proje Yarat");
		jb9.setSize(200, 50);
		jb9.setLocation(10,400);
		jb9.setHorizontalAlignment(0);
		iseAl.add(jb9);
		
		JButton jb6 = new JButton ("Projeleri Listele");
		jb6.setSize(200, 50);
		jb6.setLocation(250,300);
		jb6.setHorizontalAlignment(0);
		iseAl.add(jb6);
		
		JButton jb7 = new JButton ("Çalýþanlarý Listele");
		jb7.setSize(200, 50);
		jb7.setLocation(250,400);
		jb7.setHorizontalAlignment(0);
		iseAl.add(jb7);
		
		JLabel x = new JLabel("ÇALIÞANIN MESLEÐÝ");
		x.setLocation(165, 180);
		x.setSize(150,25);
		x.setHorizontalAlignment(2);
		iseAl.add(x);
		
		
		ekran.setContentPane(GUI);
		ekran.setResizable(false);
		ekran.setVisible(true);
		
	}

}
