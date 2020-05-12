package ytuYSOFT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;

public class window {

	private JFrame frame;
	private JTextField id;
	private JTextField name;
	private JTextField min;
	private JTextField max;
	private JTextField bas;
	private JTextField son;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_111;
	private JLabel lblNewLabel_99;
	private JTextField ad2;
	private JTextField textField_1;
	private JTextField id2;
	private JTextField id3;
	private JLabel lblNewLabel_8;
	private JLabel soyad;
	private JLabel lblNewLabel_10;
	private JButton yonet;
	private JButton bitir;
	private JButton btnNewButton_1;
	private JButton tas;
	private JButton analist;
	private JButton yer;
	private JButton liste;
	private JButton liste2;
	private JButton Guncel;
	private JLabel hos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Yonetim YSOFT = new Yonetim();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(230, 230, 250));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1062, 749);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		id = new JTextField();
		id.setBounds(192, 114, 146, 26);
		frame.getContentPane().add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setBounds(192, 164, 146, 26);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		min = new JTextField();
		min.setBounds(192, 214, 146, 26);
		frame.getContentPane().add(min);
		min.setColumns(10);
		
		max = new JTextField();
		max.setBounds(192, 264, 146, 26);
		frame.getContentPane().add(max);
		max.setColumns(10);
		
		bas = new JTextField();
		bas.setBounds(192, 314, 146, 26);
		frame.getContentPane().add(bas);
		bas.setColumns(10);
		
		son = new JTextField();
		son.setBounds(192, 364, 146, 26);
		frame.getContentPane().add(son);
		son.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Proje ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(37, 116, 69, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Proje Ismi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(37, 166, 140, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Min Sayi");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(37, 216, 69, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Max Sayi");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(37, 266, 105, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Baslangic Tarihi");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(37, 316, 155, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bitis Tarihi");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(37, 366, 155, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("PROJE OLUSTUR");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(37, 78, 301, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JTextArea sonuc = new JTextArea();
		sonuc.setFont(new Font("Courier New", Font.BOLD, 16));
		sonuc.setBounds(37, 517, 968, 160);
		frame.getContentPane().add(sonuc);
		
		JButton onay = new JButton("Onayla");
		onay.setFont(new Font("Tahoma", Font.PLAIN, 18));
		onay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 if(id.getText().isEmpty() || name.getText().isEmpty() || min.getText().isEmpty() || max.getText().isEmpty() || 
						 bas.getText().isEmpty() || son.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null,"Tum Alanlari Doldurunuz", "Input Error", 0); 
				 }else {
					 
					 String isim=name.getText();
					 String baslangic=bas.getText();
					 String bitis=son.getText();
					 int mini = Integer.parseInt(min.getText());
					 int maxi = Integer.parseInt(max.getText());
					 String id2 = id.getText();
					 if(YSOFT.projeYarat(isim, baslangic, bitis, mini, maxi, id2)) {
						 JOptionPane.showMessageDialog(frame, "Proje olusturuldu");
					 }
					 else {
						 JOptionPane.showMessageDialog(frame, "Ayni ID");
					 }

				 }
			}
		});
		onay.setBounds(37, 433, 146, 58);
		frame.getContentPane().add(onay);
		
		lblNewLabel_7 = new JLabel("ISE ELEMAN AL");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(509, 78, 275, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_111 = new JLabel("PROJE BİTİR");
		lblNewLabel_111.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_111.setBounds(800, 78, 275, 20);
		frame.getContentPane().add(lblNewLabel_111);
		
		
		id3 = new JTextField();
		id3.setBounds(850, 114, 146, 26);
		frame.getContentPane().add(id3);
		id3.setColumns(10);
		
		lblNewLabel_99 = new JLabel("ID:");
		lblNewLabel_99.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_99.setBounds(800, 114, 50, 20);
		frame.getContentPane().add(lblNewLabel_99);
		
		bitir = new JButton("Bitir");
		bitir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		bitir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(id3.getText().isEmpty() ) {
					 JOptionPane.showMessageDialog(null,"Tum Alanlari Doldurunuz", "Input Error", 0); 
				 }else {
					
					 String bitenid = id3.getText();
					 if(YSOFT.projeBitir(bitenid)) {
							 JOptionPane.showMessageDialog(frame, "Proje bitirildi.");
					 }else {
						 JOptionPane.showMessageDialog(frame, "Uygun Proje Bulunamadı");
					 }		
					 
				 }
				
			}
		});
		
		bitir.setBounds(800, 165, 150, 20);
		frame.getContentPane().add(bitir);
		
		
		ad2 = new JTextField();
		ad2.setBounds(615, 114, 146, 26);
		frame.getContentPane().add(ad2);
		ad2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(615, 164, 146, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		id2 = new JTextField();
		id2.setBounds(615, 214, 146, 26);
		frame.getContentPane().add(id2);
		id2.setColumns(10);
		
		lblNewLabel_8 = new JLabel("Ad");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(509, 116, 69, 20);
		frame.getContentPane().add(lblNewLabel_8);
		
		soyad = new JLabel("Soyad");
		soyad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		soyad.setBounds(509, 166, 69, 20);
		frame.getContentPane().add(soyad);
		
		lblNewLabel_10 = new JLabel("ID");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_10.setBounds(509, 216, 69, 20);
		frame.getContentPane().add(lblNewLabel_10);
		
		yonet = new JButton("Yonetici");
		yonet.setFont(new Font("Tahoma", Font.PLAIN, 18));
		yonet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(id2.getText().isEmpty() || ad2.getText().isEmpty() || textField_1.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null,"Tum Alanlari Doldurunuz", "Input Error", 0); 
				 }else {
					
					 String cal_ad = ad2.getText();
					 String cal_soyad = textField_1.getText();
					 String cal_id = id2.getText();
					 if(YSOFT.yoneticiOlarakAl(cal_ad, cal_soyad, cal_id)) {
							 JOptionPane.showMessageDialog(frame, "Uygun Projeye Yerlestirildi");
					 }else {
						 JOptionPane.showMessageDialog(frame, "Uygun Proje Bulunamadı");
					 }		
					 
				 }
				
			}
		});
		yonet.setBounds(503, 262, 115, 29);
		frame.getContentPane().add(yonet);
		
		btnNewButton_1 = new JButton("Yazilimci");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(id2.getText().isEmpty() || ad2.getText().isEmpty() || textField_1.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null,"Tum Alanlari Doldurunuz", "Input Error", 0); 
				 }else {
					
					 String cal_ad = ad2.getText();
					 String cal_soyad = textField_1.getText();
					 String cal_id = id2.getText();
					 if(YSOFT.programciOlarakAl(cal_ad, cal_soyad, cal_id)) {
							 JOptionPane.showMessageDialog(frame, "Uygun Projeye Yerlestirildi");
					 }else {
						 JOptionPane.showMessageDialog(frame, "Uygun Proje Bulunamadı");
					 }		
					 
			}
			}
		});
		btnNewButton_1.setBounds(646, 262, 115, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		tas = new JButton("Tasarimci");
		tas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id2.getText().isEmpty() || ad2.getText().isEmpty() || textField_1.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null,"Tum Alanlari Doldurunuz", "Input Error", 0); 
				 }
				else {	
					 String cal_ad = ad2.getText();
					 String cal_soyad = textField_1.getText();
					 String cal_id = id2.getText();
					 if(YSOFT.tasarimciOlarakAl(cal_ad, cal_soyad, cal_id)) {
							 JOptionPane.showMessageDialog(frame, "Uygun Projeye Yerlestirildi");
					 }else {
						 JOptionPane.showMessageDialog(frame, "Uygun Proje Bulunamadı");
					 }		
					 
			}
				
			}
		});
		tas.setBounds(503, 312, 115, 29);
		frame.getContentPane().add(tas);
		
		analist = new JButton("Analist");
		analist.setFont(new Font("Tahoma", Font.PLAIN, 18));
		analist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id2.getText().isEmpty() || ad2.getText().isEmpty() || soyad.getText().isEmpty()) {
					 JOptionPane.showMessageDialog(null,"Tum Alanlari Doldurunuz", "Input Error", 0); 
				 }else {
					
					 String cal_ad = ad2.getText();
					 String cal_soyad = textField_1.getText();
					 String cal_id = id2.getText();
					 if(YSOFT.analistOlarakAl(cal_ad, cal_soyad, cal_id)) {
							 JOptionPane.showMessageDialog(frame, "Uygun Projeye Yerlestirildi");
					 }else {
						 JOptionPane.showMessageDialog(frame, "Uygun Proje Bulunamadı");
					 }		
					 
			}
			}
		});
		analist.setBounds(646, 312, 115, 29);
		frame.getContentPane().add(analist);
		
		liste = new JButton("Elemanları Listele");
		liste.setFont(new Font("Tahoma", Font.PLAIN, 18));
		liste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text="\n";
				ArrayList<Calisan> calisanListesi= YSOFT.getCalisanListesi();
				for(Calisan cls : calisanListesi) {
					if(cls.getMaas() != 0) {
					text = (text + cls.toString() + "\n");	
					}                                        //sirkette calisanlarin listesi
				}
				sonuc.setText(text);
			}
			
		});
		
		liste.setBounds(496, 444, 247, 47);
		frame.getContentPane().add(liste);
		
		liste2 = new JButton("Projeleri Listele");
		liste2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		liste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text="\n";
				ArrayList<Proje> guncelProjeler = YSOFT.guncelProjeler();
				for(Proje prj2 : guncelProjeler) {
					text = (text +"Isim:" +prj2.getProjeİsmi() +" ID:" +prj2.getId() +" Baslangic: " +prj2.getBaslangic() +" Bitis: " + prj2.getBitis() +"  Doluluk:  " +prj2.getRealSize() +"/" +prj2.getMAX() +"\n");		//yururlulukte olan ve gelecekte baslayacak projeleri listeler
				}
				sonuc.setText(text);
			}
		});
		liste2.setBounds(758, 443, 247, 49);
		frame.getContentPane().add(liste2);
		
		Guncel = new JButton("Guncelle");
		Guncel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YSOFT.bosElemanlariDuzenle();
				JOptionPane.showMessageDialog(frame, "Calisan grubu uygun yerlere yerlestirildi");
			}
		});
		Guncel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Guncel.setBounds(228, 445, 247, 45);
		frame.getContentPane().add(Guncel);
		
		hos = new JLabel("YSOFT BİLGİ SİSTEMİ");
		hos.setBackground(new Color(0, 0, 0));
		hos.setForeground(new Color(138, 43, 226));
		hos.setFont(new Font("Tahoma", Font.BOLD, 32));
		hos.setBounds(298, 16, 663, 46);
		frame.getContentPane().add(hos);
		
	}
}
