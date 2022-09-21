package intro;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		//değişken isimlendirmeleri camelCase kullanılır
		String ortaMetin = "Ilginizi cekebilir!";
		String altMetin = "Vade Suresi!";
		
		System.out.println(ortaMetin);
		
		//integer 
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDustumu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);			
		} else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);	
		}
		
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);	
		}
		
		//array
		
		String[] krediler = {"Hizli Kredi","Maasini Halkbanktan Alanlar","Mutlu Emekli"};  
		
		//System.out.println(krediler[0]);
		//System.out.println(krediler[1]);
		//System.out.println(krediler[2]);
		
		for (int i=0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
