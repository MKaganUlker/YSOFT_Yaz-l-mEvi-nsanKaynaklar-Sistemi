package ytuYSOFT;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Yonetim {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate today = LocalDate.now();
	private final ArrayList<Calisan> calisanListesi = new ArrayList<Calisan>() ;	//þirket bünyesinde olan çalýþanlarýn listesi
	private final ArrayList<Proje> projeListesi = new ArrayList<Proje>();			//sirketteki gecmis suan ve gelecekteki butun projelerin listesi	
	                                                                                //composition -þirket calisanlari veya projeler yonetimsiz var olamaz
	
	 
	
					//fonksiyonlardaki (Calisan cls) argumaný yerine calisanin IDsi yazilarak da istenen islem yapilabilir
					//GUI'de hangisi daha kolay kullaniliyorsa ona gore duzenlenebilir bu durum
					
					//System.out.println dedigim kýsýmlar GUI'de bir yerde kullanýcýya gösterilebilir
	
	
	
	
	public void bosElemanlariDuzenle() {				//fonksiyonun cagrildigi aný baz alarak an itibariyle gecerliligini yitirmis(bitmis)
														//projelerdeki kisileri projeden cikar
		 this.bitenProjeleriDagit();					//sonrasýnda biten projelerdeki
		 												//elemanlari bulunabiliyorsa eklenmesi uygun bir projeye ekle, bulunamiyorsa isten
		 this.projeBulVeyaAt();							//yani calisanListesi'nden cikar	
		 
	}													//GUI'de GUNCELLE diye dusunebiliriz
	


	public void bitenProjeleriDagit() {
		for(Proje tmp2 : projeListesi) {						//biten bütün projelerin elemanlarýný daðýt
			
			tmp2.bittiyseDagit();										
		}
	}
	

	
	
	public boolean projeBulVeyaAt() {														
			for(Calisan tmp3 : calisanListesi) {				//calisan listesindeki projesi olmayan herkesi 
				if(tmp3.getCalistigiProje() == null && tmp3.getMaas() !=0) {			//uygun projelere gönder,uygun proje bulunamazsa iþten at
					if(this.uygunProjeyeEkle(tmp3)) {			//ilgili calisana uygun proje var mi listede
						System.out.println("Uygun proje bulundu ve eklendi");
						//varsa o projeye ekle
					}
					else {
						this.istenAt(tmp3);	//yoksa isten at
						
					}
				}
			}
			return true;
	}
	

	public boolean uygunProjeyeEkle(Calisan cls) {
		
		for(Proje tmp2 : this.guncelProjeler()) {
			if(tmp2.girebilirMi(cls)) {
				tmp2.projeyeEkle(cls); 
				return true;						//uygun proje varsa elemaný projeye ekle ve true döndür
			}
		}
				
		return false;												
										
	}
	
	
	

	public boolean iseElemanAl (Calisan cls) {										//Calisan != þirket çalýþaný
		if( this.uygunProjeyeEkle(cls) && !(this.ayniIDliElemanVar(cls.getId()) ) ) {		
			calisanListesi.add(cls);											//zaten eleman degilse ve uygun bir projeye eklenebiliyorsa ekle ve
			cls.setGirisTarihi(today.format(formatter));						//calisan olarak al
			cls.pozisyonaGoreMaasBelirle();										//giris tarihi olarak fonksiyonun çaðrýldýðý aný set et
			System.out.println("Eklendi");
			return true;
		}																		
		else {
			System.out.println("Eklenilemedi");
			return false;
		}
	}
		
	
	public void istenAt (Calisan cls) {
		if(this.sirketElemaniMi(cls)) {
			cls.setCalistigiProje(null);
			cls.setGirisTarihi(null);					//artik sirket calisani olmayan kisi maas,giris tarihi,id ve projeye sahip olmamalý
			cls.setMaas(0);
			cls.setId(null);
			//calisanListesi.remove(cls);					//ve þirket çalýþanlarý listesinden çýkarýlmalý
			System.out.println(cls.getAd() + " adli Eleman isten atildi");
		}
	}
	
	public void istenAtID (String id) {
		if(this.ayniIDliElemanVar(id)) {
			Calisan tmp = this.elemanGetir(id);
			tmp.setCalistigiProje(null);
			tmp.setGirisTarihi(null);					//istenAt'in ID kullanilarak yapýlan hali, duruma gore ikisinden biri kullanilabilir
			tmp.setMaas(0);
			tmp.setId(null);
			//calisanListesi.remove(tmp);					
			System.out.println(tmp.getAd() + " adli Eleman isten atildi");
		}
	}
	
	
   
	public boolean projeYarat(String isim, String baslangic, String bitis, int min, int max,String id) {
		if(!(this.ayniIDliProjeVarMi(id))) {
		Proje p = new Proje(isim, baslangic, bitis, min,  max,id);
		projeListesi.add(p);
		//kullanicinin girdigi projeÝsmi,baslangic-bitis tarihi,min
		System.out.println("basari");
		return true;
		}																	//ve max calisabilecek eleman sayisi ve projeId'si ile
		else {																//bir proje yaratir,ayni ID'li proje varsa hata verir
			System.out.println("Ayni IDde bir proje zaten var");
			return false;
		}
	}
	
	public boolean projeBitir(String id) {
		String yesterday = today.minusDays(1).format(formatter);
		
		for(Proje prj : this.guncelProjeler()) {
			if(prj.getId().compareTo(id) == 0) {
				prj.setBitis(yesterday);
				prj.setRealBitis(today.minusDays(1));
				return true;
			}
		}
		return false;
	}
	
	
	public boolean programciOlarakAl(String ad, String soyad, String id) {		//4 iþe alma butonundan her birinin yaptigi gorevler
		Programci pro = new Programci(ad, soyad, id);
		if(this.iseElemanAl(pro))
			return true;
		return false;
	}
	
	public boolean yoneticiOlarakAl(String ad, String soyad, String id) {
		Yonetici yonet = new Yonetici(ad, soyad, id);
		if(this.iseElemanAl(yonet))
			return true;
		return false;
	}																		//kullanicinin girdigi ad,soyad ve id
																			//bilgileriyle calisanlarin constructorlari vasitasiyla
	public boolean tasarimciOlarakAl(String ad, String soyad, String id) {		//yeni bir eleman yaratilir ve program bu calisani ise almayi dener
		Tasarimci tasar = new Tasarimci(ad, soyad, id);						//sorun cikarsa "Eklenilemedi" yazdirilir.elemanin maasi 
		if(this.iseElemanAl(tasar))
			return true;
		return false;                                                       //basilan butona baglidir.ornegin yoneticiOlarakAl dediysek 
	}																		// ve ise alinabilirse maasi 10.000 lira olarak belirlenecektir
																			//ve ise giris tarihi bugün olacaktir
	public boolean analistOlarakAl(String ad, String soyad, String id) {
		Analist analist = new Analist(ad, soyad, id);
		if(this.iseElemanAl(analist))
			return true;
		return false;
	}
	
	public ArrayList<Proje> guncelProjeler(){
		ArrayList<Proje> guncelProjeler = new ArrayList<Proje>();
		for(Proje prj : projeListesi) {
			if(!(prj.projeBittiMi())){
				guncelProjeler.add(prj);							//yururlulukte olan ve gelecekte baslayacak olan projeleri döndürür
			}
		}
		return guncelProjeler;
	}
	
	
	public void guncelProjeListele() {
		for(Proje prj2 : this.guncelProjeler()) {
			System.out.println(prj2.getProjeÝsmi()+ "\n");				//yururlulukte olan ve gelecekte baslayacak projeleri listeler
		}
	}
	
	
	public void projeleriListele() {		
		for(Proje prj : projeListesi) {
			System.out.println(prj.getProjeÝsmi()+"\n");				//bitmis,yururlulukte olan ve gelecekteki projelerin hepsini gosterir
		}
	}
	
	public String calisanlariListele() {
		for(Calisan cls : calisanListesi) {
			if(cls.getMaas() != 0) {
			return cls.toString() + "\n";					//sirkette calisanlarin listesi
			}
		}
		return "";
	}


	public ArrayList<Calisan> getCalisanListesi() {
		return calisanListesi;
	}
	
	
	public boolean sirketElemaniMi(Calisan cls) {
		boolean ole = false;
		for(Calisan tmp: calisanListesi) {
			if(cls.getId().compareTo(tmp.getId()) == 0 && tmp.getMaas() != 0) {				
				ole = true;
				return ole;
			}
		}
		return ole;
	}
	
	
		
	public boolean ayniIDliProjeVarMi(String id) {
		boolean var = false;
		for(Proje tmp : this.guncelProjeler()) {
			if(tmp.getId().compareTo(id) == 0) {
				var = true;
			}
		}
		return var;
	}
	
	
	public boolean ayniIDliElemanVar(String id) {
		boolean var = false;
		for(Calisan tmp : calisanListesi) {
			if(tmp.getId().compareTo(id) == 0) {					//yazilan id calisanListesindeki bir elemanda bulunuyor mu ?
				var = true;
			}
		}
		return var;
	}


	public Calisan elemanGetir(String id) {
		for(Calisan tmp : calisanListesi) {
			if(id.compareTo(tmp.getId()) == 0) {
				return tmp;											//ilgili id'ye sahip calisani döndürür
			}
		}
		return null;
	}
	public ArrayList<Proje> getProjeListesi() {
		return projeListesi;
	}
	
	

	
	
	
	
}
