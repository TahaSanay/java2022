package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(); // sayiBulmaca methodunu olu�turarak Main nin i�erisine �a��d�k.
	}

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 4;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi bulundu: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi bulunamad�: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}