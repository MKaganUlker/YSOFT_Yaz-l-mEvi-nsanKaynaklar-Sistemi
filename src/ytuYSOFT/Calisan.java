package ytuYSOFT;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calisan {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); ///03-06-2010 G›B› G›R›LMEL›
	LocalDate today = LocalDate.now();
	private String ad = null;
	private String soyad = null;
	private String id = null;
	private Proje calistigiProje = null;
	private int maas =0 ;
	private String gorev;
	private String girisTarihi ;	
	private LocalDate realGiris = null;
	
	
	
	

	public Calisan(String ad, String soyad, String id) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.id = id;
	}



	public void pozisyonaGoreMaasBelirle() {
		if(this.getGorev().compareTo("YONETICI") == 0) {
			this.setMaas(10000);
		}
		if(this.getGorev().compareTo("ANALIST") == 0) {
			this.setMaas(7000);
		}
		if(this.getGorev().compareTo("TASARIMCI") == 0) {
			this.setMaas(5000);
		}
		if(this.getGorev().compareTo("PROGRAMCI") == 0) {
			this.setMaas(6000);
		}
		
	}


	public boolean yoneticiMi() {
		if(this.getGorev().compareTo("YONETICI") == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getSoyad() {
		return soyad;
	}



	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public int getMaas() {
		return maas;
	}



	public void setMaas(int maas) {
		this.maas = maas;
	}



	public String getGirisTarihi() {
		return girisTarihi;
	}



	public void setGirisTarihi(String girisTarihi) {
		this.girisTarihi = girisTarihi;
	}



	public LocalDate getRealGiris() {
		return realGiris;
	}



	public void setRealGiris(LocalDate realGiris) {
		this.realGiris = realGiris;
	}

	public Proje getCalistigiProje() {
		return calistigiProje;
	}



	public void setCalistigiProje(Proje calistigiProje) {
		this.calistigiProje = calistigiProje;
	}



	public String getGorev() {
		return gorev;
	}



	public void setGorev(String gorev) {
		this.gorev = gorev;
	}



	@Override
	public String toString() {
		return "Calisan [ Ad=" + this.getAd() + ", Soyad=" + this.getSoyad() +  ", ID =" + id + ", Maas=" + maas + ", Gorev= " + gorev + ", Projesi ="+this.getCalistigiProje().getProje›smi()+ " ] " ;
	}


	


	
}
