package ytuYSOFT;

public class MainMethod {

	public static void main(String[] args) {
		
		
		
			Yonetim YSOFT = new Yonetim(); 
			
			YSOFT.projeYarat("s","03-05-2020", "06-06-2020", 0, 5, "sez");
			YSOFT.yoneticiOlarakAl("sez", "sez", "sez2");
			YSOFT.guncelProjeListele();
			YSOFT.tasarimciOlarakAl("sez", "sez", "sez3");
			YSOFT.guncelProjeListele();
			YSOFT.calisanlariListele();
	    
	    	
				
	}

}
