package ytuYSOFT;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Proje {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate today = LocalDate.now();
	
	private Calisan projeYoneticisi;
	private ArrayList <Calisan> projeGrubu = new ArrayList <Calisan>();		
	private String projeÝsmi;
	private String baslangic;
	private String bitis;
	private LocalDate realBaslangic;
	private LocalDate realBitis;
	private int MAX;
	private int MIN;
	private String id;
	

	public Proje(String projeÝsmi, String baslangic, String bitis, int min, int max, String id) {
		super();
		this.projeÝsmi = projeÝsmi;
		this.baslangic = baslangic;
		this.bitis = bitis;
		this.realBaslangic=LocalDate.parse(baslangic,formatter);
		this.realBitis=LocalDate.parse(bitis,formatter);
		this.MAX = max;
		this.MIN = min;
		this.id = id;
	}


	public void bittiyseDagit() {
		if(this.projeBittiMi()) {							//sadece proje bittiyse dagitabilir
			for(Calisan tmp : projeGrubu) {
				tmp.setCalistigiProje(null);
			}
		}
	}
	
	
	public boolean projeYururlulukteMi() {
		
		if(today.isAfter(realBaslangic) && today.isBefore(realBitis)) {			//proje bugün itibarý ile yürürlülükte mi?
			return true;
		}
		return false;
	}
	
	
	public boolean projeBittiMi() {								//proje bugünün tarihinden önceki bir zamanda mý sonlanmýþ?
																//ileri tarihli projeler bitti sayýlmýyor, "yürürlülükte degil" olarak
		if(this.projeYururlulukteMi()) {						//belirleniyorlar
			return false;
		}		
		if(today.isAfter(realBaslangic) && today.isAfter(realBitis)) {
			return true;
		}
		if(this.projeBaslamadi()) {
			return false;
		}
		
		return false;
	}
	
	public boolean projeBaslamadi() {
		if(today.isBefore(realBaslangic)) {
			return true;
		}
		return false;
	}
	
	
	
	
	public boolean girebilirMi(Calisan cls) {
		if(this.doluMu()) {
			//System.out.println(this.getProjeÝsmi()+" adli Projenin kapasitesi dolu" );	//proje grubunun kapasite doluysa baska eleman alimi yapilamaz
			return false;
		}
		
	//	else if(!(this.projeYururlulukteMi())) {
			//System.out.println("Proje yururlulukte degil");				//VARSAYIM Proje ancak bugün aktifse projeye eleman alimi yapilabilir
//			return false;												//bitmis veya gelecekte baslayacak olan projelere eleman alimi olmaz
	//	}
		
		
		else if(cls.yoneticiMi() && this.projeYoneticisi != null) {
			//System.out.println("Bu grubun zaten bir yoneticisi var!");	//VARSAYIM Halihazýrda yoneticisi olan bir projeye baska yonetici giremez
			return false;
		}
		
		else if(cls.getCalistigiProje() != null) {						//VARSAYIM Bir calisan max bir projede calisabilir
			//System.out.println("Calisan halihazýrda bir projede çalýþýyor! Ýsmi"+cls.getCalistigiProje().getProjeÝsmi());
			return false;
		}
					
		else {				
			return true;
		}
	}
	
		
	public void projeyeEkle(Calisan cls) {
		if(this.girebilirMi(cls)) {
			projeGrubu.add(cls);
			if(cls.yoneticiMi()) {					//projeye eklenen calisan yoneticiyse projenin yonetici olarak atanir
				this.setProjeYoneticisi(cls);
			}
		    cls.setCalistigiProje(this);			//Çalýþan projeye girebiliyorsa proje grubuna ekle 
		    System.out.println("Eklendi");
		}											//ve çalýþtýðý proje bilgisini set et	
		
		else {
			System.out.println("Eklenilemedi");
		}
	}
	
	
	public boolean doluMu() {
		if(!(this.getRealSize() == MAX)) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public boolean yeterliMi() {
		if(projeGrubu.size() < MIN) {
			return false;						//size < MIN durumunda ne yapýlmasý gerektigiyle alakali bir konsept,kod için hazirlanmadi
		}											
		else {
			return true;
		}		
	}
		
	
	public void setBaslangicBitis( String basla , String bit) { // 03-11-2020 gibi girilmeli
		this.baslangic = basla;
		this.bitis = bit;
	}
	
	
	
	
	public Calisan getProjeYoneticisi() {
		return projeYoneticisi;
	}
	public void setProjeYoneticisi(Calisan projeYoneticisi) {
		if(projeYoneticisi.yoneticiMi()) {						//ancak proje yoneticisi yapmak istedigin kisi bir yoneticiyse 
		this.projeYoneticisi = projeYoneticisi;					//proje yoneticisi olarak set edilebilir
		}
	}
	public ArrayList<Calisan> getProjeGrubu() {
		return projeGrubu;
	}
	public void setProjeGrubu(ArrayList<Calisan> projeGrubu) {
		this.projeGrubu = projeGrubu;
	}
	
	public int getMAX() {
		return MAX;
	}
	public void setMAX(int mAX) {
		MAX = mAX;
	}
	public int getMIN() {
		return MIN;
	}
	public void setMIN(int mIN) {
		MIN = mIN;
	}
	public String getProjeÝsmi() {
		return projeÝsmi;
	}
	public String getBaslangic() {
		return baslangic;
	}
	public void setBaslangic(String baslangic) {
		this.baslangic = baslangic;
	}
	public String getBitis() {
		return bitis;
	}
	public void setBitis(String bitis) {
		this.bitis = bitis;
	}

	public void setProjeÝsmi(String projeÝsmi) {
		this.projeÝsmi = projeÝsmi;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public LocalDate getRealBaslangic() {
		return realBaslangic;
	}


	public void setRealBaslangic(LocalDate realBaslangic) {
		this.realBaslangic = realBaslangic;
	}


	public LocalDate getRealBitis() {
		return realBitis;
	}
	
	public int getRealSize() {
		int i = 0;
		for(Calisan cls : this.getProjeGrubu()) {
			if(cls.getMaas() != 0) {
				i++;
			}
		}
		return i;
	}


	public void setRealBitis(LocalDate realBitis) {
		this.realBitis = realBitis;
	}
	
	
	
}
